package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Commande;
import com.Pfe.ecommerce.Back_end.Models.Commentaire;
import com.Pfe.ecommerce.Back_end.Repositories.CommentaireRep;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;


public class CommentaireSImpl implements CommentaireS {

    @Autowired
    CommentaireRep commentaireRep;


    @Override
    public Commentaire save(Commentaire cmt) {
        return commentaireRep.save(cmt);
    }

    @Override
    public Commentaire modify(Commentaire newCmt) {
        Commentaire old = commentaireRep.findById(newCmt.getIdCmt()).get();
        old.setCommentaire(newCmt.getCommentaire());
        old.setDatePub(newCmt.getDatePub());
        return commentaireRep.save(old) ;
    }

    @Override
    public void remove(long idCmt) {
    commentaireRep.deleteById(idCmt);
    }

    @Override
    public Commentaire getById(long idCmt) {
        return commentaireRep.findById(idCmt).get();
    }

    @Override
    public List<Commentaire> getAll() {
        return (List<Commentaire>) commentaireRep.findAll();
    }
}
