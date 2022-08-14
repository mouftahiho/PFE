package com.front_end.Front_End_Pfe.controller;

import com.Pfe.ecommerce.Back_end.Models.Adresse;
import com.Pfe.ecommerce.Back_end.Services.AdresseS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adresse")
public class AdresseController {

    @Autowired
    AdresseS adresseS;

    @PostMapping("/addService")
    public Adresse saveAdresse (@RequestBody Adresse adr) {
        return adresseS.save(adr);
    }

    @PutMapping("/modifyAdresse")
    public Adresse ModifyAdresse(@RequestBody Adresse adr){
        return adresseS.modify(adr);
    }

    @DeleteMapping("/{remove}")
    public  void removeAdresse(@PathVariable("remove") long idAdr ){
        adresseS.remove(idAdr);
    }
    @GetMapping("/{getAdresse}")
    public Adresse getAdresse(@PathVariable("getAdresse") long idAdr){
        return adresseS.getById(idAdr);
    }
    @GetMapping("/geListAdresse")
    public List<Adresse> getAllAdresse(){
        return adresseS.getAll();
    }
/*
    @GetMapping("/findByAdr")
    public List<Adresse> getByAdresses(String adr){
        return adresseS.findByAdresse(adr);
      }
 */


}
