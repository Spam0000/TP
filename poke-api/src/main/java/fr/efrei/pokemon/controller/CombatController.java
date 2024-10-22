package fr.efrei.pokemon.controller;

import fr.efrei.pokemon.models.Combat;
import fr.efrei.pokemon.services.CombatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/combat")
public class CombatController {

    @Autowired
    private CombatService combatService;

    @GetMapping
    public List<Combat> getAllCombats() {
        return combatService.getAllCombats();
    }

    @PostMapping
    public Combat createCombat(@RequestBody Combat combat) {
        return combatService.createCombat(combat);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Combat> getCombatById(@PathVariable Long id) {
        Combat combat = combatService.getCombatById(id);
        if (combat == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(combat);
    }

    @DeleteMapping("/{id}")
    public void deleteCombat(@PathVariable Long id) {
        combatService.deleteCombat(id);
    }
}
