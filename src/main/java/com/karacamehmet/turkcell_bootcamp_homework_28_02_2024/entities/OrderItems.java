package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities;

public class OrderItems {
    private int id;
    private int orderId;
    private int productId;
    private int amount;
    private float unitPrice;

    public OrderItems(int id, int orderId, int productId, int amount, float unitPrice) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public float getTotalPrice() {
        return amount * unitPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
