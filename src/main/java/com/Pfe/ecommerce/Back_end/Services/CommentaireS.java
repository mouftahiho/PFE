package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Commande;
import com.Pfe.ecommerce.Back_end.Models.Commentaire;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentaireS {
    Commentaire save(Commentaire clt);
    Commentaire modify(Commentaire clt);
    void remove(long idClt);
    Commentaire getById(long idClt);
    List<Commentaire> getAll();
    List <Commentaire> Find(String clt);
}
