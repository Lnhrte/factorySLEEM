package sopra.projet.factorySleem.restController;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import sopra.projet.factorySleem.model.Matiere;
import sopra.projet.factorySleem.repository.MatiereRepository;

@RestController
@RequestMapping("/matiere")
public class MatiereRestController {

	@Autowired
	MatiereRepository matiereRepository;

	@GetMapping(path = { "", "/" })
	public ResponseEntity<List<Matiere>> findAll() {
		return new ResponseEntity<>(matiereRepository.findAll(), HttpStatus.OK);
	}

	@PostMapping(path = { "", "/" })
	public ResponseEntity<Void> createMatiere(@Valid @RequestBody Matiere matiere, BindingResult br,
			UriComponentsBuilder uCB) {
		ResponseEntity<Void> response = null;
		if (br.hasErrors()) {
			response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			matiereRepository.save(matiere);
			HttpHeaders header = new HttpHeaders();
			header.setLocation(uCB.path("/matiere/{id}").buildAndExpand(matiere.getId()).toUri());
			response = new ResponseEntity<>(header, HttpStatus.CREATED);
		}
		return response;
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Matiere> findById(@PathVariable(name = "id") Long id) {
		Optional<Matiere> opt = matiereRepository.findById(id);
		ResponseEntity<Matiere> response = null;
		if (opt.isPresent()) {
			response = new ResponseEntity<Matiere>(opt.get(), HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return response;
	}

	@PutMapping(path = { "", "/" })
	public ResponseEntity<Matiere> update(@Valid @RequestBody Matiere matiere, BindingResult br) {
		ResponseEntity<Matiere> response = null;

		if (br.hasErrors() || matiere.getId() == 0) {
			response = new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
		} else {
			Optional<Matiere> opt = matiereRepository.findById(matiere.getId());
			if (opt.isPresent()) {
				Matiere matiereEnBase = opt.get();
				matiereEnBase.setTitre(matiere.getTitre());
				matiereRepository.save(matiereEnBase);
				response = new ResponseEntity<Matiere>(matiereEnBase, HttpStatus.OK);
			} else {
				response = new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
			}
		}
		return response;
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable(name = "id") Long id) {
		Optional<Matiere> opt = matiereRepository.findById(id);
		ResponseEntity<Void> response = null;
		if (opt.isPresent()) {
			matiereRepository.deleteById(id);
			response = new ResponseEntity<>(HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return response;
	}
}
