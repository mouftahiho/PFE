package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Adresse;
import com.Pfe.ecommerce.Back_end.Models.Categorie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategorieS {

    Categorie save(Categorie ctg);
    Categorie modify(Categorie ctg);
    void remove(long idClg);
    Categorie getById(long idClg);
    List<Categorie> getAll();

}
