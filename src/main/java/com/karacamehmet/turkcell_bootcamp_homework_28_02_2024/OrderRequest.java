package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024;

import java.util.Date;

public class OrderRequest {
    private int customerId;
    private Date date;
    private String shippingAddress;
    private double totalPrice;

    public int getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
