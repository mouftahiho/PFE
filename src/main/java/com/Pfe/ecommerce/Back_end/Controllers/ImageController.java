package com.Pfe.ecommerce.Back_end.Controllers;

import com.Pfe.ecommerce.Back_end.Models.Image;
import com.Pfe.ecommerce.Back_end.Services.ImageS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageController {

    @Autowired
    ImageS imageS;

    @PostMapping("/addImage")
    public Image addImage(Image img){
        return imageS.save(img);
    }
    @PutMapping("/modifyImage")
    public Image modifyImage(Image img){
        return imageS.modify(img);
    }
    @DeleteMapping("/{idImage}")
    public void DeleteImage(long idImag){
        imageS.remove(idImag);
    }
    @GetMapping("/getAllImage")
    public List<Image> getAllImage(){
        return imageS.getAll();
    }

    @GetMapping("/{getImage}")
    public Image getImageById(@PathVariable("getImage") long idImg){
       return imageS.getById(idImg);
    }

}
