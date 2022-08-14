package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.WishList;
import com.Pfe.ecommerce.Back_end.Repositories.WishListRep;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Service
public class WishListSImpl implements WishListS{

    @Autowired
    WishListRep wishListRep;

    @Override
    public WishList save(WishList wishList) {
        return wishListRep.save(wishList);
    }

    @Override
    public WishList modify(WishList newWishList) {
        WishList oldWl= wishListRep.findById(newWishList.getIdWL()).get();
        oldWl.setLibelle(newWishList.getLibelle());
        return null;
    }

    @Override
    public void remove(long idWishList) {
        wishListRep.deleteById(idWishList);

    }

    @Override
    public WishList getById(long idWishList) {
        return wishListRep.findById(idWishList).get();
    }

    @Override
    public List<WishList> getAll() {
        return (List<WishList>) wishListRep.findAll();
    }
}
