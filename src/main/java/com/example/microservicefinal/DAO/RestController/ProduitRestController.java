package com.example.microservicefinal.DAO.RestController;

import com.example.microservicefinal.DAO.Entities.Feedback;
import com.example.microservicefinal.DAO.Entities.Produit;
import com.example.microservicefinal.DAO.Service.IProduitService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("produit")
@CrossOrigin("http://localhost:4200")
public class ProduitRestController {
    @Autowired
    IProduitService iProduitService;
    @PostMapping("/add")
    Produit addProduit(@RequestBody Produit p) {
        return iProduitService.addProduit(p);
    }
    @GetMapping("/findAll")
    List<Produit> findAll(){
        return  iProduitService.findAll();
    }
    @GetMapping("/{id}")
    public Produit getProduitById(@PathVariable long id) {
        return iProduitService.findById(id);
    }

    @PutMapping("update/{id}")
    Produit updateProduit(@PathVariable("id") Long id, @RequestBody Produit b){
        return iProduitService.editProduit(id, b);
    }
    @DeleteMapping("delete/{id}")
    public void  deleteProduit(@PathVariable("id") Long id){
        iProduitService.deleteProduit(id);

    }

}