package com.turbo.az.turboAzInJPA.service;

import com.turbo.az.turboAzInJPA.dto.response.GetAllModelResponse;

import java.util.List;

public interface ModelService {

    List<GetAllModelResponse> getModelsByBrand(String brandName);

}
