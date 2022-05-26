package com.Pfe.ecommerce.Back_end.Controllers;

import com.Pfe.ecommerce.Back_end.Models.Commentaire;
import com.Pfe.ecommerce.Back_end.Models.Compte;
import com.Pfe.ecommerce.Back_end.Services.CommentaireS;
import com.Pfe.ecommerce.Back_end.Services.CompteS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compte")
public class CompteController {

    @Autowired
    CompteS compteS;

    @PostMapping("/addCommentaire")
    public Compte addCompte(@RequestBody Compte cmpt){
        return compteS.save(cmpt);
    }

    @PutMapping("/ModifyCompte")
    public Compte ModifyCategorie(@RequestBody Compte cmpt){
        return compteS.modify(cmpt);
    }

    @DeleteMapping("/{idCompte}")
    public void DeleteCompte(@PathVariable("idCompte") long idCmpt){
        compteS.remove(idCmpt);
    }

    @GetMapping("/{getCompteById}")
    public Compte getCompteById(@PathVariable("getCompteById") long idCmpt){
        return compteS.getById(idCmpt);
    }

    @GetMapping("/getAllCompte")
    public List<Compte> getAllCommentaire(){
        return compteS.getAll();
    }


}
