package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.DocumentDTO;
import com.proj.model.entities.DocumentEntity;

@Mapper(config = CommonMapperConfig.class, uses = {DocumentTypeMapper.class, AgentInformationMapper.class})
public interface DocumentMapper {
    DocumentMapper INSTANCE = Mappers.getMapper(DocumentMapper.class);

    DocumentDTO entityToDto(DocumentEntity entity);
    DocumentEntity dtoToEntity(DocumentDTO dto);
}
