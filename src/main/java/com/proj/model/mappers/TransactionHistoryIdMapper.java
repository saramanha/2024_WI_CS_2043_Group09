package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.TransactionHistoryIdDTO;
import com.proj.model.embeddables.TransactionHistoryId;

@Mapper(config = CommonMapperConfig.class)
public interface TransactionHistoryIdMapper {
    TransactionHistoryIdMapper INSTANCE = Mappers.getMapper(TransactionHistoryIdMapper.class);

    TransactionHistoryIdDTO entityToDto(TransactionHistoryId entity);
    TransactionHistoryId dtoToEmbeddable(TransactionHistoryIdDTO dto);
}
