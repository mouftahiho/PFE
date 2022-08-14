package com.Pfe.ecommerce.Back_end.Mocks;

import com.Pfe.ecommerce.Back_end.Models.Client;
import com.Pfe.ecommerce.Back_end.Repositories.ClientRep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Mock_Client implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Mock_Client.class);

    @Autowired
    ClientRep clientRep;

    @Override
    public void run(String... args) throws Exception {
        /*
        Client client1 = new Client("Mouftah","Oussama","Mouftah@gmail.com","0650167369",new Date());
        Client client2 = new Client("Mouftah","Salah","MouftahSalah@gmail.com","006321166",new Date());
        Client client3 = new Client("Bahafid","abdessadek","abdessadek@gmail.com","0650998877",new Date());
        clientRep.save(client1);
        clientRep.save(client2);
        clientRep.save(client3);

         */

    }
}
//String nom, String prenom, String email, String tel, Date regD