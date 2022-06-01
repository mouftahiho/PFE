package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TPromotion")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPrmm;
    Date dateD,DateF;
    int taux;

    public Promotion(Date dateD, Date dateF, int taux) {
        this.dateD = dateD;
        DateF = dateF;
        this.taux = taux;
    }

    @OneToMany(mappedBy = "TPromotion")
    private List<Product> products;

}
