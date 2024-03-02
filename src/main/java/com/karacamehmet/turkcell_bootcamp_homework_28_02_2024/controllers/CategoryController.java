package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.controllers;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Category;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/getAll")
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @PostMapping
    void add(Category category) {
        categoryService.add(category);
    }

    @GetMapping("/{id}")
    public Category getById(@PathVariable int id) {
        return categoryService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        categoryService.deleteById(id);
    }

    @PutMapping
    public void update(@RequestBody Category category) {
        categoryService.update(category);
    }

}