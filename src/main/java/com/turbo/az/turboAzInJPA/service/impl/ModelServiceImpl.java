package com.turbo.az.turboAzInJPA.service.impl;

import com.turbo.az.turboAzInJPA.dao.entity.Model;
import com.turbo.az.turboAzInJPA.dao.repository.ModelRepository;
import com.turbo.az.turboAzInJPA.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelServiceImpl implements ModelService {

    private final ModelRepository modelRepository;

    @Override
    public List<Model> getModelsByBrand(String brandName) {
        return modelRepository.findModelByBrand(brandName);
    }
}
