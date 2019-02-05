//package sopra.projet.factorySleem.controller;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import sopra.formation.formationSpringBoot.dao.DaoPersonne;
//import sopra.formation.formationSpringBoot.dao.DaoSalle;
//import sopra.projet.factorySleem.model.Formateur;
//import sopra.projet.factorySleem.model.Personne;
//import sopra.projet.factorySleem.model.Stagiaire;
//import sopra.projet.factorySleem.model.Titre;
//
//@Controller
//@RequestMapping("/personne")
//public class PersonneController {
//
//	@Autowired
//	private DaoPersonne daoPersonne;
//
//	@Autowired
//	private DaoSalle daoSalle;
//
//	@RequestMapping("")
//	public ModelAndView home() {
//		return new ModelAndView("redirect:/personne/");
//	}
//
//	@GetMapping("/")
//	public ModelAndView list() {
//		ModelAndView modelAndView = new ModelAndView("personne/list", "personnes", daoPersonne.findAll());
//		return modelAndView;
//	}
//
//	@GetMapping("/delete")
//	public ModelAndView delete(@RequestParam(name = "id", required = true) Integer id) {
//		daoPersonne.deleteByKey(id);
//		return new ModelAndView("redirect:/personne/");
//	}
//
//	@GetMapping("/edit")
//	public ModelAndView edit(@RequestParam(name = "id", required = true) Integer id) {
//		Personne p = daoPersonne.findByKey(id);
//		return goEdit(p);
//	}
//
//	@GetMapping("/addFormateur")
//	public ModelAndView addFormateur() {
//		return goEdit(new Formateur());
//	}
//
//	@GetMapping("addStagiaire")
//	public ModelAndView addStagiaire() {
//		return goEdit(new Stagiaire());
//	}
//
//	private ModelAndView goEdit(Personne p) {
//		ModelAndView modelAndView = new ModelAndView("personne/edit", "personne", p);
//		modelAndView.addObject("titres", Titre.values());
//		modelAndView.addObject("salles", daoSalle.findAll());
//		return modelAndView;
//	}
//
//	@GetMapping("/saveFormateur")
//	public ModelAndView saveFormateur(@Valid @ModelAttribute("personne") Formateur personne, BindingResult br) {
//		return save(personne, br);
//	}
//
//	@GetMapping("/saveStagiaire")
//	public ModelAndView saveStagiaire(@Valid @ModelAttribute("personne") Stagiaire personne, BindingResult br) {
//		return save(personne, br);
//	}
//
//	private ModelAndView save(Personne personne, BindingResult br) {
//		if (br.hasErrors()) {
//			return goEdit(personne);
//		}
//
//		if (personne.getSalle() != null && personne.getSalle().getNumero() == null) {
//			personne.setSalle(null);
//		}
//
//		if (personne.getId() == null) {
//			daoPersonne.create(personne);
//		} else {
//			daoPersonne.update(personne);
//		}
//		return new ModelAndView("redirect:/personne/");
//	}
//
//}
