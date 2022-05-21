package com.Pfe.ecommerce.Back_end.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity(name = "TImages")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdImg, isPrincipal;


    public Image(int isPrincipal) {
        this.isPrincipal = isPrincipal;
    }

    public Image() {
    }
}
