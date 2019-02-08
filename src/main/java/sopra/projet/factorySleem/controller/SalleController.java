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

import sopra.projet.factorySleem.model.RessourcesMaterielles;
import sopra.projet.factorySleem.model.Salle;
import sopra.projet.factorySleem.repository.SalleRepository;

@Controller
@RequestMapping("/salle")
public class SalleController {

	@Autowired
	SalleRepository salleRepository;

	@RequestMapping("")
	public ModelAndView home() {
		return new ModelAndView("redirect:/salle/");
	}

	@GetMapping("/")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("salle/list", "salles", salleRepository.findAllSalle());
		return modelAndView;
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam(name = "code", required = true) String code) {
		salleRepository.deleteById(code);
		return new ModelAndView("redirect:/salle/");
	}

	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam(name = "code", required = true) String code) {
		Optional<RessourcesMaterielles> salle = salleRepository.findById(code);
		return goEdit((@Valid Salle) salle.orElse(null));
	}

	@GetMapping("/add")
	public ModelAndView add() {
		Salle salle = salleRepository.save(new Salle());
		return goEdit(salle);
	}

	private ModelAndView goEdit(@Valid Salle salle) {
		ModelAndView modelAndView = new ModelAndView("salle/edit", "salle", salle);
		return modelAndView;
	}

	@GetMapping("/save")
	private ModelAndView save(@Valid @ModelAttribute("salle") Salle salle, BindingResult br) {
		if (br.hasErrors()) {
			return goEdit(salle);
		}
		salleRepository.save(salle);
		return new ModelAndView("redirect:/salle/");
	}
}
