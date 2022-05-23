package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.LigneCommande;
import com.Pfe.ecommerce.Back_end.Models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductS {
    Product save(Product pr);
    Product modify(Product pr);
    void remove(long idPr);
    Product getById(long idPr);
    List<Product> getAll();
    //List <Product> Find(String pr);
}
