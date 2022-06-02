package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Adresse;
import com.Pfe.ecommerce.Back_end.Repositories.AdresseRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdresseSImpl implements AdresseS {

    @Autowired
    AdresseRep adresseRep;

    @Override
    public Adresse save(Adresse adresse) {
        return adresseRep.save(adresse);
    }

    @Override
    public Adresse modify(Adresse newAdresse) {
        Adresse oldAdresse = (Adresse) adresseRep.findById(newAdresse.getIdAdr()).get();
        oldAdresse.setAdresse(newAdresse.getAdresse());
        oldAdresse.setCodep(newAdresse.getCodep());
        oldAdresse.setPays(newAdresse.getPays());
        oldAdresse.setVille(newAdresse.getVille());

        return adresseRep.save(oldAdresse);
    }

    @Override
    public void remove(long idClt) {
        adresseRep.deleteById(idClt);
    }


    @Override
    public Adresse getById(long idAdr) {
        return adresseRep.findById(idAdr).get();
    }

    @Override
    public List<Adresse> getAll() {
        return (List<Adresse>) adresseRep.findAll();
    }
/*
    @Override
    public List<Adresse> findByAdresse(String adr) {
        return adresseRep.findAdresse(adr);
    }

 */


}
