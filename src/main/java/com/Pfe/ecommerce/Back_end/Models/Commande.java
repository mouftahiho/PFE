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

    public int getIdCmd() {
        return idCmd;
    }

    public void setIdCmd(int idCmd) {
        this.idCmd = idCmd;
    }

    public Date getDateCmd() {
        return dateCmd;
    }

    public void setDateCmd(Date dateCmd) {
        this.dateCmd = dateCmd;
    }

    public String getMethodePay() {
        return methodePay;
    }

    public void setMethodePay(String methodePay) {
        this.methodePay = methodePay;
    }
}
