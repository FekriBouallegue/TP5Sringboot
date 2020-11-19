package com.fekri.joueurs.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
	public class Equipe {
	
	@javax.persistence.Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long idEquipe;
		private String Nomeq;
		private String CountryEq;
		
		@JsonIgnore
		@OneToMany(mappedBy = "equipe")
		private List<Joueur> joueurs;

		
		
		
		
		

}
