package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Compte;
import com.Pfe.ecommerce.Back_end.Models.Expedition;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExpeditionS {

    Expedition save(Expedition exp);
    Expedition modify(Expedition exp);
    void remove(long idExp);
    Expedition getById(long idExp);
    List<Expedition> getAll();
    List <Expedition> Find(String exp);
}
