////package sopra.projet.factorySleem;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.boot.CommandLineRunner;
////import org.springframework.boot.SpringApplication;
////import org.springframework.boot.autoconfigure.SpringBootApplication;
////import org.springframework.security.crypto.password.PasswordEncoder;
////import org.springframework.web.client.RestTemplate;
////
////import sopra.projet.factorySleem.model.Ordinateur;
////import sopra.projet.factorySleem.model.Salle;
////import sopra.projet.factorySleem.model.User;
////import sopra.projet.factorySleem.repository.UserRepository;
////
////@SpringBootApplication
////public class FactorySleemSpringBootApplicationElodie implements CommandLineRunner {
////
//////	@Autowired
//////	private PasswordEncoder passwordEncoder;
////
////	public static void main(String[] args) {
////		SpringApplication.run(FactorySleemSpringBootApplicationElodie.class, args);
////	}
////
////	@Override
////	public void run(String... args) throws Exception {
////// Ordinateur ordinateur1 = new Ordinateur("123ordi1", 20, "processeurordi1", 14, 78, anneeAchat)
////		Salle salle1 = 
////	}
////}
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import sopra.projet.factorySleem.model.Salle;
//import sopra.projet.factorySleem.repository.RessourcesMateriellesRepository;
//
//@SpringBootApplication
//public class FactorySleemSpringBootApplicationElodie implements CommandLineRunner {
//
////	@Autowired
////	private PasswordEncoder passwordEncoder;
//
//	@Autowired
//	RessourcesMateriellesRepository ressourcesMateriellesRepository;
//	
//	public static void main(String[] args) {
//		SpringApplication.run(FactorySleemSpringBootApplicationElodie.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//// Ordinateur ordinateur1 = new Ordinateur("123ordi1", 20, "processeurordi1", 14, 78, anneeAchat)
//		Salle salle1 = new Salle("1Salle1", 23, 10);
//		ressourcesMateriellesRepository.save(salle1);
//	}
//}
