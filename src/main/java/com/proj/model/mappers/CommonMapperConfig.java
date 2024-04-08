package com.proj.model.mappers;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

@MapperConfig(componentModel = "default", unmappedTargetPolicy = ReportingPolicy.WARN)
public class CommonMapperConfig { }
