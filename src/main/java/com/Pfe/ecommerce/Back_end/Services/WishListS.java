package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Promotion;
import com.Pfe.ecommerce.Back_end.Models.WishList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WishListS {
    WishList save(WishList clt);
    WishList modify(WishList clt);
    void remove(long idClt);
    WishList getById(long idClt);
    List<WishList> getAll();
    List <WishList> Find(String clt);
}
