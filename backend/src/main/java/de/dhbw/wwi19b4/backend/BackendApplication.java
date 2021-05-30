package de.dhbw.wwi19b4.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Hauptklasse um den Service zu starten
@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		System.out.println("starting ...");
		SpringApplication.run(BackendApplication.class, args);
	}

}
