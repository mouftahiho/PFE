package com.Pfe.ecommerce.Back_end.Repositories;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Models.Expedition;
import org.springframework.data.repository.CrudRepository;

public interface ExpeditionRep extends CrudRepository<Expedition,Long> {
}
