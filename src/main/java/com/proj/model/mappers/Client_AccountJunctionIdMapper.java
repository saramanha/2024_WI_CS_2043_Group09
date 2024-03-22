package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.Client_AccountJunctionIdDTO;
import com.proj.model.embeddables.Client_AccountJunctionId;

@Mapper(config = CommonMapperConfig.class)
public interface Client_AccountJunctionIdMapper {
    Client_AccountJunctionIdMapper INSTANCE = Mappers.getMapper(Client_AccountJunctionIdMapper.class);

    Client_AccountJunctionIdDTO embeddableToDto(Client_AccountJunctionId entity);
    Client_AccountJunctionId dtoToEmbeddable(Client_AccountJunctionIdDTO dto);
}
