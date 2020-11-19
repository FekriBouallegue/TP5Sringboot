package com.fekri.joueurs;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fekri.joueurs.entities.Joueur;
import com.fekri.joueurs.service.JoueurService;

@SpringBootApplication
public class LesjoueursApplication implements CommandLineRunner {
	@Autowired
	JoueurService joueurService ;

	public static void main(String[] args) {
		SpringApplication.run(LesjoueursApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		
	}

}
