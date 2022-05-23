package com.Pfe.ecommerce.Back_end.Models;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity(name = "Tcategories")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idCatg;
    String libelle,description;

    public Categorie(String libelle, String description) {
        this.libelle = libelle;
        this.description = description;
    }

    public Categorie() {
    }

}
