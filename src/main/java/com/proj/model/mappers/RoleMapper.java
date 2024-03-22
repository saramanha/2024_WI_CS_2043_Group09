package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.RoleDTO;
import com.proj.model.entities.RoleEntity;

@Mapper(config = CommonMapperConfig.class)
public interface RoleMapper {
    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    RoleDTO entityToDto(RoleEntity entity);
    RoleEntity dtoToEntity(RoleDTO dto);
}
