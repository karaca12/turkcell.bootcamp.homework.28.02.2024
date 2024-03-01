package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Order {
    private int id;
    private int customerId;
    private Date date;
    private int count;
    private double totalPrice;
    private int productId;
}
