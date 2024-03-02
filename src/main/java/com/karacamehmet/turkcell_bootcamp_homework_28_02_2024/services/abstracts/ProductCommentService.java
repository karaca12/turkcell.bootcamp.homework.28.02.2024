package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.ProductComment;

import java.util.List;

public interface ProductCommentService {
    List<ProductComment> getAll();

    void add(ProductComment productComment);

    ProductComment getById(int id);

    void deleteById(int id);

    void update(ProductComment productComment);
}
