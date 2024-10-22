package fr.efrei.pokemon.controller;

import fr.efrei.pokemon.models.Ligue;
import fr.efrei.pokemon.services.LigueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ligue")
public class LigueController {

    @Autowired
    private LigueService ligueService;

    @GetMapping
    public List<Ligue> getAllLigues() {
        return ligueService.getAllLigues();
    }

    @PostMapping
    public Ligue createLigue(@RequestBody Ligue ligue) {
        return ligueService.createLigue(ligue);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ligue> getLigueById(@PathVariable Long id) {
        Ligue ligue = ligueService.getLigueById(id);
        if (ligue == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ligue);
    }

    @DeleteMapping("/{id}")
    public void deleteLigue(@PathVariable Long id) {
        ligueService.deleteLigue(id);
    }
}
