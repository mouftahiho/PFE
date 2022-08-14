package com.Pfe.ecommerce.Back_end.Controllers;


import com.Pfe.ecommerce.Back_end.Models.Compte;
import com.Pfe.ecommerce.Back_end.Models.Expedition;
import com.Pfe.ecommerce.Back_end.Services.CompteS;
import com.Pfe.ecommerce.Back_end.Services.ExpeditionS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/expedition")
public class ExpeditionController {


        @Autowired
        ExpeditionS expeditionS;

        @PostMapping("/addExpedition")
        public Expedition addExpedition(@RequestBody Expedition expedition){
            return expeditionS.save(expedition);
        }

        @PutMapping("/ModifyExpedition")
        public Expedition ModifyExpedition(@RequestBody Expedition expedition){
            return expeditionS.modify(expedition);
        }

        @DeleteMapping("/{idExpedition}")
        public void DeleteExpedition(@PathVariable("idExpedition") long idexpEdition){
            expeditionS.remove(idexpEdition);
        }

        @GetMapping("/{getExpditionByid}")
        public Expedition getExpeditionById(@PathVariable("getExpditionByid") long idExp){
            return expeditionS.getById(idExp);
        }

        @GetMapping("/getAllExpedition")
        public List<Expedition> getAllExpedition(){
            return expeditionS.getAll();
        }

    }
