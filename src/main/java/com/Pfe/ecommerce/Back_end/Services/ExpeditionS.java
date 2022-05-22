package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Compte;
import com.Pfe.ecommerce.Back_end.Models.Expedition;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExpeditionS {

    Expedition save(Expedition clt);
    Expedition modify(Expedition clt);
    void remove(long idClt);
    Expedition getById(long idClt);
    List<Expedition> getAll();
    List <Expedition> Find(String clt);
}
