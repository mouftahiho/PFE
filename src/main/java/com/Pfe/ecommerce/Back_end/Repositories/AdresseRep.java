package com.Pfe.ecommerce.Back_end.Repositories;

import com.Pfe.ecommerce.Back_end.Models.Adresse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdresseRep extends CrudRepository<Adresse,Long> {

    List<Adresse> findAdresse(String Adr);
}
