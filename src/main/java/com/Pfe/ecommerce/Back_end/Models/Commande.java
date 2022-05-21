package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TCommande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCmd;
    Date dateCmd;
    String methodePay;

    public Commande(Date dateCmd, String methodePay) {
        this.dateCmd = dateCmd;
        this.methodePay = methodePay;
    }
}
