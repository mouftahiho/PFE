package com.Pfe.ecommerce.Back_end.Repositories;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Models.WishList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRep extends CrudRepository<WishList,Long> {
}
