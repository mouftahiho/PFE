package com.Pfe.ecommerce.Back_end.Mocks;

import com.Pfe.ecommerce.Back_end.Models.Adresse;
import com.Pfe.ecommerce.Back_end.Repositories.AdresseRep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Mock_Adresse implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Mock_Adresse.class);

    @Autowired
    AdresseRep adresseRep;

    @Override
    public void run(String... args) throws Exception {
        /*
        Adresse adr1 = new Adresse("Casablanca","Lot jamila2 Sbata","Maroc",10000);
        Adresse adr2 = new Adresse("Deroua","Lot Al Wafa H","Maroc",26202);
        Adresse adr3 = new Adresse("Zagora","Beni zoli","Maroc",12000);

        adresseRep.save(adr1);
        adresseRep.save(adr2);
        adresseRep.save(adr3);
        adresseRep.findAll();
*/
    }
}

// String ville, String adresse, String pays, int codep
