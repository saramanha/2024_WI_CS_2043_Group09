package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.CurrencyDTO;
import com.proj.model.entities.CurrencyEntity;

@Mapper(config = CommonMapperConfig.class)
public interface CurrencyMapper {
    CurrencyMapper INSTANCE = Mappers.getMapper(CurrencyMapper.class);

    CurrencyDTO entityToDto(CurrencyEntity entity);
    CurrencyEntity dtoToEntity(CurrencyDTO dto);
}
