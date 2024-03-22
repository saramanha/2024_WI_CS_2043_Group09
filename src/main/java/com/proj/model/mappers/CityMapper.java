package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.CityDTO;
import com.proj.model.entities.CityEntity;

@Mapper(config = CommonMapperConfig.class)
public interface CityMapper {
    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    CityDTO entityToDto(CityEntity entity);
    CityEntity dtoToEntity(CityDTO dto);
}
