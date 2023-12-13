
package com.example.microservicefinal.DAO.RestController;

import com.example.microservicefinal.DAO.Entities.Category;
import com.example.microservicefinal.DAO.Service.ICategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("category")
public class CategoryController {

    @Autowired
    ICategoryService CategoryService;

    @PostMapping("/add")
    Category addCategory(@RequestBody Category category) {
        return CategoryService.addCategory(category);
    }
    @GetMapping("/findAll")
    List<Category> findAll(){
        return CategoryService.findAll();
    }
    @PutMapping("update/{id}")
    Category updateCategory(@PathVariable("id") int id, @RequestBody Category c){
        return CategoryService.editCategory(id, c);
    }
    @DeleteMapping("delete/{id}")
    String deleteCategory(@PathVariable("id") int id){
        return CategoryService.deleteCategory(id);
    }
}
