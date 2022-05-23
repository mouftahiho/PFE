package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TLigneCommande")
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idLigneCmd;
    int qte;
    double prixAchat;

    public LigneCommande(int qte, double prixAchat) {
        this.qte = qte;
        this.prixAchat = prixAchat;
    }
}
