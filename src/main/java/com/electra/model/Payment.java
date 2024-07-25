package com.electra.model;

import java.util.Date;

public class Payment{
    private Long id;
    private Double amount;
    private Date paymentDate;
    private Customer customer;
    private Orders order;

    public Payment(Long id, Double amount, Date paymentDate, Object customer, Object orders) {
        this.id = id;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.customer = (Customer)customer;
        this.order = (Orders) orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Object getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders orders) {
        this.order = orders;
    }
}
