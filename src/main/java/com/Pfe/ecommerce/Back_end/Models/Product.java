package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TProduct")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPrd;

    String libelle,marque,description;
    Double prix,fraisex;
    int disponibilite,qtestock;
    Date datePub;

    public Product(String libelle, String marque, String desc, Double prix, Double fraisex, int disponibilite, int qtestock, Date datePub) {
        this.libelle = libelle;
        this.marque = marque;
        this.description = desc;
        this.prix = prix;
        this.fraisex = fraisex;
        this.disponibilite = disponibilite;
        this.qtestock = qtestock;
        this.datePub = datePub;
    }

    @OneToMany(mappedBy = "product")
    private List<Commentaire> commentaire;

    @OneToMany(mappedBy = "product")
    private List<LigneCommande> ligneCommandes;

    @ManyToOne
    @JoinColumn(name = "idCatg" , referencedColumnName = "idCatg")
    private Categorie categorie;

    @OneToMany(mappedBy = "product")
    private List<Image> image;

    @ManyToOne
    @JoinColumn(name = "idPrmm",referencedColumnName = "idPrmm")
    private Promotion promotion;

    @ManyToMany
    @JoinTable(name = "ItemWishList", joinColumns = @JoinColumn(name = "idWl"), inverseJoinColumns = @JoinColumn(name = "idPrd"))
    private List<WishList> wishLists;

}
