package com.turbo.az.turboAzInJPA.service;

import com.turbo.az.turboAzInJPA.dao.entity.Model;

import java.util.List;

public interface ModelService {
    List<Model> getModelsByBrand(String brandName);


}
