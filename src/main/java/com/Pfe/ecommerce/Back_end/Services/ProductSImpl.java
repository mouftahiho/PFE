package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Product;
import com.Pfe.ecommerce.Back_end.Repositories.ProductRep;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;


public class ProductSImpl implements ProductS{

    @Autowired
    ProductRep productRep;

    @Override
    public Product save(Product pr) {
        return productRep.save(pr);
    }

    @Override
    public Product modify(Product newPr) {
        Product oldPr= productRep.findById(newPr.getIdPrd()).get();
        oldPr.setDesc(newPr.getDesc());
        oldPr.setDisponibilite(newPr.getDisponibilite());
        oldPr.setFraisex(newPr.getFraisex());
        oldPr.setLibelle(newPr.getLibelle());
        oldPr.setMarque(newPr.getMarque());
        oldPr.setPrix(newPr.getPrix());
        oldPr.setQtestock(newPr.getQtestock());
        return productRep.save(oldPr);
    }

    @Override
    public void remove(long idPr) {
    productRep.deleteById(idPr);
    }

    @Override
    public Product getById(long idPr) {
        return productRep.findById(idPr).get();
    }

    @Override
    public List<Product> getAll() {
        return (List<Product>) productRep.findAll();
    }
}
