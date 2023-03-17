package com.turbo.az.turboAzInJPA.service.impl;

import com.turbo.az.turboAzInJPA.dao.entity.Car;
import com.turbo.az.turboAzInJPA.dao.repository.CarRepository;
import com.turbo.az.turboAzInJPA.dto.request.CarRequest;
import com.turbo.az.turboAzInJPA.mapper.CarMapper;
import com.turbo.az.turboAzInJPA.model.CarState;
import com.turbo.az.turboAzInJPA.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;


    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> getAvailableCars() {
        return carRepository.findAll()
                .stream()
                .filter(this::isCarState)
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsByBrand(String brandName) {
        return carRepository.findCarByModel_Brand_Name(brandName);
    }

    @Override
    public List<Car> getCarsByModelName(String modelName) {
        return carRepository.findCarByModel_Name(modelName);
    }

    @Override
    public List<Car> getCarsByModelNameAndColour(String modelName, String colour) {
        return carRepository.findCarByModel_NameAndColour(modelName, colour);
    }

    @Override
    public List<Car> getCarsByColour(String colour) {
        return carRepository.findCarByColour(colour);
    }

    @Override
    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public Car updateCar(Long id, CarRequest carRequest) {
        return carRepository.save(carMapper.toCar(carRequest));
    }

    @Override
    public List<Car> getCarsByPrice(double price1, double price2) {
        return carRepository.findCarByPriceIsBetween(price1, price2);
    }

    private boolean isCarState(Car car) {
        if (Objects.isNull(car)) return false;
        return CarState.AVAILABLE.equals(car.getCarState());
    }

}
