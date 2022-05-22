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

    public int getIdCl() {
        return idCl;
    }

    public void setIdCl(int idCl) {
        this.idCl = idCl;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getRegD() {
        return regD;
    }

    public void setRegD(Date regD) {
        this.regD = regD;
    }
}
