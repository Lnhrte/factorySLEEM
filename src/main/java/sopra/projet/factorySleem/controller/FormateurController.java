package sopra.projet.factorySleem.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sopra.projet.factorySleem.model.Formateur;
import sopra.projet.factorySleem.model.RessourcesHumaines;
import sopra.projet.factorySleem.repository.FormateurRepository;
import sopra.projet.factorySleem.repository.RessourcesHumainesRepository;

@Controller
@RequestMapping("/formateur")
public class FormateurController {

	@Autowired
	FormateurRepository formateurRepository;
	@Autowired
	RessourcesHumainesRepository ressourcesHumainesRepository;

	@RequestMapping("")
	public ModelAndView home() {
		return new ModelAndView("redirect:/formateur/");
	}

	@GetMapping("/")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("formateur/list", "formateur", formateurRepository.findAll());
		return modelAndView;
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam(name = "id", required = true) Long id) {
		ressourcesHumainesRepository.deleteById(id);
		return new ModelAndView("redirect:/formateur/");
	}

	 @GetMapping("/edit")
		public ModelAndView edit(@RequestParam(name = "id", required = true) Long id) {
			Optional<RessourcesHumaines> formateur = formateurRepository.findById(id);
			return goEdit((Formateur)formateur.orElse(null));
		}

		@GetMapping("/creation")
		public ModelAndView add() {
			Formateur formateur = formateurRepository.save(new Formateur());
			return goEdit(formateur);
		}

		private ModelAndView goEdit(@Valid Formateur formateur) {
			ModelAndView modelAndView = new ModelAndView("formateur/form", "formateur", formateur);
			return modelAndView;
		}

		@GetMapping("/save")
		private ModelAndView save(@Valid @ModelAttribute("formateur") Formateur formateur, BindingResult br) {
			System.out.println("avant"+formateur);
			if (br.hasErrors()) {
				System.out.println("pdt"+formateur);
				return goEdit(formateur);
			}
			formateurRepository.save(formateur);
			System.out.println("apres"+formateur);
			return new ModelAndView("redirect:/formateur/");
		}
		
}
