package com.front_end.Front_End_Pfe.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Entity(name = "TClients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idCl;
    String nom,prenom,email,tel;
    Date regD;

    public Client() {
    }

    public Client(String nom, String prenom, String email, String tel, Date regD) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.regD = regD;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "login" , referencedColumnName = "login")
    private Compte compte;

    @OneToMany(mappedBy = "client")
    private List<Commentaire> commentaire;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idWishList" , referencedColumnName = "idWl")
    private WishList wishList;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idAdress" , referencedColumnName = "idAdress")
    private Adresse adresse;


}
