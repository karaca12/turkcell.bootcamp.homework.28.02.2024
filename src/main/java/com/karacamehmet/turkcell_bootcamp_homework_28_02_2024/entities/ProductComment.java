package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities;

import lombok.Data;

@Data
public class ProductComment {
    private int id;
    private int customerId;
    private int productId;
    private String comment;

    public ProductComment(int id, int customerId, int productId, String comment) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.comment = comment;
    }
}
