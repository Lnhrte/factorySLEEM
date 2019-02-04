package sopra.projet.factorySleem.restController;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonView;

import sopra.projet.factorySleem.model.JsonViews;
import sopra.projet.factorySleem.model.Personne;
import sopra.projet.factorySleem.model.Stagiaire;
import sopra.projet.factorySleem.repository.StagiaireRepository;

@RestController
@RequestMapping("/rest/personne/stagiaire")
@CrossOrigin(origins= {"*"})
public class StagiaireRestController {
	
	@Autowired
	StagiaireRepository stagiaireRepository;

	@GetMapping(path = { "", "/" })
	@JsonView(JsonViews.Common.class)
	public ResponseEntity<List<Stagiaire>> findAll() {
		return new ResponseEntity<>(stagiaireRepository.findAllStagiaire(), HttpStatus.OK);
	}

	@PostMapping(path = { "", "/" })
	public ResponseEntity<Void> createStagiaire(@Valid @RequestBody Stagiaire stagiaire, BindingResult br,
			UriComponentsBuilder uCB) {
		ResponseEntity<Void> response = null;
		if (br.hasErrors()) {
			response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			stagiaireRepository.save(stagiaire);
			HttpHeaders header = new HttpHeaders();
			header.setLocation(uCB.path("/rest/stagiaire/{id}").buildAndExpand(stagiaire.getId()).toUri());
			response = new ResponseEntity<>(header, HttpStatus.CREATED);
		}
		return response;
	}

	@GetMapping(value = "/{id}")
	@JsonView(JsonViews.Common.class)
	public ResponseEntity<Stagiaire> findById(@PathVariable(name = "id") Integer id) {
		Optional<Personne> opt = stagiaireRepository.findById(id);
		ResponseEntity<Stagiaire> response = null;
		if (opt.isPresent()) {
			response = new ResponseEntity<Stagiaire>((Stagiaire)opt.get(), HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return response;
	}

	@JsonView(JsonViews.Common.class)
	@PutMapping(path = { "", "/" })
	public ResponseEntity<Stagiaire> update(@Valid @RequestBody Stagiaire stagiaire, BindingResult br) {
		ResponseEntity<Stagiaire> response = null;

		if (br.hasErrors() || stagiaire.getId() == null) {
			response = new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
		} else {
			Optional<Personne> opt = stagiaireRepository.findById(stagiaire.getId());
			if (opt.isPresent()) {
				Stagiaire stagiaireEnBase = (Stagiaire)opt.get();
				stagiaireEnBase.setPrenom(stagiaire.getPrenom());
				stagiaireEnBase.setNom(stagiaire.getNom());
				stagiaireEnBase.setAdresse(stagiaire.getAdresse());
				stagiaireRepository.save(stagiaireEnBase);
				response = new ResponseEntity<Stagiaire>(stagiaireEnBase, HttpStatus.OK);
			} else {
				response = new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
			}
		}
		return response;
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable(name = "id") Integer id) {
		Optional<Personne> opt = stagiaireRepository.findById(id);
		ResponseEntity<Void> response = null;
		if (opt.isPresent()) {
			stagiaireRepository.deleteById(id);
			response = new ResponseEntity<>(HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return response;
	}
}
