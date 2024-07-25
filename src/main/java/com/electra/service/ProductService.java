package com.electra.service;


import com.electra.model.Product;
import com.electra.repository.ProductRepository;

import java.util.List;

public class ProductService {
    private static final ProductRepository PRODUCT_REPO = new ProductRepository();

    public List<Product> retrieveProducts() {
        return PRODUCT_REPO.retrieveProducts();

    }
}
