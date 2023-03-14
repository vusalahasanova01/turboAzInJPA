package com.turbo.az.turboAzInJPA.controller;

import com.turbo.az.turboAzInJPA.dao.entity.Car;
import com.turbo.az.turboAzInJPA.service.CarService;
import lombok.RequiredArgsConstructor;
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

    @GetMapping("get-cars-by-colour/colour/{colour}")
    public List<Car> getCarsByColour(@PathVariable String colour) {
        return carService.getCarsByColour(colour);
    }


}
