package sopra.projet.factorySleem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sopra.projet.factorySleem.model.Administrateur;
import sopra.projet.factorySleem.model.Adresse;
import sopra.projet.factorySleem.model.Coordonnees;
import sopra.projet.factorySleem.model.RessourcesHumaines;
import sopra.projet.factorySleem.repository.RessourcesHumainesRepository;

@SpringBootApplication
public class FactorySleemSpringBootApplicationLisa implements CommandLineRunner {

//	@Autowired
//	private PasswordEncoder passwordEncoder;

	@Autowired
	private RessourcesHumainesRepository ressourcesHumainesRepository;

	public static void main(String[] args) {
		SpringApplication.run(FactorySleemSpringBootApplicationLisa.class, args);
	}

	public void run(String... args) throws Exception {

//		Adresse adr = new Adresse(5, "rougemont", "5648", "hell", "paris");
//		Coordonnees coor = new Coordonnees("02654642564","truc@bidule.com");
//		RessourcesHumaines rh = new Administrateur("Toubassy","Mira",adr,coor, "rgnqejongejn");
//		ressourcesHumainesRepository.save(rh);

		// User user = userRepository.findById("olivier").get();
		// user.setPassword(passwordEncoder.encode("olivier"));
		// userRepository.save(user);
		// RestTemplate restTemplate = new RestTemplate();
		// Salle[] t =
		// restTemplate.getForObject("http://localhost:8080/formation/rest/salle",
		// Salle[].class);
		// for (Salle s : t) {
		// System.out.println(s.getNumero() + " " + s.getNom());
	}
}
