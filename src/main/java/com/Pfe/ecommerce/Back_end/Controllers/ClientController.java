package com.Pfe.ecommerce.Back_end.Controllers;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Models.Client;
import com.Pfe.ecommerce.Back_end.Services.CategorieS;
import com.Pfe.ecommerce.Back_end.Services.ClientS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientS clientS;

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client clt){
        return clientS.save(clt);
    }

    @PutMapping("/ModifyClient")
    public Client ModifyClient(@RequestBody Client clt){
        return clientS.modify(clt);
    }

    @DeleteMapping("/{idClient}")
    public void DeleteClient(@PathVariable("idClient") long idClt){
        clientS.remove(idClt);
    }

    @GetMapping("/getAllClients")
    public List<Client> getAllClient(){
        return clientS.getAll();
    }


}
