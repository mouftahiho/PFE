package com.Pfe.ecommerce.Back_end.Controllers;

import com.Pfe.ecommerce.Back_end.Models.LigneCommande;
import com.Pfe.ecommerce.Back_end.Services.LigneCommandeS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ligneCommande")
public class LigneCommandeController {

    @Autowired
    LigneCommandeS ligneCommandeS;

    @PostMapping("/addLc")
    public LigneCommande addLigneCommande(LigneCommande lc){
        return ligneCommandeS.save(lc);
    }
    @PutMapping("/modifyLc")
    public  LigneCommande mdifyLigneCommande(LigneCommande lc){
        return ligneCommandeS.modify(lc);
    }
    @DeleteMapping("/{deleteLc}")
    public void deleteLigneCommande(@PathVariable("deleteLc") long idLc){
        ligneCommandeS.remove(idLc);
    }
    @GetMapping("/{getLcById}")
    public LigneCommande getLigneCommandeById(@PathVariable("getLcById") long idLc){
        return ligneCommandeS.getById(idLc);
    }
    @GetMapping("/getAllLc")
    public List<LigneCommande> getAllLigneCommande() {
        return ligneCommandeS.getAll();
    }
}
