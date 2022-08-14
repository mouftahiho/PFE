package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Commande;
import com.Pfe.ecommerce.Back_end.Repositories.CommandeRep;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Service
public class CommandeSImpl implements CommandeS {

    @Autowired
    CommandeRep commandeRep;

    @Override
    public Commande save(Commande cmd) {
        return commandeRep.save(cmd);
    }

    @Override
    public Commande modify(Commande cmd) {
        Commande oldCommande = commandeRep.findById(cmd.getIdCmd()).get();
        oldCommande.setDateCmd(cmd.getDateCmd());
        oldCommande.setMethodePay(cmd.getMethodePay());
        return commandeRep.save(oldCommande);
    }

    @Override
    public void remove(long idCmd) {
    commandeRep.deleteById(idCmd);
    }

    @Override
    public Commande getById(long idCmd) {
        return commandeRep.findById(idCmd).get();
    }

    @Override
    public List<Commande> getAll() {
        return (List<Commande>) commandeRep.findAll();
    }

    @Override
    public List<Commande> FindByDate(Date DateCmd) {
        //return commandeRep.findByDateCmd(DateCmd.getTime()).toString();
        return null;
    }
}
