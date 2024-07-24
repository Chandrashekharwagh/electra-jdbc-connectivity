package com.electra.model;

import java.util.Date;

public class Orders {
    private Long id;
    private String product;
    private String customer;
    private Date orderDate;

    public Orders(Long id, String product, String customer, Date orderDate) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
