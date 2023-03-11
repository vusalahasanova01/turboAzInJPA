package com.turbo.az.turboAzInJPA.service;

import com.turbo.az.turboAzInJPA.dao.entity.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandService {

    List<Brand> getAllBrands();
    Optional<Brand> getBrandByName(String brandName);
}
