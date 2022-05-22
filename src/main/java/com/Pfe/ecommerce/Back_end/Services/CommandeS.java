package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Client;
import com.Pfe.ecommerce.Back_end.Models.Commande;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface CommandeS {

    Commande save(Commande cmd);
    Commande modify(Commande cmd);
    void remove(long idCmd);
    Commande getById(long idCmd);
    List<Commande> getAll();
    List <Commande> FindByDate(Date DateCmd);
}
