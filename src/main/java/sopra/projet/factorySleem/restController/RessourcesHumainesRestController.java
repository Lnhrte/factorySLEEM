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

import sopra.projet.factorySleem.model.RessourcesHumaines;
import sopra.projet.factorySleem.repository.RessourcesHumainesRepository;

@RestController
@RequestMapping("/rest/ressourcesHumaines/")
@CrossOrigin(origins = { "*" })
public class RessourcesHumainesRestController {
	@Autowired
	RessourcesHumainesRepository ressourcesHumainesRepository;

	@GetMapping(path = { "", "/" })
	public ResponseEntity<List<RessourcesHumaines>> findAll() {
		return new ResponseEntity<>(ressourcesHumainesRepository.findAll(), HttpStatus.OK);
	}

	@PostMapping(path = { "", "/" })
	public ResponseEntity<Void> createRessourcesHumaines(@Valid @RequestBody RessourcesHumaines ressourcesHumaines,
			BindingResult br, UriComponentsBuilder uCB) {
		ResponseEntity<Void> response = null;
		if (br.hasErrors()) {
			response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			ressourcesHumainesRepository.save(ressourcesHumaines);
			HttpHeaders header = new HttpHeaders();
			header.setLocation(uCB.path("/rest/ressourcesHumaines/{id}").buildAndExpand(ressourcesHumaines.getId()).toUri());
			response = new ResponseEntity<>(header, HttpStatus.CREATED);
		}
		return response;
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<RessourcesHumaines> findById(@PathVariable(name = "id") Long id) {
		Optional<RessourcesHumaines> opt = ressourcesHumainesRepository.findById(id);
		ResponseEntity<RessourcesHumaines> response = null;
		if (opt.isPresent()) {
			response = new ResponseEntity<RessourcesHumaines>((RessourcesHumaines) opt.get(), HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return response;
	}
	
	@GetMapping(value = "/{type}")
	public ResponseEntity<RessourcesHumaines> findByType(@PathVariable(name = "type") String type) {
		Optional<RessourcesHumaines> opt = ressourcesHumainesRepository.findByType(type);
		ResponseEntity<RessourcesHumaines> response = null;
		if (opt.isPresent()) {
			response = new ResponseEntity<RessourcesHumaines>((RessourcesHumaines) opt.get(), HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return response;
	}

	@PutMapping(path = { "", "/" })
	public ResponseEntity<RessourcesHumaines> update(@Valid @RequestBody RessourcesHumaines ressourcesHumaines,
			BindingResult br) {
		ResponseEntity<RessourcesHumaines> response = null;

		if (br.hasErrors() || ressourcesHumaines.getId() == 0) {
			response = new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
		} else {
			Optional<RessourcesHumaines> opt = ressourcesHumainesRepository.findById(ressourcesHumaines.getId());
			if (opt.isPresent()) {
				RessourcesHumaines ressourcesHumainesEnBase = (RessourcesHumaines) opt.get();
				ressourcesHumainesEnBase.setPrenom(ressourcesHumaines.getPrenom());
				ressourcesHumainesEnBase.setNom(ressourcesHumaines.getNom());
				ressourcesHumainesEnBase.setAdresse(ressourcesHumaines.getAdresse());
				ressourcesHumainesRepository.save(ressourcesHumainesEnBase);
				response = new ResponseEntity<RessourcesHumaines>(ressourcesHumainesEnBase, HttpStatus.OK);
			} else {
				response = new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
			}
		}
		return response;
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable(name = "id") Long id) {
		Optional<RessourcesHumaines> opt = ressourcesHumainesRepository.findById(id);
		ResponseEntity<Void> response = null;
		if (opt.isPresent()) {
			ressourcesHumainesRepository.deleteById(id);
			response = new ResponseEntity<>(HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return response;
	}
}
