package com.proj.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proj.model.repositories.AgentInformationRepository;
import com.proj.model.dtos.AgentInformationDTO;
import com.proj.model.mappers.AgentInformationMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientSearchService {
    private final AgentInformationRepository agentInformationRepository;

    @Autowired
    public ClientSearchService(AgentInformationRepository agentInformationRepository) {
        this.agentInformationRepository = agentInformationRepository;
    }

    public List<AgentInformationDTO> searchClientsByLastName(String lastName) {
        List<AgentInformationDTO> clients = agentInformationRepository.findAllByLastName(lastName)
                                                .stream()
                                                .map(agent -> AgentInformationMapper.INSTANCE.entityToDto(agent))
                                                .collect(Collectors.toList());
        return clients;
    }
}
