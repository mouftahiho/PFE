package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Product;
import com.Pfe.ecommerce.Back_end.Models.Promotion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PromotionS  {
    Promotion save(Promotion clt);
    Promotion modify(Promotion clt);
    void remove(long idClt);
    Promotion getById(long idClt);
    List<Promotion> getAll();
    List <Promotion> Find(String clt);
}
