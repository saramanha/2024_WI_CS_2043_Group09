package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.TransactionHistoryDTO;
import com.proj.model.entities.TransactionHistoryEntity;

@Mapper(config = CommonMapperConfig.class, 
        uses = {TransactionHistoryIdMapper.class, DepositHistoryMapper.class,
                WithdrawalHistoryMapper.class, TransactionTypeMapper.class, TransactionStatusMapper.class})
public interface TransactionHistoryMapper {
    TransactionHistoryMapper INSTANCE = Mappers.getMapper(TransactionHistoryMapper.class);

    TransactionHistoryDTO entityToDto(TransactionHistoryEntity entity);
    TransactionHistoryEntity dtoToEntity(TransactionHistoryDTO dto);
}
