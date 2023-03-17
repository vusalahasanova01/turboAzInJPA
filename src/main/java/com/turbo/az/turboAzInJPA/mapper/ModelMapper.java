package com.turbo.az.turboAzInJPA.mapper;

import com.turbo.az.turboAzInJPA.dao.entity.Model;
import com.turbo.az.turboAzInJPA.dto.response.GetAllModelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ModelMapper {

    ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);

    @Mapping(target = "brandName", source = "brand.name")
    GetAllModelResponse toGetAllModelResponse(Model model);

}
