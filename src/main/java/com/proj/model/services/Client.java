package com.proj.model.services;

import java.util.ArrayList;

import com.proj.model.dtos.AccountInformationDTO;
import com.proj.model.dtos.AgentInformationDTO;
import com.proj.model.dtos.DepositHistoryDTO;
import com.proj.model.dtos.TransactionHistoryDTO;
import com.proj.model.dtos.WithdrawalHistoryDTO;

public class Client {
    private AgentInformationDTO personalInfo;
    private ArrayList<AccountInformationDTO> associatedBankAccounts;
    private ArrayList<TransactionHistoryDTO> associatedTransactions;
    private ArrayList<DepositHistoryDTO> associatedDeposits;
    private ArrayList<WithdrawalHistoryDTO> associatedWithdrawals;

    public Client() {}

    public AgentInformationDTO getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(AgentInformationDTO personalInfo) {
        this.personalInfo = personalInfo;
    }

    public ArrayList<AccountInformationDTO> getAssociatedBankAccounts() {
        return associatedBankAccounts;
    }

    public void setAssociatedBankAccounts(ArrayList<AccountInformationDTO> associatedBankAccounts) {
        this.associatedBankAccounts = associatedBankAccounts;
    }

    public ArrayList<TransactionHistoryDTO> getAssociatedTransactions() {
        return associatedTransactions;
    }

    public void setAssociatedTransactions(ArrayList<TransactionHistoryDTO> associatedTransactions) {
        this.associatedTransactions = associatedTransactions;
    }

    public ArrayList<DepositHistoryDTO> getAssociatedDeposits() {
        return associatedDeposits;
    }

    public void setAssociatedDeposits(ArrayList<DepositHistoryDTO> associatedDeposits) {
        this.associatedDeposits = associatedDeposits;
    }

    public ArrayList<WithdrawalHistoryDTO> getAssociatedWithdrawals() {
        return associatedWithdrawals;
    }

    public void setAssociatedWithdrawals(ArrayList<WithdrawalHistoryDTO> associatedWithdrawals) {
        this.associatedWithdrawals = associatedWithdrawals;
    }
}
