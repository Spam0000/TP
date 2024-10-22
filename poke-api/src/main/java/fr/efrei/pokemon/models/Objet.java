package fr.efrei.pokemon.models;

import javax.persistence.*;

@Entity
public class Objet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private int prix;
    private int quantiteDisponible;

    // Getters and setters
}
