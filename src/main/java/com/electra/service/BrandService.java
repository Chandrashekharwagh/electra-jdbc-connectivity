package com.electra.service;

import com.electra.model.Brand;
import com.electra.repository.BrandRepository;
import java.util.List;

public class BrandService {
    private static final BrandRepository BRAND_REPO = new BrandRepository();

    public List<Brand> retrieveBrands() {
        return BRAND_REPO.retrieveBrands();
    }
}
