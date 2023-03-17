package com.turbo.az.turboAzInJPA.dao.repository;

import com.turbo.az.turboAzInJPA.dao.entity.Brand;
import com.turbo.az.turboAzInJPA.dao.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Long> {

    List<Model> findModelByBrand_Name(String brandName);
}
