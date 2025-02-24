package com.br.bryan.fipe_data_api;

import com.br.bryan.fipe_data_api.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FipeDataApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FipeDataApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
