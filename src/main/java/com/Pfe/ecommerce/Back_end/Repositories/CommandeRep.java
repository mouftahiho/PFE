package com.Pfe.ecommerce.Back_end.Repositories;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Models.Commande;
import org.springframework.data.repository.CrudRepository;

public interface CommandeRep extends CrudRepository<Commande,Long> {
}
