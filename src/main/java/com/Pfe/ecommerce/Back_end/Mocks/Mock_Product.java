package com.Pfe.ecommerce.Back_end.Mocks;

import com.Pfe.ecommerce.Back_end.Models.Product;
import com.Pfe.ecommerce.Back_end.Repositories.ProductRep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Mock_Product implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Mock_Product.class);

    @Autowired
    ProductRep productRep;

    @Override
    public void run(String... args) throws Exception {
/*
        Product product1 = new Product("spadrie vert taille de 40 à 44","Addidas","spadrie vert",50.3,10.2,1,50 ,new Date());
        Product product2 = new Product("chemise de taille 38 à 45","Polo","T-shirt polo noir",100.0,0.0,1,61 ,new Date());
        Product product3 = new Product("Robe marque Gucci superbe sualité","Gucci","Robe Jaune",80.5,8.5,1,16 ,new Date());
        Product product4 = new Product("Chemise  incroyable qualité","Polo","Chemise blans",90.8,10.0,0,0 ,new Date());
        productRep.delete(product1);
        productRep.delete(product2);
        productRep.delete(product3);
        productRep.delete(product4);

 */

    }
}
//String libelle, String marque, String desc, Double prix, Double fraisex, int disponibilite, int qtestock, Date datePub