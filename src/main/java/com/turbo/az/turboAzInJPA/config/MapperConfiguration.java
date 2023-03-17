package com.turbo.az.turboAzInJPA.config;

import com.turbo.az.turboAzInJPA.mapper.BrandMapper;
import com.turbo.az.turboAzInJPA.mapper.CarMapper;
import com.turbo.az.turboAzInJPA.mapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        return ModelMapper.INSTANCE;
    }

    @Bean
    public BrandMapper brandMapper() {
        return BrandMapper.INSTANCE;
    }

    @Bean
    public CarMapper carMapper() {
        return CarMapper.INSTANCE;
    }

}