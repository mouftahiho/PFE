package com.Pfe.ecommerce.Back_end.Controllers;


import com.Pfe.ecommerce.Back_end.Models.Product;
import com.Pfe.ecommerce.Back_end.Models.Promotion;
import com.Pfe.ecommerce.Back_end.Services.ProductS;
import com.Pfe.ecommerce.Back_end.Services.PromotionS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PromotionController {

    @Autowired
    PromotionS promotionS;

    @PostMapping("/addPromotion")
    public Promotion addPromotion(Promotion pr){
        return promotionS.save(pr);
    }
    @PutMapping("/modifyPromotion")
    public  Promotion mdifyPromotion(Promotion pr){
        return promotionS.modify(pr);
    }
    @DeleteMapping("/{deletePromotion}")
    public void deletePromotion(@PathVariable("deletePromotion") long idPr){
        promotionS.remove(idPr);
    }
    @GetMapping("/{getPromotionById}")
    public Promotion getProduct(@PathVariable("getPromotionById") long idPr){
        return promotionS.getById(idPr);
    }
    @GetMapping("/getAllPromotion")
    public List<Promotion> getAllPromotion() {
        return promotionS.getAll();
    }
}
