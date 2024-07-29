package com.electra.model;

import java.util.Date;

public class Orders {
    private Long id;
    private int product;
    private int customer;
    private Date orderDate;

    public Orders(Long id, int product, int customer, Date orderDate) {
        this.id = id;
        this.product =  product;
        this.customer =  customer;
        this.orderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
