package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Image;
import com.Pfe.ecommerce.Back_end.Models.LigneCommande;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LigneCommandeS {

    LigneCommande save(LigneCommande clt);
    LigneCommande modify(LigneCommande clt);
    void remove(long idClt);
    LigneCommande getById(long idClt);
    List<LigneCommande> getAll();
    List <LigneCommande> Find(String clt);
}
