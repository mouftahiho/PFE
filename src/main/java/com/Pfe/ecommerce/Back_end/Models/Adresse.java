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
@Entity(name = "TAdresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idAdr;
    String ville,adresse,pays;
    int codep;

    public Adresse(String ville, String adresse, String pays, int codep) {
        this.ville = ville;
        this.adresse = adresse;
        this.pays = pays;
        this.codep = codep;
    }

    public long getIdAdr() {
        return idAdr;
    }

    public void setIdAdr(int idAdr) {
        this.idAdr = idAdr;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public int getCodep() {
        return codep;
    }

    public void setCodep(int codep) {
        this.codep = codep;
    }

    public Adresse() {
    }
}
