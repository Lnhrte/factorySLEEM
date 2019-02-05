package sopra.projet.factorySleem;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sopra.projet.factorySleem.model.Administrateur;
import sopra.projet.factorySleem.model.Adresse;
import sopra.projet.factorySleem.model.Coordonnees;
import sopra.projet.factorySleem.model.Formateur;
import sopra.projet.factorySleem.model.FormateurMatiere;
import sopra.projet.factorySleem.model.Formation;
import sopra.projet.factorySleem.model.Gestionnaire;
import sopra.projet.factorySleem.model.Matiere;
import sopra.projet.factorySleem.model.Module;
import sopra.projet.factorySleem.model.Niveau;
import sopra.projet.factorySleem.model.Ordinateur;
import sopra.projet.factorySleem.model.Salle;
import sopra.projet.factorySleem.model.Stagiaire;
import sopra.projet.factorySleem.model.Technicien;
import sopra.projet.factorySleem.model.VideoProjecteur;
import sopra.projet.factorySleem.repository.AdministrateurRepository;
import sopra.projet.factorySleem.repository.FormateurMatiereRepository;
import sopra.projet.factorySleem.repository.FormateurRepository;
import sopra.projet.factorySleem.repository.FormationRepository;
import sopra.projet.factorySleem.repository.GestionnaireRepository;
import sopra.projet.factorySleem.repository.MatiereRepository;
import sopra.projet.factorySleem.repository.ModuleRepository;
import sopra.projet.factorySleem.repository.OrdinateurRepository;
import sopra.projet.factorySleem.repository.SalleRepository;
import sopra.projet.factorySleem.repository.StagiaireRepository;
import sopra.projet.factorySleem.repository.TechnicienRepository;
import sopra.projet.factorySleem.repository.VideoProjecteurRepository;

@SpringBootApplication
public class FactorySleemSpringBootApplicationMira implements CommandLineRunner {

	@Autowired
	private FormateurRepository formateurRepository;
	
	@Autowired
	private MatiereRepository matiereRepository;
	
	@Autowired
	private OrdinateurRepository ordinateurRepository;
	
	@Autowired
	private VideoProjecteurRepository videoProjecteurRepository;
	
	@Autowired
	private SalleRepository salleRepository;
	
	@Autowired
	private AdministrateurRepository administrateurRepository;
	
	@Autowired
	private TechnicienRepository technicienRepository;
	
	@Autowired
	private GestionnaireRepository gestionnaireRepository;
	
	@Autowired
	private StagiaireRepository stagiaireRepository;

	@Autowired
	private FormationRepository formationRepository;
	
	@Autowired
	private ModuleRepository moduleRepository;
	
	@Autowired
	private FormateurMatiereRepository formateurMatiereRepository;
	
	

	public static void main(String[] args) {
		SpringApplication.run(FactorySleemSpringBootApplicationMira.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfAnnee = new SimpleDateFormat("yyyy");
		
		Adresse adresse = new Adresse(6, "rue rougemont", "75009", "paris", "france");
		Coordonnees coord = new Coordonnees("0612345678", "azfczdaz@gmail.com");
		
		
		Matiere matiere = new Matiere("Spring", 8, "être le boss", "être nul", "cours et tp", Niveau.DEBUTANT);
		matiereRepository.save(matiere);
		
		
		Formateur formateur = new Formateur("Martin", "Jacques", "hgdfvheg", sdf.parse("05/02/2019"), sdf.parse("20/02/2019"));
		formateur.setAdresse(adresse);
		formateur.setCoordonnees(coord);
		formateurRepository.save(formateur);
		
		
		Ordinateur ordi = new Ordinateur("ordi-7", 25, "i5", 8, 122, sdfAnnee.parse("1999"));
		ordinateurRepository.save(ordi);
		
		VideoProjecteur videopro = new VideoProjecteur("vidproj-6", 35);
		videoProjecteurRepository.save(videopro);
		
		Salle salle = new Salle("salle-6", 150, 20);
		salleRepository.save(salle);
		
		Administrateur admin = new Administrateur("Baron", "Lisa", "jhfjedfsv");
		admin.setAdresse(adresse);
		admin.setCoordonnees(coord);
		administrateurRepository.save(admin);
		
		Technicien tech = new Technicien("Toubassy", "Mira", "zejygdzefvze");
		tech.setAdresse(adresse);
		tech.setCoordonnees(coord);
		technicienRepository.save(tech);
		
		Gestionnaire gest = new Gestionnaire("Linhart", "Elodie", "zhdvjqzhdvqjhzb");
		gest.setAdresse(adresse);
		gest.setCoordonnees(coord);
		gestionnaireRepository.save(gest);
		
		Stagiaire stag = new Stagiaire("Bayet", "Lea", ordi);
		stag.setAdresse(adresse);
		stag.setCoordonnees(coord);
		stagiaireRepository.save(stag);
		
		Formation form = new Formation(sdf.parse("13/03/2019"), sdf.parse("11/10/2019"));
		form.setGestionnaire(gest);
		formationRepository.save(form);
		
		Module mod = new Module(sdf.parse("13/03/2019"), sdf.parse("13/03/2019"), salle, videopro);
		mod.setFormation(form);
		mod.setMatiere(matiere);
		moduleRepository.save(mod);
		
		FormateurMatiere fm = new FormateurMatiere();
		fm.setFormateur(formateur);
		fm.setMatiere(matiere);
		formateurMatiereRepository.save(fm);

	}
	
}
