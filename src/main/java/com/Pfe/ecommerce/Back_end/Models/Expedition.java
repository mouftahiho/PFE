package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TExpedition")
public class Expedition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idExp;
    String moyenEx,etat,numSuivi;

    public Expedition(String moyenEx, String etat, String numSuivi) {
        this.moyenEx = moyenEx;
        this.etat = etat;
        this.numSuivi = numSuivi;
    }

    @ManyToOne
    @JoinColumn(name = "idAdress" , referencedColumnName = "idAdress")
    private Adresse adresse;

}
