package com.turbo.az.turboAzInJPA.service.impl;

import com.turbo.az.turboAzInJPA.dao.entity.Model;
import com.turbo.az.turboAzInJPA.dao.repository.ModelRepository;
import com.turbo.az.turboAzInJPA.dto.response.GetAllModelResponse;
import com.turbo.az.turboAzInJPA.mapper.ModelMapper;
import com.turbo.az.turboAzInJPA.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ModelServiceImpl implements ModelService {

    private final ModelRepository modelRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<GetAllModelResponse> getModelsByBrand(String brandName) {
        List<Model> models = modelRepository.findModelByBrand_Name(brandName);

        return models.stream()
                .map(modelMapper::toGetAllModelResponse)
                .collect(Collectors.toList());
    }

}

