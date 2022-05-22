package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.LigneCommande;
import com.Pfe.ecommerce.Back_end.Models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductS {
    Product save(Product clt);
    Product modify(Product clt);
    void remove(long idClt);
    Product getById(long idClt);
    List<Product> getAll();
    List <Product> Find(String clt);
}
