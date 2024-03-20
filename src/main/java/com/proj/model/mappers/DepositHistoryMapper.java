package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.DepositHistoryDTO;
import com.proj.model.entities.DepositHistoryEntity;

@Mapper(config = CommonMapperConfig.class, 
        uses = {AgentInformationMapper.class, AccountInformationMapper.class, TransactionStatusMapper.class,
                CurrencyMapper.class})
public interface DepositHistoryMapper {
    DepositHistoryMapper INSTANCE = Mappers.getMapper(DepositHistoryMapper.class);

    DepositHistoryDTO entityToDto(DepositHistoryEntity entity);
    DepositHistoryEntity dtoToEntity(DepositHistoryDTO dto);
}
