package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.concretes;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Category;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts.CategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
    private List<Category> categories;

    public CategoryRepositoryImpl() {
        this.categories = new ArrayList<>();
        categories.add(new Category(1, "Market"));
        categories.add(new Category(2, "Technology"));
    }

    @Override
    public List<Category> getAll() {
        return categories;
    }

    @Override
    public void add(Category category) {
        categories.add(category);
    }

    @Override
    public Category getById(int id) {
        for (Category i : categories
        ) {
            if (i.getId() == id) {
                return i;
            }

        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        int index = getCategoryIndexById(id);
        if (index != -1) {
            categories.remove(index);
        }
    }

    @Override
    public void update(Category category) {
        for (Category i : categories
        ) {
            if (i.getId() == category.getId()) {
                i.setName(category.getName());
            }

        }
    }

    public int getCategoryIndexById(int id) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getId() == id) {
                return i;
            }

        }
        return -1;
    }
}