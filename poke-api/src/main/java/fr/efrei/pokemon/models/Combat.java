package fr.efrei.pokemon.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Combat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Trainer dresseur1;

    @ManyToOne
    private Trainer dresseur2;

    @ManyToOne
    private Trainer vainqueur;

    private LocalDate date;

    private String statut;

    // Getters and setters
}
