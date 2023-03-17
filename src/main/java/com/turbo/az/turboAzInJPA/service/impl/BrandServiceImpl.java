package com.turbo.az.turboAzInJPA.service.impl;

import com.turbo.az.turboAzInJPA.dao.entity.Brand;
import com.turbo.az.turboAzInJPA.dao.repository.BrandRepository;
import com.turbo.az.turboAzInJPA.dto.request.BrandRequest;
import com.turbo.az.turboAzInJPA.mapper.BrandMapper;
import com.turbo.az.turboAzInJPA.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    private final BrandMapper brandMapper;

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @Override
    public void add(BrandRequest brandRequest) {
        brandRepository.save(brandMapper.toBrand(brandRequest));
    }

}
