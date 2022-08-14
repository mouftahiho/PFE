package com.Pfe.ecommerce.Back_end.Mocks;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Repositories.CategorieRep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Mock_Categorie implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Mock_Categorie.class) ;

    @Autowired
    CategorieRep categorieRep;

    @Override
    public void run(String... args) throws Exception {
        /*
        Categorie cat1 = new Categorie("T-shirt","Polo gris");
        Categorie cat2 = new Categorie("Robe","Robe jaune");
        Categorie cat3 = new Categorie("Chemise","Chemise blanche");
        categorieRep.save(cat1);
        categorieRep.save(cat2);
        categorieRep.save(cat3);

         */

    }


}
