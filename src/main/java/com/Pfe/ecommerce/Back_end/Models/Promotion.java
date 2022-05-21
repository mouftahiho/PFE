package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity(name = "TPromotion")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPrmm;
    Date dateD,DateF;
    int taux;

    public Promotion(Date dateD, Date dateF, int taux) {
        this.dateD = dateD;
        DateF = dateF;
        this.taux = taux;
    }

    public Promotion() {
    }
}
