package com.Pfe.ecommerce.Back_end.Repositories;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRep extends CrudRepository<Client,Long> {

    List<Client> findByTel(String tel);
}
