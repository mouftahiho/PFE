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
@Entity(name = "TComptes")
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCompte;
    String login,mdp,role,question,reponse;
    Date dateCr;

    public Compte(String login, String mdp, String role, String question, String reponse, Date dateCr) {
        this.login = login;
        this.mdp = mdp;
        this.role = role;
        this.question = question;
        this.reponse = reponse;
        this.dateCr = dateCr;
    }

    public Compte() {
    }
}
