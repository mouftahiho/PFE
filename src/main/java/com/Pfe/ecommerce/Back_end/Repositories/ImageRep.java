package com.Pfe.ecommerce.Back_end.Repositories;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Models.Image;
import org.springframework.data.repository.CrudRepository;

public interface ImageRep extends CrudRepository<Image,Long> {
}
