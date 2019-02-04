package sopra.projet.factorySleem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

import sopra.projet.factorySleem.model.Salle;
import sopra.projet.factorySleem.model.User;
import sopra.projet.factorySleem.repository.UserRepository;

@SpringBootApplication
public class FactorySleemSpringBootApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(FactorySleemSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = userRepository.findById("olivier").get();
//		user.setPassword(passwordEncoder.encode("olivier"));
//		userRepository.save(user);
		// RestTemplate restTemplate = new RestTemplate();
		// Salle[] t =
		// restTemplate.getForObject("http://localhost:8080/formation/rest/salle",
		// Salle[].class);
		// for (Salle s : t) {
		// System.out.println(s.getNumero() + " " + s.getNom());
		// }
	}
}
