package com.Pfe.ecommerce.Back_end.Mocks;

import com.Pfe.ecommerce.Back_end.Models.Commentaire;
import com.Pfe.ecommerce.Back_end.Repositories.ClientRep;
import com.Pfe.ecommerce.Back_end.Repositories.CommentaireRep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Mock_Commentaire implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Mock_Client.class);

    @Autowired
    CommentaireRep commentaireRep;

    @Override
    public void run(String... args) throws Exception {
        /*
        Commentaire commentaire1 = new Commentaire("Produit impecable j'adore et je recommand",new Date());
        Commentaire commentaire2 = new Commentaire("Produit incoryable",new Date());
        Commentaire commentaire3 = new Commentaire("bon qualité super",new Date());
        Commentaire commentaire4 = new Commentaire("tres satisfait",new Date());
        commentaireRep.save(commentaire1);
        commentaireRep.save(commentaire2);
        commentaireRep.save(commentaire3);
        commentaireRep.save(commentaire4);

         */
    }
}
