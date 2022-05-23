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

}
