package com.turbo.az.turboAzInJPA.service;

import com.turbo.az.turboAzInJPA.dao.entity.Car;
import com.turbo.az.turboAzInJPA.dto.request.CarRequest;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    List<Car> getAvailableCars();

    List<Car> getCarsByBrand(String brandName);

    List<Car> getCarsByModelName(String modelName);

    List<Car> getCarsByModelNameAndColour(String modelName, String colour);

//    List<Car> getCarsByBrandAndModel();

    List<Car> getCarsByColour(String colour);

    void deleteCarById(Long id);

    Car updateCar(Long id, CarRequest carRequest);

    List<Car> getCarsByPrice(double price1, double price2);
}
