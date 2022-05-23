package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.LigneCommande;
import com.Pfe.ecommerce.Back_end.Repositories.LigneCommandeRep;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


public class LigneCommandeSImpl implements LigneCommandeS{
    @Autowired
    LigneCommandeRep ligneCommandeRep;

    @Override
    public LigneCommande save(LigneCommande lc) {
        return ligneCommandeRep.save(lc);
    }

    @Override
    public LigneCommande modify(LigneCommande newLc) {
        LigneCommande oldLc = ligneCommandeRep.findById(newLc.getIdLigneCmd()).get();
        oldLc.setPrixAchat(newLc.getPrixAchat());
        oldLc.setQte(newLc.getQte());
        return ligneCommandeRep.save(oldLc);
    }

    @Override
    public void remove(long idLc) {
        ligneCommandeRep.deleteById(idLc);

    }

    @Override
    public LigneCommande getById(long idLc) {
        return ligneCommandeRep.findById(idLc).get();
    }

    @Override
    public List<LigneCommande> getAll() {
        return (List<LigneCommande>) ligneCommandeRep.findAll();
    }



}
