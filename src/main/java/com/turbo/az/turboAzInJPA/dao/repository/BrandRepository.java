package com.turbo.az.turboAzInJPA.dao.repository;

import com.turbo.az.turboAzInJPA.dao.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
//    Brand findByBrandName(String brandName);

}
