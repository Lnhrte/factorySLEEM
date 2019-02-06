package sopra.projet.factorySleem.controller; 
 
import javax.validation.Valid; 
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller; 
import org.springframework.validation.BindingResult; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.ModelAttribute; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.servlet.ModelAndView; 
 
import sopra.projet.factorySleem.model.Ordinateur; 
import sopra.projet.factorySleem.model.RessourcesMaterielles; 
import sopra.projet.factorySleem.model.VideoProjecteur; 
import sopra.projet.factorySleem.repository.OrdinateurRepository; 
import sopra.projet.factorySleem.repository.RessourcesMateriellesRepository; 
import sopra.projet.factorySleem.repository.SalleRepository; 
import sopra.projet.factorySleem.repository.VideoProjecteurRepository; 
 
@Controller 
@RequestMapping("/ressourcesMaterielles") 
public class RessourcesMateriellesController { 
 
	@Autowired 
	RessourcesMateriellesRepository ressourcesMateriellesRepository; 
	@Autowired 
	OrdinateurRepository ordinateurRepository; 
	@Autowired 
	VideoProjecteurRepository videoProjecteurRepository; 
	@Autowired 
	SalleRepository salleRepository; 
 
	@GetMapping("/") 
	public ModelAndView list() { 
		ModelAndView modelAndView = new ModelAndView("ressourcesMaterielles/list", "ressourcesMaterielles", 
				ressourcesMateriellesRepository.findAll()); 
		return modelAndView; 
	} 
 
	@GetMapping("/delete") 
	public ModelAndView delete(@RequestParam(name = "code", required = true) String code) { 
		ressourcesMateriellesRepository.deleteById(code); 
		return new ModelAndView("redirect:/ressourcesMaterielles/"); 
	} 
 
	// @GetMapping("/add") 
	// public ModelAndView saveFormateur(@Valid 
	// @ModelAttribute("ressourcesHumaines") Formateur formateur, 
	// BindingResult br) { 
	// if (br.hasErrors()) { 
	// return edit(formateur.getId()); 
	// } 
	// formateurRepository.save(formateur); 
	// return new ModelAndView("redirect:/ressourcesHumaines/"); 
	// } 
 
	@GetMapping("/ordinateur/creation") 
	public ModelAndView addOrdinateur() { 
		Ordinateur ordinateur = ordinateurRepository.save(new Ordinateur()); 
		return goEdit(ordinateur); 
	} 
 
	@GetMapping("/videoProjecteur/creation") 
	public ModelAndView addVideoProjecteur() { 
		VideoProjecteur videoProjecteur = videoProjecteurRepository.save(new VideoProjecteur()); 
		return goEdit(videoProjecteur); 
	} 
 
	private ModelAndView goEdit(@Valid RessourcesMaterielles rm) { 
		ModelAndView modelAndView = new ModelAndView("ressourcesMaterielles/form", "ressourcesMaterielles", rm); 
		return modelAndView; 
	} 
 
	@GetMapping("/save") 
	private ModelAndView save(@Valid @ModelAttribute("ressourcesMaterielles") RessourcesMaterielles rm, 
			BindingResult br) { 
		if (br.hasErrors()) { 
			return goEdit(rm); 
		} 
		ressourcesMateriellesRepository.save(rm); 
		return new ModelAndView("redirect:/ressourcesMaterielles/"); 
	} 
 
} 
