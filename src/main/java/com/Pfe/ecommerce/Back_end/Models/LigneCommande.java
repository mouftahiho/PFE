package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "idProduit" , referencedColumnName = "idPrd")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "idCommande" , referencedColumnName = "idCmd")
    private Commande commande;
}
