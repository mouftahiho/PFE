package com.Pfe.ecommerce.Back_end.Repositories;

import com.Pfe.ecommerce.Back_end.Models.Adresse;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdresseRep extends CrudRepository<Adresse,Long> {

    List<Adresse> findByAdresse(String Adr);
}
