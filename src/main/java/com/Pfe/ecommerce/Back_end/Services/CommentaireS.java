package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Commande;
import com.Pfe.ecommerce.Back_end.Models.Commentaire;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentaireS {
    Commentaire save(Commentaire cmt);
    Commentaire modify(Commentaire cmt);
    void remove(long idCmt);
    Commentaire getById(long idCmt);
    List<Commentaire> getAll();
}
