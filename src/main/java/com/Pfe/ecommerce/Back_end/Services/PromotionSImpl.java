package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Promotion;
import com.Pfe.ecommerce.Back_end.Repositories.PromotionRep;
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
public class PromotionSImpl implements PromotionS{

    @Autowired
    PromotionRep promotionRep;

    @Override
    public Promotion save(Promotion prm) {
        return promotionRep.save(prm);
    }

    @Override
    public Promotion modify(Promotion newPrm) {
        Promotion oldPrm = promotionRep.findById(newPrm.getIdPrmm()).get();
        oldPrm.setDateD(newPrm.getDateD());
        oldPrm.setDateF(newPrm.getDateF());
        oldPrm.setTaux(newPrm.getTaux());
        return promotionRep.save(oldPrm);
    }

    @Override
    public void remove(long idPrm) {
    promotionRep.deleteById(idPrm);
    }

    @Override
    public Promotion getById(long idPrm) {
        return promotionRep.findById(idPrm).get();
    }

    @Override
    public List<Promotion> getAll() {
        return (List<Promotion>) promotionRep.findAll();
    }


}
