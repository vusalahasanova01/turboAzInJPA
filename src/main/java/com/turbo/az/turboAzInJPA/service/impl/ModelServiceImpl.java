package com.turbo.az.turboAzInJPA.service.impl;

import com.turbo.az.turboAzInJPA.dao.entity.Model;
import com.turbo.az.turboAzInJPA.dao.repository.ModelRepository;
import com.turbo.az.turboAzInJPA.dto.response.GetAllModelResponse;
import com.turbo.az.turboAzInJPA.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ModelServiceImpl implements ModelService {

    private final ModelRepository modelRepository;

    @Override
    public List<Model> getModelsByBrand(String brandName) {
        return modelRepository.findModelByBrand(brandName);
    }
//    private final ModelMapperService modelMapperService;

//    @Override
//    public List<GetAllModelResponse> getModelsByBrand(String brandName) {
//        List<Model> models = modelRepository.findModelByBrand(brandName);
//
//        List<GetAllModelResponse> modelsResponse = models.stream()
//                .map(model -> this.modelMapperService.forResponse())
//                .map(models, GetAllModelResponse.class).collect(Collectors.toList());
//
//        return modelsResponse;
//}
}

