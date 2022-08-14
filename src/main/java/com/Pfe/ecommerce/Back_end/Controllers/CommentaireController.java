package com.Pfe.ecommerce.Back_end.Controllers;

import com.Pfe.ecommerce.Back_end.Models.Commande;
import com.Pfe.ecommerce.Back_end.Models.Commentaire;
import com.Pfe.ecommerce.Back_end.Services.CommandeS;
import com.Pfe.ecommerce.Back_end.Services.CommentaireS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Commentaire")
public class CommentaireController {

    @Autowired
    CommentaireS commentaireS;

    @PostMapping("/addCommentaire")
    public Commentaire addCommentaire(@RequestBody Commentaire cmt){
        return commentaireS.save(cmt);
    }

    @PutMapping("/ModifyCommentaire")
    public Commentaire ModifyCommentaire(@RequestBody Commentaire cmt){
        return commentaireS.modify(cmt);
    }

    @DeleteMapping("/{idCommentaire}")
    public void DeleteCommentaire(@PathVariable("idCommentaire") long idCmt){
        commentaireS.remove(idCmt);
    }

    @GetMapping("/getAllCommentaire")
    public List<Commentaire> getAllCommentaire(){
        return commentaireS.getAll();
    }


}
