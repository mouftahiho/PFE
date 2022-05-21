package com.Pfe.ecommerce.Back_end.Repositories;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRep extends CrudRepository<Product,Long> {
}
