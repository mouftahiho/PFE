package com.Pfe.ecommerce.Back_end.Repositories;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Models.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface CommandeRep extends CrudRepository<Commande,Long> {
    List<Commande> findByDateCmd(Date dateCmd);

}
