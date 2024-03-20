package com.proj.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proj.model.dtos.FeedbackDTO;
import com.proj.model.entities.FeedbackEntity;

@Mapper(config = CommonMapperConfig.class, uses = {AgentInformationMapper.class})
public interface FeedbackMapper {
    FeedbackMapper INSTANCE = Mappers.getMapper(FeedbackMapper.class);

    FeedbackDTO entityToDto(FeedbackEntity entity);
    FeedbackEntity dtoToEntity(FeedbackDTO dto);
}
