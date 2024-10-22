package fr.efrei.pokemon.controller;

import fr.efrei.pokemon.models.Objet;
import fr.efrei.pokemon.services.ObjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objet")
public class ObjetController {

    @Autowired
    private ObjetService objetService;

    @GetMapping
    public List<Objet> getAllObjets() {
        return objetService.getAllObjets();
    }

    @PostMapping
    public Objet createObjet(@RequestBody Objet objet) {
        return objetService.createObjet(objet);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Objet> getObjetById(@PathVariable Long id) {
        Objet objet = objetService.getObjetById(id);
        if (objet == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(objet);
    }

    @DeleteMapping("/{id}")
    public void deleteObjet(@PathVariable Long id) {
        objetService.deleteObjet(id);
    }
}
