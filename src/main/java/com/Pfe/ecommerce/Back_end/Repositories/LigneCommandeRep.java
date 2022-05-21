package com.Pfe.ecommerce.Back_end.Repositories;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Models.LigneCommande;
import org.springframework.data.repository.CrudRepository;

public interface LigneCommandeRep extends CrudRepository<LigneCommande,Long> {
}
