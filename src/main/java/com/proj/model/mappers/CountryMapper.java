package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.CountryDTO;
import com.proj.model.entities.CountryEntity;

@Mapper(config = CommonMapperConfig.class)
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    CountryDTO entityToDto(CountryEntity entity);
    CountryEntity dtoToEntity(CountryDTO dto);
}
