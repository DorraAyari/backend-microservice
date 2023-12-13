package com.example.microservicefinal.DAO.Repositories;

import com.example.microservicefinal.DAO.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepositorie extends JpaRepository<Produit, Long> {

}
