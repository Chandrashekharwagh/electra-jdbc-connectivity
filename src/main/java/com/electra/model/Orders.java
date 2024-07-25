package com.electra.model;

import java.util.Date;

public class Orders {
    private Long id;
    private Product product;
    private Customer customer;
    private Date orderDate;

    public Orders(Long id, Object product, Object customer, Date orderDate) {
        this.id = id;
        this.product = (Product) product;
        this.customer = (Customer) customer;
        this.orderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
