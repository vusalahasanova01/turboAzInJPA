package com.turbo.az.turboAzInJPA.dao.repository;

import com.turbo.az.turboAzInJPA.dao.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findCarByModelBrand_BrandName(String brandName);

    List<Car> findCarByModel(String modelName);

    List<Car> findCarByColour(String colour);


}
