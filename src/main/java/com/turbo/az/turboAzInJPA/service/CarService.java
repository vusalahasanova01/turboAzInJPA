package com.turbo.az.turboAzInJPA.service;

import com.turbo.az.turboAzInJPA.dao.entity.Car;
import com.turbo.az.turboAzInJPA.dto.request.CarRequest;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    List<Car> getCarsByBrand(String brandName);

    List<Car> getCarsByBrandAndModelAndColour(String brandName, String modelName, String colour);

    List<Car> getCarsByBrandAndModel(String brandName);

    List<Car> getCarsByColour(String colour);

    void deleteCarById(Long id);

    Car updateCar(Long id, CarRequest carRequest);

}
