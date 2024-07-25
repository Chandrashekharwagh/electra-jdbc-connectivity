package com.electra.model;

public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer brand_id;
    private Integer supplier_id;


    public Product(Long id, String name, String description, Double price, Integer brand_id, Integer supplier_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand_id=  brand_id;
        this.supplier_id = supplier_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }
}
