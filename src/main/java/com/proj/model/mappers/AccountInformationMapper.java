package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.AccountInformationDTO;
import com.proj.model.entities.AccountInformationEntity;

@Mapper(config = CommonMapperConfig.class, uses = {CurrencyMapper.class, AccountTypeMapper.class})
public interface AccountInformationMapper {
    AccountInformationMapper INSTANCE = Mappers.getMapper(AccountInformationMapper.class);

    AccountInformationDTO entityToDto(AccountInformationEntity entity);
    AccountInformationEntity dtoToEntity(AccountInformationDTO dto);
}
