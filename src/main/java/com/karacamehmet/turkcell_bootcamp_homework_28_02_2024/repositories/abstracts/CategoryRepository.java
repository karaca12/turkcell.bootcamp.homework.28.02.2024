package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> getAll();

    void add(Category category);

    Category getById(int id);

    void deleteById(int id);

    void update(Category category);
}