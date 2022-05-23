package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Image;
import com.Pfe.ecommerce.Back_end.Models.LigneCommande;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LigneCommandeS {

    LigneCommande save(LigneCommande lc);
    LigneCommande modify(LigneCommande lc);
    void remove(long idLc);
    LigneCommande getById(long idLc);
    List<LigneCommande> getAll();
}
