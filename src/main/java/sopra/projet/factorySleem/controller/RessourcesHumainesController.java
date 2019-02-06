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
import sopra.projet.factorySleem.model.Stagiaire;
import sopra.projet.factorySleem.repository.AdministrateurRepository;
import sopra.projet.factorySleem.repository.FormateurRepository;
import sopra.projet.factorySleem.repository.GestionnaireRepository;
import sopra.projet.factorySleem.repository.RessourcesHumainesRepository;
import sopra.projet.factorySleem.repository.StagiaireRepository;
import sopra.projet.factorySleem.repository.TechnicienRepository;

@Controller
@RequestMapping("/ressourcesHumaines")
public class RessourcesHumainesController {

	@Autowired
	RessourcesHumainesRepository ressourcesHumainesRepository;
	@Autowired
	AdministrateurRepository administrateurRepository;
	@Autowired
	GestionnaireRepository gestionnaireRepository;
	@Autowired
	TechnicienRepository technicienRepository;
	@Autowired
	FormateurRepository formateurRepository;
	@Autowired
	StagiaireRepository stagiaireRepository;

	@GetMapping("/")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("ressourceHumaine/list", "ressourcesHumaines",
				ressourcesHumainesRepository.findAll());
		return modelAndView;
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam(name = "id", required = true) Long id) {
		ressourcesHumainesRepository.deleteById(id);
		return new ModelAndView("redirect:/ressourcesHumaines/");
	}

	@GetMapping("/edit")
	public ModelAndView editFormateur(@RequestParam(name = "id", required = true) Long id) {
		Optional<RessourcesHumaines> rh = ressourcesHumainesRepository.findById(id);
		return goEdit(rh.orElse(null));
	}
	
//	@GetMapping("/stagiaires/edit")
//	public ModelAndView editStagiaire(@RequestParam(name = "id", required = true) Long id) {
//		Optional<RessourcesHumaines> stagiare = stagiaireRepository.findById(id);
//		return goEdit(stagiare.orElse(null));
//	}


//	@GetMapping("/add")
//	public ModelAndView saveFormateur(@Valid @ModelAttribute("ressourcesHumaines") Formateur formateur,
//			BindingResult br) {
//		if (br.hasErrors()) {
//			return edit(formateur.getId());
//		}
//		formateurRepository.save(formateur);
//		return new ModelAndView("redirect:/ressourcesHumaines/");
//	}

	@GetMapping("/formateurs/creation")
	public ModelAndView addFormateur() {
		Formateur formateur = formateurRepository.save(new Formateur());
		return goEdit(formateur);
	}

	@GetMapping("/stagiaires/creation")
	public ModelAndView addStagiaire() {
		Stagiaire stagiare = stagiaireRepository.save(new Stagiaire());
		return goEdit(stagiare);
	}

	private ModelAndView goEdit(@Valid RessourcesHumaines rh) {
		ModelAndView modelAndView = new ModelAndView("ressourceHumaine/form", "ressourcesHumaines", rh);
		return modelAndView;
	}

	@GetMapping("/save")
	private ModelAndView save(@Valid @ModelAttribute("ressourcesHumaines") RessourcesHumaines rh, BindingResult br) {
		if (br.hasErrors()) {
			return goEdit(rh);
		}
		ressourcesHumainesRepository.save(rh);
		return new ModelAndView("redirect:/ressourcesHumaines/");
	}

}
