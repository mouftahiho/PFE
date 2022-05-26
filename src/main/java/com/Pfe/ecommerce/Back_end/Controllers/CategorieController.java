package com.Pfe.ecommerce.Back_end.Controllers;

import com.Pfe.ecommerce.Back_end.Models.Categorie;
import com.Pfe.ecommerce.Back_end.Services.CategorieS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorie")
public class CategorieController {

    @Autowired
    CategorieS categorieS;

    @PostMapping("/addCategorie")
    public Categorie addCategorie(@RequestBody Categorie ctr){
        return categorieS.save(ctr);
    }

    @PutMapping("/ModifyCategorie")
    public Categorie ModifyCategorie(@RequestBody Categorie ctr){
        return categorieS.modify(ctr);
    }

    @DeleteMapping("/{idCatRem}")
    public void DeleteCategorie(@PathVariable("idCatRem") long idCat){
        categorieS.remove(idCat);
    }

    @GetMapping("/getAllCategorie")
    public List<Categorie> getAllCategorie(){
        return categorieS.getAll();
    }


}
