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

//import com.fasterxml.jackson.annotation.JsonView;

import sopra.projet.factorySleem.model.Formation;
import sopra.projet.factorySleem.repository.FormationRepository;

@RestController
@RequestMapping("/rest/formation")
@CrossOrigin(origins= {"*"})
public class FormationRestController {
	
	@Autowired
	FormationRepository formationRepository;

	@GetMapping(path = { "", "/" })
//	@JsonView(JsonViews.Common.class)
	public ResponseEntity<List<Formation>> findAll() {
		return new ResponseEntity<>(formationRepository.findAllFormation(), HttpStatus.OK);
	}

	@PostMapping(path = { "", "/" })
	public ResponseEntity<Void> createFormation(@Valid @RequestBody Formation formation, BindingResult br,
			UriComponentsBuilder uCB) {
		ResponseEntity<Void> response = null;
		if (br.hasErrors()) {
			response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			formationRepository.save(formation);
			HttpHeaders header = new HttpHeaders();
			header.setLocation(uCB.path("/rest/formation/{id}").buildAndExpand(formation.getId()).toUri());
			response = new ResponseEntity<>(header, HttpStatus.CREATED);
		}
		return response;
	}

	@GetMapping(value = "/{id}")
//	@JsonView(JsonViews.Common.class)
	public ResponseEntity<Formation> findById(@PathVariable(name = "id") Long id) {
		Optional<Formation> opt = formationRepository.findById(id);
		ResponseEntity<Formation> response = null;
		if (opt.isPresent()) {
			response = new ResponseEntity<Formation>((Formation)opt.get(), HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return response;
	}

//	@JsonView(JsonViews.Common.class)
	@PutMapping(path = { "", "/" })
	public ResponseEntity<Formation> update(@Valid @RequestBody Formation formation, BindingResult br) {
		ResponseEntity<Formation> response = null;

		if (br.hasErrors() || formation.getId() == null) {
			response = new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
		} else {
			Optional<Formation> opt = formationRepository.findById(formation.getId());
			if (opt.isPresent()) {
				Formation formationEnBase = (Formation)opt.get();
				formationEnBase.setVersion(formation.getVersion());
				formationEnBase.setDateDebut(formation.getDateDebut());
				formationEnBase.setDateFin(formation.getDateFin());
				formationEnBase.setGestionnaire(formation.getGestionnaire());
				formationRepository.save(formationEnBase);
				response = new ResponseEntity<Formation>(formationEnBase, HttpStatus.OK);
			} else {
				response = new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
			}
		}
		return response;
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable(name = "id") Long id) {
		Optional<Formation> opt = formationRepository.findById(id);
		ResponseEntity<Void> response = null;
		if (opt.isPresent()) {
			formationRepository.deleteById(id);
			response = new ResponseEntity<>(HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return response;
	}
}
