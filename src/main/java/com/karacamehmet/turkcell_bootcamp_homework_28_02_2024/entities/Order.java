package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private int id;
    private int customerId;
    private Date date;
    private String shippingAddress;
    private double totalPrice;

    public Order(int id, int customerId, Date date, String shippingAddress, double totalPrice) {
        this.setId(id);
        this.setCustomerId(customerId);
        this.setDate(date);
        this.setShippingAddress(shippingAddress);
        this.setTotalPrice(totalPrice);
    }

    public Order(int customerId, Date date, String shippingAddress, double totalPrice) {
        this.setCustomerId(customerId);
        this.setDate(date);
        this.setShippingAddress(shippingAddress);
        this.setTotalPrice(totalPrice);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
