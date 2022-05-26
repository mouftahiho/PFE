package com.Pfe.ecommerce.Back_end.Controllers;


import com.Pfe.ecommerce.Back_end.Models.LigneCommande;
import com.Pfe.ecommerce.Back_end.Models.Product;
import com.Pfe.ecommerce.Back_end.Models.Promotion;
import com.Pfe.ecommerce.Back_end.Services.LigneCommandeS;
import com.Pfe.ecommerce.Back_end.Services.ProductS;
import com.Pfe.ecommerce.Back_end.Services.PromotionS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    PromotionS promotionS;

    @PostMapping("/addPromotion")
    public Promotion addPromotion(Promotion promotion){
        return promotionS.save(promotion);
    }
    @PutMapping("/modifyPromotion")
    public  Promotion mdifyPromotion(Promotion promotion){
        return promotionS.modify(promotion);
    }
    @DeleteMapping("/{deletePromotion}")
    public void deletePromotion(@PathVariable("deletePromotion") long idPrm){
        promotionS.remove(idPrm);
    }
    @GetMapping("/{getPromotionById}")
    public Promotion getProduct(@PathVariable("getPromotionById") long idPrm){
        return promotionS.getById(idPrm);
    }
    @GetMapping("/getAllPromotion")
    public List<Promotion> getAllPromotion() {
        return promotionS.getAll();
    }

}
