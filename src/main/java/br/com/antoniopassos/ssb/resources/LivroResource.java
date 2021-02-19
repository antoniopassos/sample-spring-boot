package br.com.antoniopassos.ssb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.antoniopassos.ssb.entities.Livro;
import br.com.antoniopassos.ssb.repositories.LivroRepository;

@RestController
@RequestMapping(value = "/livros")
public class LivroResource {

	@Autowired
	private LivroRepository repository;

	@GetMapping
	public ResponseEntity<List<Livro>> findAll() {
		List<Livro> lstLivros = repository.findAll();

		return ResponseEntity.ok().body(lstLivros);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Livro> findById(@PathVariable Long id) {
		Livro editora = repository.findById(id).get();

		return ResponseEntity.ok().body(editora);
	}

}