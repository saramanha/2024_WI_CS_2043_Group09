package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.AddressDTO;
import com.proj.model.entities.AddressEntity;

@Mapper(config = CommonMapperConfig.class, uses = {CityMapper.class, ProvinceMapper.class, CountryMapper.class})
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDTO entityToDto(AddressEntity entity);
    AddressEntity dtoToEntity(AddressDTO dto);
}
