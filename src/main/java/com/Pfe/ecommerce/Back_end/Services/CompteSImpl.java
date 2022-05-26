package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Compte;
import com.Pfe.ecommerce.Back_end.Repositories.CompteRep;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Service
public class CompteSImpl implements CompteS {

    @Autowired
    CompteRep compteRep;

    @Override
    public Compte save(Compte compte) {
        return compteRep.save(compte);
    }

    @Override
    public Compte modify(Compte newCompte) {
        Compte oldCompte = compteRep.findById(newCompte.getIdCompte()).get();
        oldCompte.setLogin(newCompte.getLogin());
        oldCompte.setMdp(newCompte.getMdp());
        oldCompte.setQuestion(newCompte.getQuestion());
        oldCompte.setReponse(newCompte.getReponse());
        return compteRep.save(oldCompte);
    }

    @Override
    public void remove(long idCompte) {
        compteRep.deleteById(idCompte);
    }

    @Override
    public Compte getById(long idCompte) {
        return compteRep.findById(idCompte).get();
    }

    @Override
    public List<Compte> getAll() {
        return (List<Compte>) compteRep.findAll();
    }
}
