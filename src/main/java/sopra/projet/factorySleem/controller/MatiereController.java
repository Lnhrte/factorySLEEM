package sopra.projet.factorySleem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sopra.projet.factorySleem.repository.MatiereRepository;

@Controller
@RequestMapping("/matiere")
public class MatiereController {

	@Autowired
	MatiereRepository matiereRepository;

	@GetMapping("/")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("matiere/list", "matieres", matiereRepository.findAll());
		return modelAndView;
	}

}
