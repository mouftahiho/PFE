package com.Pfe.ecommerce.Back_end.Repositories;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Models.Promotion;
import org.springframework.data.repository.CrudRepository;

public interface PromotionRep extends CrudRepository<Promotion,Long> {
}
