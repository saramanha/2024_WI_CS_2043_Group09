package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.DutyHistoryDTO;
import com.proj.model.entities.DutyHistoryEntity;

@Mapper(config = CommonMapperConfig.class, uses = {BankBranchMapper.class})
public interface DutyHistoryMapper {
    DutyHistoryMapper INSTANCE = Mappers.getMapper(DutyHistoryMapper.class);

    DutyHistoryDTO entityToDto(DutyHistoryEntity entity);
    DutyHistoryEntity dtoToEntity(DutyHistoryDTO dto);
}
