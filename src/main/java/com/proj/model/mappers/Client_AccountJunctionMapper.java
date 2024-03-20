package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.Client_AccountJunctionDTO;
import com.proj.model.entities.Client_AccountJunctionEntity;

@Mapper(config = CommonMapperConfig.class, uses = {Client_AccountJunctionIdMapper.class, AgentInformationMapper.class, AccountInformationMapper.class})
public interface Client_AccountJunctionMapper {
    Client_AccountJunctionMapper INSTANCE = Mappers.getMapper(Client_AccountJunctionMapper.class);

    Client_AccountJunctionDTO entityToDto(Client_AccountJunctionEntity entity);
    Client_AccountJunctionEntity dtoToEntity(Client_AccountJunctionDTO dto);
}
