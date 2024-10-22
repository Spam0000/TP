package fr.efrei.pokemon.controller;

import fr.efrei.pokemon.models.Arene;
import fr.efrei.pokemon.services.AreneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arene")
public class AreneController {

    @Autowired
    private AreneService areneService;

    @GetMapping
    public List<Arene> getAllArenes() {
        return areneService.getAllArenes();
    }

    @PostMapping
    public Arene createArene(@RequestBody Arene arene) {
        return areneService.createArene(arene);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Arene> getAreneById(@PathVariable Long id) {
        Arene arene = areneService.getAreneById(id);
        if (arene == null)
