package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Expedition;
import com.Pfe.ecommerce.Back_end.Models.Image;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImageS {

    Image save(Image clt);
    Image modify(Image clt);
    void remove(long idClt);
    Image getById(long idClt);
    List<Image> getAll();
    List <Image> Find(String clt);
}
