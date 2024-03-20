package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.CurrencyConversionDTO;
import com.proj.model.entities.CurrencyConversionEntity;

@Mapper(config = CommonMapperConfig.class, uses = {CurrencyConversionIdMapper.class, CurrencyMapper.class})
public interface CurrencyConversionMapper {
    CurrencyConversionMapper INSTANCE = Mappers.getMapper(CurrencyConversionMapper.class);

    CurrencyConversionDTO entityToDto(CurrencyConversionEntity entity);
    CurrencyConversionEntity dtoToEntity(CurrencyConversionDTO dto);
}
