package com.fekri.joueurs.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomJoue", types = { Joueur.class })
public interface JoueurProjection {
public String getNomJoueur();
}
