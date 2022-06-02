package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WishList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idWl")
    long idWL;

    String libelle;

    public WishList(String libelle) {
        this.libelle = libelle;
    }

    @OneToOne(mappedBy = "wishList")
    private Client client;

    @ManyToMany
    private List<Product> products;
    
}
