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
@Entity(name = "TProduct")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPrd;

    String libelle,marque,desc;
    Double prix,fraisex;
    int disponibilite,qtestock;
    Date datePub;

    public Product(String libelle, String marque, String desc, Double prix, Double fraisex, int disponibilite, int qtestock, Date datePub) {
        this.libelle = libelle;
        this.marque = marque;
        this.desc = desc;
        this.prix = prix;
        this.fraisex = fraisex;
        this.disponibilite = disponibilite;
        this.qtestock = qtestock;
        this.datePub = datePub;
    }


    

}
