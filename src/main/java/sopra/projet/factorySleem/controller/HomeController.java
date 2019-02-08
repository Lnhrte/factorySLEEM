package sopra.projet.factorySleem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping("/")
	public String Home(Model model) {
		return "Home";
	}
	
	@RequestMapping("/HomeGestionnaire")
	public String HomeGestionnaire(Model model) {
		return "HomeGestionnaire";
	}
	
	@RequestMapping("/HomeFormateur")
	public String HomeFormateur(Model model) {
		return "HomeFormateur";
	}
}
