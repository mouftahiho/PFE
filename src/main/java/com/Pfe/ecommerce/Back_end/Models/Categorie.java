package com.Pfe.ecommerce.Back_end.Models;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Entity(name = "TCategories")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCatg")
    long idCatg;
    String libelle,description;

    public Categorie(String libelle, String description) {
        this.libelle = libelle;
        this.description = description;
    }

    public Categorie() {
    }

    @ManyToOne( cascade = CascadeType.ALL )
    @JoinColumn( name="idPrd")
    private Product product;

    @OneToMany(mappedBy = "categorie")
    private List<Product> products;
}
