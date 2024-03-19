package com.proj.model.mappers;

import org.mapstruct.Mapper;

@Mapper(uses = {CurrencyMapper.class, AccountTypeMapper.class})
public interface AccountInformationMapper {
    
}
