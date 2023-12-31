package com.example.microservicefinal.DAO.RestController;


import com.example.microservicefinal.DAO.Entities.Blog;
import com.example.microservicefinal.DAO.Entities.Currency;
import com.example.microservicefinal.DAO.Service.ICurrency;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Currency")
@AllArgsConstructor
@CrossOrigin("http://localhost:4200")
public class CurrencyController {

    @Autowired
    ICurrency currency;

    @PostMapping("/add")
    public Currency createCurrency(@RequestBody Currency c) {
        return currency.addCurrency(c); // Utilisation de l'instance 'currency'
    }
    @PutMapping("update/{id}")
    Currency updateCurrency(@PathVariable("id") Long id, @RequestBody  Currency b){
        return currency.updateCurrency(id, b);
    }
    @DeleteMapping("delete/{id}")
        void delete(@PathVariable("id") Long id ){currency.delete(id);
    }

    @GetMapping("/findAll")
        List<Currency> findAll(){
        return currency.findAll();
    }
    @GetMapping("/{id}")
    Currency findById(@PathVariable("id") Long id){
        return currency.findAllById(id);
    }

}

