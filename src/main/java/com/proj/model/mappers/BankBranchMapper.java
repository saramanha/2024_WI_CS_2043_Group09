package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.BankBranchDTO;
import com.proj.model.entities.BankBranchEntity;

@Mapper(config = CommonMapperConfig.class, uses = {AddressMapper.class})
public interface BankBranchMapper {
    BankBranchMapper INSTANCE = Mappers.getMapper(BankBranchMapper.class);

    BankBranchDTO entityToDto(BankBranchEntity entity);
    BankBranchEntity dtoToEntity(BankBranchDTO dto);
}
