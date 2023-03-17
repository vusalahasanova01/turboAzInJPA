package com.turbo.az.turboAzInJPA.dao.repository;

import com.turbo.az.turboAzInJPA.dao.entity.Brand;
import com.turbo.az.turboAzInJPA.dao.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findCarByModel_Brand(Brand model_brand);

    List<Car> findCarByModel_Brand_Name(String brandName);

    List<Car> findCarByModel_Name(String model_name);   //TODO: solve

    List<Car> findCarByModel_NameAndColour(String model_name, String colour); //TODO: solve

    List<Car> findCarByColour(String colour);

    List<Car> findCarByPriceIsBetween(double price, double price2);

}
