package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.controllers;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.ProductComment;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts.ProductCommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productComments")
public class ProductCommentController {
    private ProductCommentService productCommentService;

    public ProductCommentController(ProductCommentService productCommentService) {
        this.productCommentService = productCommentService;
    }

    @GetMapping("/getAll")
    public List<ProductComment> getAll() {
        return productCommentService.getAll();
    }

    @PostMapping
    void add(ProductComment productComment) {
        productCommentService.add(productComment);
    }

    @GetMapping("/{id}")
    public ProductComment getById(@PathVariable int id) {
        return productCommentService.getById(id);

    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        productCommentService.deleteById(id);
    }

    @PutMapping
    public void update(@RequestBody ProductComment productComment) {
        productCommentService.update(productComment);
    }
}
