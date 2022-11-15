package br.edu.unifacisa.lojaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.unifacisa.lojaspring.service.BootstrapService;

@SpringBootApplication
public class LojaspringbackApplication implements ApplicationRunner {
	@Autowired
	private BootstrapService bootstrap;
	
	public static void main(String[] args) {
		SpringApplication.run(LojaspringbackApplication.class, args);
	}

	/**
	 * Esse método será chamado quando a aplicação for inicializada
	 */
	@Override
	public void run(ApplicationArguments args) throws Exception {
		bootstrap.boot();
	}
}
