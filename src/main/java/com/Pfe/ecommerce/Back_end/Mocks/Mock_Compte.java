package com.Pfe.ecommerce.Back_end.Mocks;

import com.Pfe.ecommerce.Back_end.Models.Compte;
import com.Pfe.ecommerce.Back_end.Repositories.CompteRep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Mock_Compte /* implements CommandLineRunner */{

    private static final Logger LOGGER = LoggerFactory.getLogger(Mock_Compte.class);

    @Autowired
    private CompteRep compteRep;
/*
    @Override
    public void run(String... args) throws Exception {

        Compte cmpt3 = new Compte("abdessadek","1509","user","nom  de votre fille?" , "ghita" ,new Date());
        compteRep.save(cmpt3);
         compteRep.findAll();
                 System.out.println(cmpt3);
       }
 */

 



}

 //   String login, String mdp, String role, String question, String reponse, Date dateCr
