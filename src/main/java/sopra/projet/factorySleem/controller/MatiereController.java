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

import sopra.projet.factorySleem.model.Matiere;
import sopra.projet.factorySleem.repository.MatiereRepository;

@Controller
@RequestMapping("/matiere")
public class MatiereController {

	@Autowired
	MatiereRepository matiereRepository;

	@RequestMapping("")
	public ModelAndView home() {
		return new ModelAndView("redirect:/matiere/");
	}

	@GetMapping("/")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("matiere/list", "matieres", matiereRepository.findAll());
		return modelAndView;
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam(name = "id", required = true) Long id) {
		matiereRepository.deleteById(id);
		return new ModelAndView("redirect:/matiere/");
	}

	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam(name = "id", required = true) Long id) {
		Optional<Matiere> matiere = matiereRepository.findById(id);
		return goEdit(matiere.orElse(null));
	}

	@GetMapping("/add")
	public ModelAndView add() {
		Matiere matiere = matiereRepository.save(new Matiere());
		return goEdit(matiere);
	}

	private ModelAndView goEdit(@Valid Matiere matiere) {
		ModelAndView modelAndView = new ModelAndView("matiere/edit", "matiere", matiere);
		return modelAndView;
	}

	@GetMapping("/save")
	private ModelAndView save(@Valid @ModelAttribute("matiere") Matiere matiere, BindingResult br) {
		if (br.hasErrors()) {
			return goEdit(matiere);
		}
		matiereRepository.save(matiere);
		return new ModelAndView("redirect:/matiere/");
	}
}
