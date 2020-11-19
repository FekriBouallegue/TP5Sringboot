package com.fekri.joueurs.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;



@Entity
public class Joueur {	
	@javax.persistence.Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idJoueur;
	private String nomJoueur;
	private String  prenomJoueur;
	private Date jourdesignature;
	private String posteJoueur ;
	private int age;
	@ManyToOne
	private Equipe equipe;
	
	
	public Joueur() {
		super();
	}
	
	
	public Joueur(String nomJoueur, String  prenomJoueur, Date jourdesignature,String posteJoueur,int age) {
		super();
		this.nomJoueur = nomJoueur;
		this.prenomJoueur = prenomJoueur;
		this.jourdesignature = jourdesignature;
		this.posteJoueur=posteJoueur;
		this.age=age ;
	}


	


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Long getIdJoueur() {
		return idJoueur;
	}


	public void setIdJoueur(Long idJoueur) {
		this.idJoueur = idJoueur;
	}


	public String getNomJoueur() {
		return nomJoueur;
	}


	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}


	public String getPrenomJoueur() {
		return prenomJoueur;
	}


	public void setPrenomJoueur(String prenomJoueur) {
		this.prenomJoueur = prenomJoueur;
	}


	public Date getjourdesignature() {
		return jourdesignature;
	}


	public void setjourdesignature(Date jourdesignature) {
		this.jourdesignature = jourdesignature;
	}


	public String getPosteJoueur() {
		return posteJoueur;
	}


	public void setPosteJoueur(String posteJoueur) {
		this.posteJoueur = posteJoueur;
	}


	@Override
	public String toString() {
		return "Joueur [idJoueur=" + idJoueur + ", nomJoueur=" + nomJoueur + ", prenomJoueur=" + prenomJoueur
				+ ", jourdesignature=" + jourdesignature + ", posteJoueur=" + posteJoueur + ", age=" + age + "]";
	}


	

	
	
	

}
