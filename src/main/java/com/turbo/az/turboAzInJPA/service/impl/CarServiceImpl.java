package com.turbo.az.turboAzInJPA.service.impl;

import com.turbo.az.turboAzInJPA.dao.entity.Car;
import com.turbo.az.turboAzInJPA.dao.repository.CarRepository;
import com.turbo.az.turboAzInJPA.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final BrandServiceImpl brandService;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> getCarsByBrand(String modelName) {
        return carRepository.findCarByModel(modelName);
    }

    @Override
    public List<Car> getCarsByBrandAndModelAndColour(String brandName, String modelName, String colour) {
        return null;
    }

    @Override
    public List<Car> getCarsByColour(String colour) {
        return null;
    }

    @Override
    public void deleteCarById(Long id) {
        carRepository.deleteById(id);

    }

}
