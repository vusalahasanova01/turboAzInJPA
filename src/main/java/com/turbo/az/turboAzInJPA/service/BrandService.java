package com.turbo.az.turboAzInJPA.service;

import com.turbo.az.turboAzInJPA.dao.entity.Brand;
import com.turbo.az.turboAzInJPA.dto.request.BrandRequest;

import java.util.List;

public interface BrandService {

    List<Brand> getAllBrands();

    void add(BrandRequest brandRequest);

}
