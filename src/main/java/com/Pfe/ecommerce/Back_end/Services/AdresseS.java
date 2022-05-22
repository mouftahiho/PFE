package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Adresse;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdresseS {
    Adresse save(Adresse clt);
    Adresse modify(Adresse clt);
    void remove(long idClt);
    Adresse getById(long idClt);
    List<Adresse> getAll();
    List <Adresse> Find(String clt);
}
