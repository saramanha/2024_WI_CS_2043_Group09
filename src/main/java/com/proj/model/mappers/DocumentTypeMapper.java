package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.DocumentTypeDTO;
import com.proj.model.entities.DocumentTypeEntity;

@Mapper(config = CommonMapperConfig.class)
public interface DocumentTypeMapper {
    DocumentTypeMapper INSTANCE = Mappers.getMapper(DocumentTypeMapper.class);

    DocumentTypeDTO entityToDto(DocumentTypeEntity entity);
    DocumentTypeEntity dtoToEntity(DocumentTypeDTO dto);
}
