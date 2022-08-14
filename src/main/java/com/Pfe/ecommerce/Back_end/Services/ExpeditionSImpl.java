package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Expedition;
import com.Pfe.ecommerce.Back_end.Repositories.ExpeditionRep;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Service
public class ExpeditionSImpl implements ExpeditionS {

    @Autowired
    ExpeditionRep expeditionRep;

    @Override
    public Expedition save(Expedition exp) {
        return expeditionRep.save(exp);
    }

    @Override
    public Expedition modify(Expedition newExp) {
        Expedition oldExpedition = expeditionRep.findById(newExp.getIdExp()).get();
        oldExpedition.setMoyenEx(newExp.getMoyenEx());
        oldExpedition.setEtat(newExp.getEtat());
        oldExpedition.setNumSuivi(newExp.getNumSuivi());
        return null;
    }

    @Override
    public void remove(long idExp) {

    }

    @Override
    public Expedition getById(long idExp) {
        return null;
    }

    @Override
    public List<Expedition> getAll() {
        return null;
    }

    @Override
    public List<Expedition> Find(String exp) {
        return null;
    }
}
