package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.ProvinceDTO;
import com.proj.model.entities.ProvinceEntity;

@Mapper(config = CommonMapperConfig.class)
public interface ProvinceMapper {
    ProvinceMapper INSTANCE = Mappers.getMapper(ProvinceMapper.class);

    ProvinceDTO entityToDto(ProvinceEntity entity);
    ProvinceEntity dtoToEntity(ProvinceDTO dto);
}
