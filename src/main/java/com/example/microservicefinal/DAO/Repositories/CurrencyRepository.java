package com.example.microservicefinal.DAO.Repositories;
import com.example.microservicefinal.DAO.Entities.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,Long> {
}
