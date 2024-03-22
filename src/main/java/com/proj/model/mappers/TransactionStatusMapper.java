package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.TransactionStatusDTO;
import com.proj.model.entities.TransactionStatusEntity;

@Mapper(config = CommonMapperConfig.class)
public interface TransactionStatusMapper {
    TransactionStatusMapper INSTANCE = Mappers.getMapper(TransactionStatusMapper.class);

    TransactionStatusDTO entityToDto(TransactionStatusEntity entity);
    TransactionStatusEntity dtoToEntity(TransactionStatusDTO dto);
}
