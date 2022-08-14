package com.Pfe.ecommerce.Back_end.Controllers;


import com.Pfe.ecommerce.Back_end.Models.Adresse;
import com.Pfe.ecommerce.Back_end.Models.Product;
import com.Pfe.ecommerce.Back_end.Models.Promotion;
import com.Pfe.ecommerce.Back_end.Services.ProductS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductS productS;

    @PostMapping("/addproduct")
    public Product saveProduct (@RequestBody Product prd) {
        return productS.save(prd);
    }

    @PutMapping("/modifyproduct")
    public Product modifyProduct(@RequestBody Product prd){
        return productS.modify(prd);
    }
    @DeleteMapping("/{deleteproduct}")
    public void deletePromotion(@PathVariable("deleteproduct") long idPrd){
        productS.remove(idPrd);
    }
    @GetMapping("/{getproduct}")
    public Product getProduct(@PathVariable("getproduct") long idPrd){
        return productS.getById(idPrd);
    }
    @GetMapping("/getAllproduct")
    public List<Product> getAllProduct() {
        return productS.getAll();
    }

}
