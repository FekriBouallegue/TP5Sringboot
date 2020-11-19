package com.fekri.joueurs;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.fekri.joueurs.entities.Equipe;
import com.fekri.joueurs.entities.Joueur;
import com.fekri.joueurs.repos.JoueurRepository;
import com.fekri.joueurs.service.JoueurService;

@SpringBootTest
class LesjoueursApplicationTests {

	@Autowired
	private JoueurRepository joueurRepository;
	@Autowired
	private JoueurService joueurService;
	@Test
	public void testCreateJoueur() {
	Joueur joues = new Joueur("iskander","Bouallegue",new Date(),"allier",18);
	joueurRepository.save(joues);
	}
	 @Test
	 public void testFindJoueur()
	 {
	 Joueur p = joueurRepository.findById(2L).get();
	 System.out.println(p);
	 }

	@Test
	public void testUpdateJoueur()
	{
	Joueur p = joueurRepository.findById(1L).get();
	p.setAge(30);
	joueurRepository.save(p);
	}
	@Test
	public void testDeleteJoueur()
	{
		joueurRepository.deleteById(1L);;
		}
	@Test
	public void testfindAllJoueurs()
	{
	List<Joueur> joues = joueurRepository.findAll();
	for (Joueur p : joues)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNomJoueurContains()
	 {
		Page<Joueur>  joues = joueurService.getAllJoueursParPage(0,2);
		System.out.println(joues.getSize());
		System.out.println(joues.getTotalElements());
		System.out.println(joues.getTotalPages());
		
		joues.getContent().forEach(p -> {System.out.println(p.toString());
		                                 });	
		
	 }
	@Test
	 public void findByNomJoueur()
	{
		List<Joueur> joues = joueurRepository.findByNomJoueur("Fekri");
		for (Joueur p : joues)
		{
		System.out.println(p);
		}
		}
	@Test
	 public void findByNomJoueurContains()
	{
		List<Joueur> joues = joueurRepository.findByNomJoueurContains("F");
		for (Joueur p : joues)
		{
		System.out.println(p);
		}
		}
	@Test
	public void findByNomage()
	{
	List<Joueur> joues = joueurRepository.findByNomage("Fekri", 20.0);
	for (Joueur p : joues)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void findByEquipe()
	{
	Equipe eq = new Equipe();
	eq.setIdEquipe(1L);
	List<Joueur> prods = joueurRepository.findByEquipe(eq);
	for (Joueur p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void findByEquipeIdEquipe()
	{
	List<Joueur> prods = joueurRepository.findByEquipeIdEquipe(1L);
	for (Joueur p : prods)
	{
	System.out.println(p);
	}
	 }
	@Test
	public void testfindByOrderByNomJoueurAsc()
	{
			List<Joueur> prods =joueurRepository.findByOrderByNomJoueurAsc();
			for (Joueur p : prods)
			{
				System.out.println(p);
			}
		}
		
	@Test
	public void testTrierJoueurNomsAge()
	{
	List<Joueur> prods = joueurRepository.trierJoueurNomsAge();
	for (Joueur p : prods)
	{
	System.out.println(p);
	}
	}

	




	
	}