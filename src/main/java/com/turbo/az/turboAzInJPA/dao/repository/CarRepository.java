package com.turbo.az.turboAzInJPA.dao.repository;

import com.turbo.az.turboAzInJPA.dao.entity.Car;
import com.turbo.az.turboAzInJPA.dao.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findCarByModel(Model model);

    List<Car> findCarByModelAndColour(Model model, String colour);

    List<Car> findCarByColour(String colour);

    List<Car> findCarByPriceIsBetween(double price, double price2);


}
