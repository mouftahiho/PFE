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
@Entity(name = "TClients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCl;
    String nom,prenom,email,tel;
    Date regD;

    public Client() {
    }

    public Client(String nom, String prenom, String email, String tel, Date regD) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.regD = regD;
    }
}
