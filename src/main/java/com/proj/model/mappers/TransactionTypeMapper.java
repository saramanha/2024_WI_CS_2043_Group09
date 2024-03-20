package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.TransactionTypeDTO;
import com.proj.model.entities.TransactionTypeEntity;

@Mapper(config = CommonMapperConfig.class)
public interface TransactionTypeMapper {
    TransactionTypeMapper INSTANCE = Mappers.getMapper(TransactionTypeMapper.class);

    TransactionTypeDTO entityToDto(TransactionTypeEntity entity);
    TransactionTypeEntity dtoToEntity(TransactionTypeDTO dto);
}
