package com.Pfe.ecommerce.Back_end.Controllers;

import com.Pfe.ecommerce.Back_end.Models.Client;
import com.Pfe.ecommerce.Back_end.Models.Commande;
import com.Pfe.ecommerce.Back_end.Services.ClientS;
import com.Pfe.ecommerce.Back_end.Services.CommandeS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Commande")
public class CommandeController {

    @Autowired
    CommandeS commandeS;

    @PostMapping("/addCommande")
    public Commande addCategorie(@RequestBody Commande cmd){
        return commandeS.save(cmd);
    }

    @PutMapping("/ModifyCommande")
    public Commande ModifyCategorie(@RequestBody Commande cmd){
        return commandeS.modify(cmd);
    }

    @DeleteMapping("/{idCommande}")
    public void DeleteCommande(@PathVariable("idCommandet") long idCmd){
        commandeS.remove(idCmd);
    }

    @GetMapping("/getAllCommande")
    public List<Commande> getAllCommandes(){
        return commandeS.getAll();
    }
}
