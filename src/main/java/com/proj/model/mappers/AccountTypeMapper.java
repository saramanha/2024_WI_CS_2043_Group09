package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.AccountTypeDTO;
import com.proj.model.entities.AccountTypeEntity;

@Mapper(config = CommonMapperConfig.class)
public interface AccountTypeMapper {
    AccountTypeMapper INSTANCE = Mappers.getMapper(AccountTypeMapper.class);

    AccountTypeDTO entityToDto(AccountTypeEntity entity);
    AccountTypeEntity dtoToEntity(AccountTypeDTO dto);
}
