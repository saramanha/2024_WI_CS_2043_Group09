package com.proj.model.services;

import org.springframework.stereotype.Service;

import com.proj.model.dtos.AccountInformationDTO;

// Given a AccountInformationDTO. The service can operate on it doing modifications: deposits, withdrawals, deactivation, activation, 
// and given a second account it can do a transaction (debatable to reduce complexity)
@Service
public class BankAccountService {

    public BankAccountService(AccountInformationDTO bankAccount) {

    }
}
