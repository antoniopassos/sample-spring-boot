package br.com.antoniopassos.ssb.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.antoniopassos.ssb.entities.Editora;

@Component
public class EditoraRepository {

	private Map<Long, Editora> repository = new HashMap<>();

	public void save(Editora obj) {
		repository.put(obj.getId(), obj);
	}

	public Editora findById(Long id) {
		Editora editora = repository.get(id);

		return editora;
	}

	public List<Editora> findAll() {
		List<Editora> lstEditoras = new ArrayList<>(repository.values());
		
		return lstEditoras;
	}
}
