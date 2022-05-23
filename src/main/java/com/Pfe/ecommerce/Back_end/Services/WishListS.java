package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Promotion;
import com.Pfe.ecommerce.Back_end.Models.WishList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WishListS {
    WishList save(WishList wishList);
    WishList modify(WishList wishList);
    void remove(long idWishList);
    WishList getById(long idWishList);
    List<WishList> getAll();
    //List <WishList> Find(String wishList);
}
