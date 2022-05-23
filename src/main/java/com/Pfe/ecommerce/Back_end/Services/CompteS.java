package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Commentaire;
import com.Pfe.ecommerce.Back_end.Models.Compte;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompteS {

    Compte save(Compte compte);
    Compte modify(Compte compte);
    void remove(long idCompte);
    Compte getById(long idCompte);
    List<Compte> getAll();
    //List <Compte> Find(String compte);
}
