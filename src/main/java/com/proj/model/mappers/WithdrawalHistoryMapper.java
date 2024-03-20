package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.WithdrawalHistoryDTO;
import com.proj.model.entities.WithdrawalHistoryEntity;

@Mapper(config = CommonMapperConfig.class, 
        uses = {AgentInformationMapper.class, AccountInformationMapper.class, 
                TransactionStatusMapper.class, CurrencyMapper.class})
public interface WithdrawalHistoryMapper {
    WithdrawalHistoryMapper INSTANCE = Mappers.getMapper(WithdrawalHistoryMapper.class);

    WithdrawalHistoryDTO entityToDto(WithdrawalHistoryEntity entity);
    WithdrawalHistoryEntity dtoToEntity(WithdrawalHistoryDTO dto);
}
