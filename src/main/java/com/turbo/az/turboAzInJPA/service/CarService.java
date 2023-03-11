package com.turbo.az.turboAzInJPA.service;

import com.turbo.az.turboAzInJPA.dao.entity.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    List<Car> getCarsByBrand(String brandName);

    List<Car> getCarsByBrandAndModelAndColour(String brandName, String modelName, String colour);

    List<Car> getCarsByColour(String colour);

    void deleteCarById(Long id);

}
