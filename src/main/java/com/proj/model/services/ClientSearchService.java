package com.proj.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proj.model.repositories.AgentInformationRepository;
import com.proj.model.repositories.Client_AccountJunctionRepository;
import com.proj.model.repositories.DepositHistoryRepository;
import com.proj.model.repositories.TransactionHistoryRepository;
import com.proj.model.repositories.WithdrawalHistoryRepository;
import com.proj.model.dtos.AgentInformationDTO;
import com.proj.model.mappers.AccountInformationMapper;
import com.proj.model.mappers.AgentInformationMapper;
import com.proj.model.mappers.DepositHistoryMapper;
import com.proj.model.mappers.TransactionHistoryMapper;
import com.proj.model.mappers.WithdrawalHistoryMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientSearchService {
    private AgentInformationRepository agentInformationRepository;

    private Client_AccountJunctionRepository client_accountJuncRepository;

    private DepositHistoryRepository depositHistoryRepository;

    private WithdrawalHistoryRepository withdrawalHistoryRepository;

    private TransactionHistoryRepository transactionHistoryRepository;

    @Autowired
    public ClientSearchService(AgentInformationRepository agentInformationRepository,
            Client_AccountJunctionRepository client_accountJuncRepository,
            DepositHistoryRepository depositHistoryRepository, WithdrawalHistoryRepository withdrawalHistoryRepository,
            TransactionHistoryRepository transactionHistoryRepository) {
        this.agentInformationRepository = agentInformationRepository;
        this.client_accountJuncRepository = client_accountJuncRepository;
        this.depositHistoryRepository = depositHistoryRepository;
        this.withdrawalHistoryRepository = withdrawalHistoryRepository;
        this.transactionHistoryRepository = transactionHistoryRepository;
    }

    public List<AgentInformationDTO> searchClientsByLastName(String lastName) {
        List<AgentInformationDTO> clients = agentInformationRepository.findAllByLastName(lastName)
                                                .stream()
                                                .map(agent -> AgentInformationMapper.INSTANCE.entityToDto(agent))
                                                .collect(Collectors.toList());
        return clients;
    }

    public Client findClientById(Long clientId) {
        Client result = new Client();

        result.setPersonalInfo(AgentInformationMapper.INSTANCE.entityToDto(
            agentInformationRepository.findById(clientId).orElseThrow()
        ));

        result.setAssociatedBankAccounts(
            client_accountJuncRepository.findAllAccountsByAgentId(clientId)
            .stream().map(account -> AccountInformationMapper.INSTANCE.entityToDto(account)).collect(Collectors.toCollection(ArrayList::new))
        );

        result.setAssociatedDeposits(
            depositHistoryRepository.findAllByAgentId(clientId)
            .stream().map(deposit -> DepositHistoryMapper.INSTANCE.entityToDto(deposit)).collect(Collectors.toCollection(ArrayList::new))
        );

        result.setAssociatedWithdrawals(
            withdrawalHistoryRepository.findAllByAgentId(clientId)
            .stream().map(withdrawal -> WithdrawalHistoryMapper.INSTANCE.entityToDto(withdrawal)).collect(Collectors.toCollection(ArrayList::new))
        );

        result.setAssociatedTransactions(
            transactionHistoryRepository.findAllByDepositAgentIdOrWithdrawalAgentId(clientId)
            .stream().map(transaction -> TransactionHistoryMapper.INSTANCE.entityToDto(transaction)).collect(Collectors.toCollection(ArrayList::new))
        );

        return result;
    }
}
