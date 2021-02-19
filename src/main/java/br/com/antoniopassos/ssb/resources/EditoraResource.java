package br.com.antoniopassos.ssb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.antoniopassos.ssb.entities.Editora;
import br.com.antoniopassos.ssb.repositories.EditoraRepository;

@RestController
@RequestMapping(value = "/editoras")
public class EditoraResource {

	@Autowired
	private EditoraRepository repository;

	@GetMapping
	public ResponseEntity<List<Editora>> findAll() {
		List<Editora> lstEditoras = repository.findAll();

		return ResponseEntity.ok().body(lstEditoras);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Editora> findById(@PathVariable Long id) {
		Editora editora = repository.findById(id).get();

		return ResponseEntity.ok().body(editora);
	}

}