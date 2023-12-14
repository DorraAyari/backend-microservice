package com.example.microservicefinal.DAO.Service;


import com.example.microservicefinal.DAO.Entities.Blog;
import com.example.microservicefinal.DAO.Entities.Currency;

import java.util.List;

public interface ICurrency {

    Currency addCurrency(Currency c);
    Currency updateCurrency(long id ,Currency e);
    List<Currency> findAll();
    Currency findAllById(long id);
    String delete(long id);


}
