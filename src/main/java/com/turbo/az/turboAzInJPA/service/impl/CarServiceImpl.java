package com.turbo.az.turboAzInJPA.service.impl;

import com.turbo.az.turboAzInJPA.dao.entity.Car;
import com.turbo.az.turboAzInJPA.dao.entity.Model;
import com.turbo.az.turboAzInJPA.dao.repository.CarRepository;
import com.turbo.az.turboAzInJPA.dto.request.CarRequest;
import com.turbo.az.turboAzInJPA.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> getCarsByBrand(String modelName) {
        return null;
        // return carRepository.findCarByModel(modelName);
    }

//    @Override
//    public List<Car> getCarsByBrandAndModelAndColour(String brandName, Model modelName, String colour) {
//        return carRepository.findCarByModelAndColour(modelName, colour);
//    }

    @Override
    public List<Car> getCarsByBrandAndModel(String brandName) {
        return carRepository.findCarByModelBrand_BrandName(brandName);
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
        return carRepository.findById(id)
                .map(car -> {
                    car.setPlate(carRequest.getPlate());
                    car.setColour(carRequest.getColour());
                    car.setAdditionalInformation(carRequest.getAdditionalInform());
                    car.setPrice(carRequest.getPrice());
                    return carRepository.save(car);
                })
                .orElseThrow();
    }

}
