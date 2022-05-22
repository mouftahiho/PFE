package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Commentaire;
import com.Pfe.ecommerce.Back_end.Models.Compte;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompteS {

    Compte save(Compte clt);
    Compte modify(Compte clt);
    void remove(long idClt);
    Compte getById(long idClt);
    List<Compte> getAll();
    List <Compte> Find(String clt);
}
