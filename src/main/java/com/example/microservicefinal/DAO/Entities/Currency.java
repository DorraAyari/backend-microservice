package com.example.microservicefinal.DAO.Entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code; // Code de la devise (par exemple, USD, EUR)
    private String name; // Nom complet de la devise (par exemple, US Dollar, Euro)
    private String symbol; // Symbole de la devise (par exemple, $, €)



}
