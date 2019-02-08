package sopra.projet.factorySleem.controller;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

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
import sopra.projet.factorySleem.model.FormateurMatiere;
import sopra.projet.factorySleem.model.Matiere;
import sopra.projet.factorySleem.model.Module;
import sopra.projet.factorySleem.model.RessourcesHumaines;
import sopra.projet.factorySleem.repository.FormateurMatiereRepository;
import sopra.projet.factorySleem.repository.FormateurRepository;
import sopra.projet.factorySleem.repository.MatiereRepository;
import sopra.projet.factorySleem.repository.RessourcesHumainesRepository;

@Controller
@RequestMapping("/formateur")
public class FormateurController {

	@Autowired
	FormateurRepository formateurRepository;
	@Autowired
	RessourcesHumainesRepository ressourcesHumainesRepository;
	@Autowired
	MatiereRepository matiereRepository;
	@Autowired
	FormateurMatiereRepository formateurmatiereRepository;

	@RequestMapping("")
	public ModelAndView home() {
		return new ModelAndView("redirect:/formateur/");
	}

	@GetMapping("/")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("formateur/list", "formateur", formateurRepository.findAllFormateur());
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
		
		@GetMapping("/matiere")
		public ModelAndView listMatiere(@RequestParam(name = "id", required = true) Long id) {
			Optional<RessourcesHumaines> formateur = formateurRepository.findById(id);
	        ArrayList<FormateurMatiere> matiere = formateurmatiereRepository.findByIdWithMatiere(id);
	        ArrayList<Long> idMatiere = new ArrayList<Long>();

			ModelAndView modelAndView = new ModelAndView("formateur/listMatiere", "matiere", formateur.orElse(null));
			modelAndView.addObject("matiere", matiere);
			modelAndView.addObject("idMatiere", idMatiere);
			return modelAndView;
		}
		
		@GetMapping("/matiere/creation")
		public ModelAndView addMatiere() {
			Matiere matiere = matiereRepository.save(new Matiere());
			return goEditMatiere(matiere);
		}

		private ModelAndView goEditMatiere(@Valid Matiere matiere) {
			ModelAndView modelAndView = new ModelAndView("formateur/editMatiere", "matiere", matiere);
			return modelAndView;
		}

		@GetMapping("/matiere/save")
		private ModelAndView saveMatiere(@Valid @ModelAttribute("matiere") Matiere matiere, BindingResult br) {
			System.out.println("avant"+matiere);
			if (br.hasErrors()) {
				System.out.println("pdt"+matiere);
				return goEditMatiere(matiere);
			}
			matiereRepository.save(matiere);
			System.out.println("apres"+matiere);
			return new ModelAndView("redirect:/formateur/");
		}
		
}
