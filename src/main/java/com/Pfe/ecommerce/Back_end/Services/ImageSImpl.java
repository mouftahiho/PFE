package com.Pfe.ecommerce.Back_end.Services;

import com.Pfe.ecommerce.Back_end.Models.Image;
import com.Pfe.ecommerce.Back_end.Repositories.ImageRep;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


public class ImageSImpl implements ImageS{

    @Autowired
    ImageRep imageRep;

    @Override
    public Image save(Image img) {
        return imageRep.save(img);
    }

    @Override
    public Image modify(Image newImg) {
        Image oldImage = imageRep.findById(newImg.getIdImg()).get();
        oldImage.setIsPrincipal(newImg.getIsPrincipal());
        oldImage.setUrl(newImg.getUrl());
        return null;
    }

    @Override
    public void remove(long idImg) {

    }

    @Override
    public Image getById(long idImg) {
        return null;
    }

    @Override
    public List<Image> getAll() {
        return null;
    }
}
