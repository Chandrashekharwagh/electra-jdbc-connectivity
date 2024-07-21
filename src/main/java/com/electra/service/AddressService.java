package com.electra.service;

import com.electra.model.Address;
import com.electra.repository.AddressRepository;

import java.util.List;

public class AddressService {

    private static final AddressRepository ADDRESS_REPO = new AddressRepository();

    public List<Address> retrieveAddresses() {
        return ADDRESS_REPO.retrieveAddresses();
    }
}
