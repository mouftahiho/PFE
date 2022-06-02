package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TCommande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCmd")
    long idCmd;
    Date dateCmd;
    String methodePay;

    public Commande(Date dateCmd, String methodePay) {
        this.dateCmd = dateCmd;
        this.methodePay = methodePay;
    }

    @OneToMany(mappedBy = "commande")
    private List<LigneCommande> ligneCommandes;


}
