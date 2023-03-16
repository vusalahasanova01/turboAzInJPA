package com.turbo.az.turboAzInJPA.controller;

import com.turbo.az.turboAzInJPA.dao.entity.Car;
import com.turbo.az.turboAzInJPA.dto.request.CarRequest;
import com.turbo.az.turboAzInJPA.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/get-all-cars")
    List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/get-cars-by-brand/brandName/{brandName}")
    public List<Car> getCarsByBrand(@PathVariable String brandName) {
        return carService.getCarsByBrand(brandName);
    }

    @DeleteMapping("/delete-car-by-id/id/{id}")
    public void deleteCarById(@PathVariable Long id) {
        carService.deleteCarById(id);
    }

    @GetMapping("/get-cars-by-colour/colour/{colour}")
    public List<Car> getCarsByColour(@PathVariable String colour) {
        return carService.getCarsByColour(colour);
    }

    @GetMapping("/get-available-cars")
    public List<Car> getAvailableCars() {
        return carService.getAvailableCars();
    }

    @PutMapping("/id/{carId}")
    public ResponseEntity<Car> updateCar(@PathVariable Long carId, @RequestBody CarRequest carRequest) {
        Car updatedCar = carService.updateCar(carId, carRequest);
        return ResponseEntity.ok(updatedCar);
    }

    @GetMapping("/get-cars-by-price/price1/{price1}/price2/{price2}")
    public List<Car> getCarsByPrice(@PathVariable double price1, @PathVariable double price2) {
        return carService.getCarsByPrice(price1, price2);
    }
}
