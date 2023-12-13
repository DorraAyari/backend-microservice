package com.example.microservicefinal.DAO.Service;


import com.example.microservicefinal.DAO.Entities.Currency;

import java.util.List;

public interface ICurrency {

    Currency addCurrency(Currency c);
    Currency updateCurrency(long id ,Currency e);
    List<Currency> findAll();
    String delete(long id);


}
