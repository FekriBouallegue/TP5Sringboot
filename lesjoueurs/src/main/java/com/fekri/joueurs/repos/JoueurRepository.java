package com.fekri.joueurs.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fekri.joueurs.entities.Equipe;
import com.fekri.joueurs.entities.Joueur;


@RepositoryRestResource(path = "rest")

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
	
	List<Joueur> findByNomJoueur(String nom);
	 List<Joueur> findByNomJoueurContains(String nom); 
	/* @Query("select p from Joueur p where p.nomJoueur like %?1 and p.age >?2")
		List<Joueur> findByNomage(String nom, Double age);*/
	 @Query("select p from Joueur p where p.nomJoueur like %:nom and p.age > :age")
	 List<Joueur> findByNomage (@Param("nom") String nom,@Param("age") Double age);
	 @Query("select p from Joueur p where p.equipe = ?1")
	 List<Joueur> findByEquipe (Equipe equipe );
	 List<Joueur> findByEquipeIdEquipe(Long id);
	 List<Joueur> findByOrderByNomJoueurAsc();
	 @Query("select p from Joueur p order by p.nomJoueur ASC, p.age DESC")
	 List<Joueur> trierJoueurNomsAge ();





}

