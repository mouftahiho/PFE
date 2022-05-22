package com.Pfe.ecommerce.Back_end.Services;


import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Repositories.CategorieRep;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Service
public class CategorieSImpl implements CategorieS {

    @Autowired
    CategorieRep categorieRep;

    @Override
    public Categorie save(Categorie ctg) {
        return categorieRep.save(ctg);
    }

    @Override
    public Categorie modify(Categorie ctg) {
        Categorie oldCtg = categorieRep.findById(ctg.getIdCat()).get();
        oldCtg.setDescription(ctg.getDescription());
        oldCtg.setLibelle(ctg.getLibelle());
        return categorieRep.save(oldCtg);
    }

    @Override
    public void remove(long idCtg) {
    categorieRep.deleteById(idCtg);
    }

    @Override
    public Categorie getById(long idCtg) {
        return categorieRep.findById(idCtg).get();
    }

    @Override
    public List<Categorie> getAll() {
        return (List<Categorie>) categorieRep.findAll();
    }


}
