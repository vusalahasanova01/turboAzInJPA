package com.turbo.az.turboAzInJPA.dao.repository;

import com.turbo.az.turboAzInJPA.dao.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, JpaRepository> {

    // List<Car> findCarByModelBrand(String brandName);

    List<Car> findCarByModelBrand_BrandName(String brandName);

    List<Car> findCarByModel(String brandName);

    void deleteById(Long id);
}
