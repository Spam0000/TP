package fr.efrei.pokemon.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ligue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String niveau;

    @OneToMany
    private List<Trainer> dresseurs;

    // Getters and setters
}
