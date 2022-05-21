package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TAdresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idAdr;
    String ville,adresse,pays;
    int codep;

    public Adresse(String ville, String adresse, String pays, int codep) {
        this.ville = ville;
        this.adresse = adresse;
        this.pays = pays;
        this.codep = codep;
    }
}
