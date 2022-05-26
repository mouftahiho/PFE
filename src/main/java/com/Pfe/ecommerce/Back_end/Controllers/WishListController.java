package com.Pfe.ecommerce.Back_end.Controllers;


import com.Pfe.ecommerce.Back_end.Models.Promotion;
import com.Pfe.ecommerce.Back_end.Models.WishList;
import com.Pfe.ecommerce.Back_end.Services.PromotionS;
import com.Pfe.ecommerce.Back_end.Services.WishListS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/wishList")
public class WishListController {

    @Autowired
    WishListS wishListS;

    @PostMapping("/addWishList")
    public WishList addPromotion(WishList wishList){
        return wishListS.save(wishList);
    }
    @PutMapping("/modifyWishList")
    public  WishList mdifyPromotion(WishList wishList){
        return wishListS.modify(wishList);
    }
    @DeleteMapping("/{deleteWishList}")
    public void deleteWishList(@PathVariable("deleteWishList") long idWishLit){
        wishListS.remove(idWishLit);
    }
    @GetMapping("/{getWishListById}")
    public WishList getWishListById(@PathVariable("getWishListById") long idWishLit){
        return wishListS.getById(idWishLit);
    }
    @GetMapping("/getAllWishList")
    public List<WishList> getAllWishList() {
        return wishListS.getAll();
    }
}
