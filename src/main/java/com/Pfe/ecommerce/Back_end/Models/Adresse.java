package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TAdresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAdress")
    long idAdr;
    String ville,adresse,pays;
    int codep;

    public Adresse(String ville, String adresse, String pays, int codep) {
        this.ville = ville;
        this.adresse = adresse;
        this.pays = pays;
        this.codep = codep;
    }

    @OneToOne(mappedBy = "TAdresse")
    private Client client;

    @OneToMany(mappedBy = "TAdresse")
    private List<Expedition> expeditions;

}
