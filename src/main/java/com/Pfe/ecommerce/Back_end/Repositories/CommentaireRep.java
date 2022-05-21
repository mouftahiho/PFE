package com.Pfe.ecommerce.Back_end.Repositories;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Models.Commentaire;
import org.springframework.data.repository.CrudRepository;

public interface CommentaireRep extends CrudRepository<Commentaire,Long> {
}
