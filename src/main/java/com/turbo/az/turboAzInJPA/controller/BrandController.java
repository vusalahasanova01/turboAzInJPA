package com.turbo.az.turboAzInJPA.controller;

import com.turbo.az.turboAzInJPA.dao.entity.Brand;
import com.turbo.az.turboAzInJPA.dto.request.BrandRequest;
import com.turbo.az.turboAzInJPA.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
@RequiredArgsConstructor
public class BrandController {

    private final BrandService brandService;

    @GetMapping("/get-all-brands")
    public List<Brand> getAllBrands() {
        return brandService.getAllBrands();
    }

    @PostMapping("/add-brand")
    public void add(@RequestBody BrandRequest brandRequest) {
        brandService.addBrand(brandRequest);
    }


}
