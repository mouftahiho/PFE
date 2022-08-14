package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Expedition;
import com.Pfe.ecommerce.Back_end.Models.Image;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImageS {

    Image save(Image img);
    Image modify(Image img);
    void remove(long idImg);
    Image getById(long idImg);
    List<Image> getAll();
    //List <Image> Find(String img);
}
