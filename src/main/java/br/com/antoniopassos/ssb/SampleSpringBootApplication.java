package br.com.antoniopassos.ssb;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.antoniopassos.ssb.entities.Editora;
import br.com.antoniopassos.ssb.entities.Livro;
import br.com.antoniopassos.ssb.repositories.EditoraRepository;
import br.com.antoniopassos.ssb.repositories.LivroRepository;

@SpringBootApplication
public class SampleSpringBootApplication implements CommandLineRunner {

	@Autowired
	private EditoraRepository editoraRepository;

	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Editora editora01 = new Editora(1L, "Sextante");
		Editora editora02 = new Editora(2L, "Companhia das Letras");

		Livro livro01 = new Livro(1L, "Os segredos da mente milionária", 176, editora01);
		Livro livro02 = new Livro(2L, "A coragem de ser imperfeito", 208, editora01);
		Livro livro03 = new Livro(3L, "Essencialismo", 272, editora01);

		Livro livro04 = new Livro(4L, "1984", 416, editora02);
		Livro livro05 = new Livro(5L, "O menino do pijama listrado", 192, editora02);
		Livro livro06 = new Livro(6L, "O gene", 680, editora02);
		Livro livro07 = new Livro(7L, "A revolução dos bichos", 152, editora02);

		editora01.getLstLivros().addAll(Arrays.asList(livro01, livro02, livro03));
		editora02.getLstLivros().addAll(Arrays.asList(livro04, livro05, livro06, livro07));

		editoraRepository.save(editora01);
		editoraRepository.save(editora02);

		livroRepository.save(livro01);
		livroRepository.save(livro02);
		livroRepository.save(livro03);
		livroRepository.save(livro04);
		livroRepository.save(livro05);
		livroRepository.save(livro06);
		livroRepository.save(livro07);

	}

}
