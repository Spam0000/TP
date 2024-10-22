package fr.efrei.pokemon.services;

import fr.efrei.pokemon.models.Objet;
import fr.efrei.pokemon.repositories.ObjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjetService {

    @Autowired
    private ObjetRepository objetRepository;

    public List<Objet> getAllObjets() {
        return objetRepository.findAll();
    }

    public Objet createObjet(Objet objet) {
        return objetRepository.save(objet);
    }

    public Objet getObjetById(Long id) {
        return objetRepository.findById(id).orElse(null);
    }

    public void deleteObjet(Long id) {
        objetRepository.deleteById(id);
    }
}
