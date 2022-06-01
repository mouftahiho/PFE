package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity(name = "TImages")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long IdImg;
    String url;
    int isPrincipal;


    public Image(String url, int isPrincipal) {
        this.url = url;
        this.isPrincipal = isPrincipal;
    }

    public Image() {
    }
    @ManyToOne
    @JoinColumn(name = "idImg" , referencedColumnName = "idImg")
    private Product product;
}
