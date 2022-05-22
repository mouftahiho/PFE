package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Client;
import com.Pfe.ecommerce.Back_end.Repositories.ClientRep;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;


public class ClientSImpl implements ClientS{

    @Autowired
    ClientRep clientRep;

    @Override
    public Client save(Client clt) {
        return clientRep.save();
    }

    @Override
    public Client modify(Client clt) {
        Client oldClient = clientRep.findById(clt.getIdCl).get();
        oldClient.setEmail(clt.getEmail());
        oldClient.setNom(clt.getNom());
        oldClient.setPrenom(clt.getPrenom());
        oldClient.setRegD(clt.getRegD());
        oldClient.setTel(clt.getTel());
        return clientRep.save(oldClient);
    }

    @Override
    public void remove(long idClt) {
    clientRep.deleteById(idClt);
    }

    @Override
    public Client getById(long idClt) {
        return clientRep.findById(idClt).get();
    }

    @Override
    public List<Client> getAll() {
        return (List<Client>) clientRep.findAll();
    }

    @Override
    public List<Client> FindByTele(String tel) {
        return clientRep.findByTel(tel);
    }
}
