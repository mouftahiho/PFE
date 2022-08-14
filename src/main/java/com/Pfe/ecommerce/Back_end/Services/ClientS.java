package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientS {

    Client save(Client clt);
    Client modify(Client clt);
    void remove(long idClt);
    Client getById(long idClt);
    List<Client> getAll();
    List <Client> Find(String clt);

}
