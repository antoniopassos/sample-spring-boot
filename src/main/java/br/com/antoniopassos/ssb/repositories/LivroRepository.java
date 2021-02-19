package br.com.antoniopassos.ssb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.antoniopassos.ssb.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
