package fr.efrei.pokemon.services;

import fr.efrei.pokemon.models.Combat;
import fr.efrei.pokemon.repositories.CombatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombatService {

    @Autowired
    private CombatRepository combatRepository;

    public List<Combat> getAllCombats() {
        return combatRepository.findAll();
    }

    public Combat createCombat(Combat combat) {
        return combatRepository.save(combat);
    }

    public Combat getCombatById(Long id) {
        return combatRepository.findById(id).orElse(null);
    }

    public void deleteCombat(Long id) {
        combatRepository.deleteById(id);
    }
}
