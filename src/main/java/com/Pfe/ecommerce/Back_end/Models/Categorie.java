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
    int idCatg;
    String libelle,description;

    public Categorie(String libelle, String description) {
        this.libelle = libelle;
        this.description = description;
    }

    public Categorie() {
    }

    public int getIdCatg() {
        return idCatg;
    }

    public void setIdCatg(int idCatg) {
        this.idCatg = idCatg;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
