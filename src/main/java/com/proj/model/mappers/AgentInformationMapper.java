package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.AgentInformationDTO;
import com.proj.model.entities.AgentInformationEntity;

@Mapper(config = CommonMapperConfig.class, uses = {AddressMapper.class, GenderMapper.class, BankBranchMapper.class, RoleMapper.class})
public interface AgentInformationMapper {
    AgentInformationMapper INSTANCE = Mappers.getMapper(AgentInformationMapper.class);

    AgentInformationDTO entityToDto(AgentInformationEntity entity);
    AgentInformationEntity dtoToEntity(AgentInformationDTO dto);
}
