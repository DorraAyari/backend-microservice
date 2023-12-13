package com.example.microservicefinal.DAO.Service;

import com.example.microservicefinal.DAO.Entities.Category;
import com.example.microservicefinal.DAO.Repositories.CategoryRepo;
import com.example.microservicefinal.DAO.Service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CategoryService implements ICategoryService {


    @Autowired
    private CategoryRepo categoryRepository;
    @Override
    public Category addCategory(Category p) {
        return categoryRepository.save(p);

    }
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id).get();
    }
    @Override
    public Category editCategory(int id, Category c) {
        if(categoryRepository.findById(id).isPresent()){
            Category toUpdateCategory = categoryRepository.findById(id).get();
            toUpdateCategory.setNameCategory(c.getNameCategory());
            toUpdateCategory.setDescriptionCategory(c.getDescriptionCategory());

            return categoryRepository.save(toUpdateCategory);
        }
        return null;
    }

    @Override
    public String deleteCategory(int id) {
        if(categoryRepository.findById(id).isPresent()){
            categoryRepository.deleteById(id);
            return "Category deleted";
        }
        return null;
    }
}
