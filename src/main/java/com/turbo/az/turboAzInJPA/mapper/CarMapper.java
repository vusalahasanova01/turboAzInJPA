package com.turbo.az.turboAzInJPA.mapper;

import com.turbo.az.turboAzInJPA.dao.entity.Car;
import com.turbo.az.turboAzInJPA.dto.request.CarRequest;
import org.mapstruct.factory.Mappers;

public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    Car toCar(CarRequest carRequest);
}
