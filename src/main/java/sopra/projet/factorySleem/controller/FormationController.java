package sopra.projet.factorySleem.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

import sopra.projet.factorySleem.model.Formation;
import sopra.projet.factorySleem.model.Module;
import sopra.projet.factorySleem.repository.FormationRepository;
import sopra.projet.factorySleem.repository.ModuleRepository;

@Controller
@RequestMapping("/formation")
public class FormationController {

	@Autowired
	FormationRepository formationRepository;

	@Autowired
	ModuleRepository moduleRepository;

	@RequestMapping("")
	public ModelAndView home() {
		return new ModelAndView("redirect:/formation/");
	}

	@GetMapping("/")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("formation/list", "formations", formationRepository.findAll());
		return modelAndView;
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam(name = "id", required = true) Long id) {
		formationRepository.deleteById(id);
		return new ModelAndView("redirect:/formation/");
	}

	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam(name = "id", required = true) Long id) {
		Optional<Formation> formation = formationRepository.findById(id);
		return goEdit(formation.orElse(null));
	}

	@GetMapping("/add")
	public ModelAndView add() {
		Formation formation = formationRepository.save(new Formation());
		return goEdit(formation);
	}

	private ModelAndView goEdit(@Valid Formation formation) {
		ModelAndView modelAndView = new ModelAndView("formation/edit", "formation", formation);
		return modelAndView;
	}

	@GetMapping("/save")
	private ModelAndView save(@Valid @ModelAttribute("formation") Formation formation, BindingResult br) {
		if (br.hasErrors()) {
			return goEdit(formation);
		}
		formationRepository.save(formation);
		return new ModelAndView("redirect:/formation/");
	}

	@GetMapping("/planning")
	public ModelAndView planning(@RequestParam(name = "id", required = true) Long id) {
		Optional<Formation> formation = formationRepository.findById(id);
		ArrayList<Module> modules = moduleRepository.findByIdWithFormation(id);
		ArrayList<Long> dureesModules = new ArrayList<Long>();
		long dureeFormation = getDateDiff(formation.orElse(null).getDateDebut(), formation.orElse(null).getDateFin(),
				TimeUnit.DAYS);

		for (Module module : modules) {
			dureesModules.add(getDateDiff(module.getDateDebut(), module.getDateFin(), TimeUnit.DAYS));
		}

		ModelAndView modelAndView = new ModelAndView("formation/planning", "formation", formation.orElse(null));
		modelAndView.addObject("modules", modules);
		modelAndView.addObject("dureesModules", dureesModules);
		modelAndView.addObject("dureeFormation", dureeFormation);
		return modelAndView;
	}

	private long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
		long diffInMillies = date2.getTime() - date1.getTime();
		return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
	}
}