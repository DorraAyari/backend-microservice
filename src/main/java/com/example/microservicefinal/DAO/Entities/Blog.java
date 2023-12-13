package com.example.microservicefinal.DAO.Entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idblog;

    private String commet;

    private  String titre ;

    private  String description ;


}
