package com.example.microservicefinal.DAO.Service;


import com.example.microservicefinal.DAO.Entities.Category;

import java.util.List;

public interface ICategoryService {

    Category addCategory(Category category);
    List<Category> findAll();
    Category findById(int id);
    Category editCategory(int id, Category category);

    String deleteCategory(int id);
}
