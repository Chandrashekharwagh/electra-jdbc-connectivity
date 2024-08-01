package com.electra.model;

import java.util.Date;

public class Orders {
    private Long id;
    private int product_id;
    private int customer_id;
    private Date orderDate;

    public Orders(Long id, int product_id, int customer_id, Date orderDate) {
        this.id = id;
        this.product_id =  product_id;
        this.customer_id =  customer_id;
        this.orderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getProduct() {
        return product_id;
    }

    public void setProduct(int product) {
        this.product_id = product;
    }

    public int getCustomer() {
        return customer_id;
    }

    public void setCustomer(int customer) {
        this.customer_id = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", product=" + product_id +
                ", customer=" + customer_id +
                ", orderDate=" + orderDate +
                '}';
    }
}
