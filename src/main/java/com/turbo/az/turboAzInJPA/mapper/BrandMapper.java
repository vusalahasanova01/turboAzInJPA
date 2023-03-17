package com.turbo.az.turboAzInJPA.mapper;

import com.turbo.az.turboAzInJPA.dao.entity.Brand;
import com.turbo.az.turboAzInJPA.dao.entity.Model;
import com.turbo.az.turboAzInJPA.dto.request.BrandRequest;
import com.turbo.az.turboAzInJPA.dto.response.GetAllModelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BrandMapper {

    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);

    Brand toBrand(BrandRequest brandRequest);
}
