package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.GenderDTO;
import com.proj.model.entities.GenderEntity;

@Mapper(config = CommonMapperConfig.class)
public interface GenderMapper {
    GenderMapper INSTANCE = Mappers.getMapper(GenderMapper.class);

    GenderDTO entityToDto(GenderEntity entity);
    GenderEntity dtoToEntity(GenderDTO dto);
}
