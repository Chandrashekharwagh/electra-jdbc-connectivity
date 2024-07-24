package com.electra.service;

import com.electra.model.Customer;
import com.electra.repository.CustomerRepository;
import java.util.List;

public class CustomerService {
    private static final CustomerRepository CUSTOMER_REPO = new CustomerRepository();

    public List<Customer> retrieveCustomers() {
        return CUSTOMER_REPO.retrieveCustomers();
    }
}
