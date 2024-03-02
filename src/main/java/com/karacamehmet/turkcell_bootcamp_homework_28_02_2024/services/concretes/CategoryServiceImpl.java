package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.concretes;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Category;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts.CategoryRepository;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    @Override
    public void add(Category category) {
        categoryRepository.add(category);
    }

    @Override
    public Category getById(int id) {
        return categoryRepository.getById(id);
    }

    @Override
    public void deleteById(int id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public void update(Category category) {
        categoryRepository.update(category);
    }
}