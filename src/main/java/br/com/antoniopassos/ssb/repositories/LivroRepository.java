package br.com.antoniopassos.ssb.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.antoniopassos.ssb.entities.Livro;

@Component
public class LivroRepository {

	private Map<Long, Livro> repository = new HashMap<>();

	public void save(Livro obj) {
		repository.put(obj.getId(), obj);
	}

	public Livro findById(Long id) {
		Livro editora = repository.get(id);

		return editora;
	}

	public List<Livro> findAll() {
		List<Livro> lstLivros = new ArrayList<>(repository.values());
		
		return lstLivros;
	}
}
