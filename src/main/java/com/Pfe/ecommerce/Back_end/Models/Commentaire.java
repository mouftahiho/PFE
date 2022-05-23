package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TCommentaire")
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idCmt;
    String Commentaire;
    Date datePub;

    public Commentaire(String commentaire, Date datePub) {
        Commentaire = commentaire;
        this.datePub = datePub;
    }
}
