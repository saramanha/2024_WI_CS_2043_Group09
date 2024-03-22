package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.CurrencyConversionIdDTO;
import com.proj.model.embeddables.CurrencyConversionId;

@Mapper(config = CommonMapperConfig.class)
public interface CurrencyConversionIdMapper {
    CurrencyConversionIdMapper INSTANCE = Mappers.getMapper(CurrencyConversionIdMapper.class);

    CurrencyConversionIdDTO entityToDto(CurrencyConversionId entity);
    CurrencyConversionId dtoToEmbeddable(CurrencyConversionIdDTO dto);
}
