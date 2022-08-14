package com.front_end.Front_End_Pfe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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

    @ManyToOne
    @JoinColumn(name = "idclient")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "idProduit")
    private Product product;
}
