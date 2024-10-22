package fr.efrei.pokemon.services;

import fr.efrei.pokemon.models.Ligue;
import fr.efrei.pokemon.repositories.LigueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigueService {

    @Autowired
    private LigueRepository ligueRepository;

    public List<Ligue> getAllLigues() {
        return ligueRepository.findAll();
    }

    public Ligue createLigue(Ligue ligue) {
        return ligueRepository.save(ligue);
    }

    public Ligue getLigueById(Long id) {
        return ligueRepository.findById(id).orElse(null);
    }

    public void deleteLigue(Long id) {
        ligueRepository.deleteById(id);
    }
}
