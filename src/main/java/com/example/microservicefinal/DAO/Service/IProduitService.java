package com.example.microservicefinal.DAO.Service;

import com.example.microservicefinal.DAO.Entities.Produit;

import java.util.List;

public interface IProduitService {
    Produit addProduit(Produit p);
    List<Produit> findAll();
    Produit findById(long id);
    Produit editProduit(Long id, Produit f);
    String deleteProduit(long id);

}
