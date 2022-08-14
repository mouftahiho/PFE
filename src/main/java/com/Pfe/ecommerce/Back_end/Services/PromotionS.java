package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Product;
import com.Pfe.ecommerce.Back_end.Models.Promotion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PromotionS  {
    Promotion save(Promotion prm);
    Promotion modify(Promotion prm);
    void remove(long idPrm);
    Promotion getById(long idPrm);
    List<Promotion> getAll();
    //List <Promotion> Find(String prm);
}
