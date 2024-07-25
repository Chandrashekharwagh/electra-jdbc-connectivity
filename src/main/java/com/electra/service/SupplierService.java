package com.electra.service;


import com.electra.model.Supplier;
import com.electra.repository.SupplierRepository;
import java.util.List;

public class SupplierService {
    private static final SupplierRepository SUPPLIER_REPO = new SupplierRepository();

    public List<Supplier> retrieveSupplier() {
        return SUPPLIER_REPO.retrieveSupplier();

    }
}
