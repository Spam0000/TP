package fr.efrei.pokemon.models;

import javax.persistence.*;

@Entity
public class Arene {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ville;

    @ManyToOne
    private Trainer champion;

    private String typePokemon;

    // Getters and setters
}
