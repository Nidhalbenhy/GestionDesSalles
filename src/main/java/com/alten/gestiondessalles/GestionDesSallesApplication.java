package com.alten.gestiondessalles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class GestionDesSallesApplication implements CommandLineRunner {

	
	
	public static void main(String[] args) {
		SpringApplication.run(GestionDesSallesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
