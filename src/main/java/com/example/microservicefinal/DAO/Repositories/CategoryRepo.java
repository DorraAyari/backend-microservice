package com.example.microservicefinal.DAO.Repositories;
import com.example.microservicefinal.DAO.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
