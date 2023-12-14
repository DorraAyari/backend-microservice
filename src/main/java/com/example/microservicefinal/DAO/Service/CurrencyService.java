package com.example.microservicefinal.DAO.Service;

import com.example.microservicefinal.DAO.Entities.Currency;
import com.example.microservicefinal.DAO.Repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired; // Ajout de cette importation
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService implements ICurrency {

    @Autowired // Ajout de cette annotation pour l'injection de dépendances
    CurrencyRepository currencyRepository;

    @Override
    public Currency addCurrency(Currency currency) {
        return currencyRepository.save(currency);
    }
    @Override

    public Currency updateCurrency(long id, Currency newCurrency) {
        if (currencyRepository.findById(id).isPresent()) {
            Currency existingCurrency = currencyRepository.findById(id).get();
            existingCurrency.setCode(newCurrency.getCode());
            existingCurrency.setName(newCurrency.getName());
            existingCurrency.setSymbol(newCurrency.getSymbol());
            return currencyRepository.save(existingCurrency);
        } else {
            return null;
        }
    }



    @Override
    public List<Currency> findAll() {
        return currencyRepository.findAll();
    }

    @Override
    public Currency findAllById(long id) {
        return currencyRepository.findById(id).get();
    }

    @Override
    public String delete(long id) {
        if (currencyRepository.findById(id).isPresent()) {
            currencyRepository.deleteById(id);
            return "Currency supprimé";
        } else {
            return "Currency non supprimé";
        }
    }
}
