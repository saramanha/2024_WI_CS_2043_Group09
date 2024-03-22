package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.CredentialDTO;
import com.proj.model.entities.CredentialEntity;

@Mapper(config = CommonMapperConfig.class, uses = {AgentInformationMapper.class})
public interface CredentialMapper {
    CredentialMapper INSTANCE = Mappers.getMapper(CredentialMapper.class);

    CredentialDTO entityToDto(CredentialEntity entity);
    CredentialEntity dtoToEntity(CredentialDTO dto);
}
