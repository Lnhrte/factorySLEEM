package sopra.projet.factorySleem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sopra.projet.factorySleem.model.Gestionnaire;
import sopra.projet.factorySleem.model.Matiere;
import sopra.projet.factorySleem.model.Niveau;
import sopra.projet.factorySleem.repository.GestionnaireRepository;
import sopra.projet.factorySleem.repository.MatiereRepository;

@SpringBootApplication
public class FactorySleemSpringBootApplicationSekouly implements CommandLineRunner {

	@Autowired
	private GestionnaireRepository gestionnaireRepository;

	public static void main(String[] args) {
		SpringApplication.run(FactorySleemSpringBootApplicationSekouly.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Gestionnaire gestionnaire = new Gestionnaire("NOM", "Prénom", "12345");
//		gestionnaireRepository.save(gestionnaire);

		// User user = userRepository.findById("olivier").get();
		// user.setPassword(passwordEncoder.encode("olivier"));
		// userRepository.save(user);
		// RestTemplate restTemplate = new RestTemplate();
		// Salle[] t =
		// restTemplate.getForObject("http://localhost:8080/formation/rest/salle",
		// Salle[].class);
		// for (Salle s : t) {
		// System.out.println(s.getNumero() + " " + s.getNom());
		// }
	}
}
