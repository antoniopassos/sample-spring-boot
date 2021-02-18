package br.com.antoniopassos.ssb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.antoniopassos.ssb.entities.Editora;
import br.com.antoniopassos.ssb.repositories.EditoraRepository;

@SpringBootApplication
public class SampleSpringBootApplication implements CommandLineRunner {
	
	@Autowired
	private EditoraRepository editoraRepository;

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Editora editora01 = new Editora(1L, "Sextante");
		Editora editora02 = new Editora(2L, "Companhia das Letras");

		editoraRepository.save(editora01);
		editoraRepository.save(editora02);
	}

}
