package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.concretes;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.ProductComment;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts.ProductCommentRepository;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts.ProductCommentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCommentServiceImp implements ProductCommentService {
    private ProductCommentRepository productCommentRepository;

    public ProductCommentServiceImp(ProductCommentRepository productCommentRepository) {
        this.productCommentRepository = productCommentRepository;
    }

    @Override
    public List<ProductComment> getAll() {
        return productCommentRepository.getAll();
    }

    @Override
    public void add(ProductComment productComment) {
        productCommentRepository.add(productComment);
    }

    @Override
    public ProductComment getById(int id) {
        return productCommentRepository.getById(id);
    }

    @Override
    public void deleteById(int id) {
        productCommentRepository.deleteById(id);
    }

    @Override
    public void update(ProductComment productComment) {
        productCommentRepository.update(productComment);
    }
}
