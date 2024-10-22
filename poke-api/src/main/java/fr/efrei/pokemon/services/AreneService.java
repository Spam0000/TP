package fr.efrei.pokemon.services;

import fr.efrei.pokemon.models.Arene;
import fr.efrei.pokemon.repositories.AreneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreneService {

    @Autowired
    private AreneRepository areneRepository;

    public List<Arene> getAllArenes() {
        return areneRepository.findAll();
    }

    public Arene createArene(Arene arene) {
        return areneRepository.save(arene);
    }

    public Arene getAreneById(Long id) {
        return areneRepository.findById(id).orElse(null);
    }

    public void deleteArene(Long id) {
        areneRepository.deleteById(id);
    }
}
