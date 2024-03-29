package com.proj.model.services;

import java.util.ArrayList;
import java.util.List;

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

       public String generateTransactionReport() {
        StringBuilder report = new StringBuilder();
        report.append("Transaction Report for Client: ").append(personalInfo.getName()).append("\n\n");
        
        if (associatedTransactions != null && !associatedTransactions.isEmpty()) {
            for (TransactionHistoryDTO transaction : associatedTransactions) {
                report.append("Date: ").append(transaction.getDate())
                      .append("\tAmount: ").append(transaction.getAmount())
                      .append("\tType: ").append(transaction.getType())
                      .append("\n");
            }
        } else {
            report.append("No transaction history available.\n");
        }

        return report.toString();
    }

    // Function to generate a deposit report
    public String generateDepositReport() {
        StringBuilder report = new StringBuilder();
        report.append("Deposit Report for Client: ").append(personalInfo.getName()).append("\n\n");
        
        if (associatedDeposits != null && !associatedDeposits.isEmpty()) {
            for (DepositHistoryDTO deposit : associatedDeposits) {
                report.append("Date: ").append(deposit.getDate())
                      .append("\tAmount: ").append(deposit.getAmount())
                      .append("\n");
            }
        } else {
            report.append("No deposit history available.\n");
        }

        return report.toString();
    }
    // Function to generate a withdrawal report
    public String generateWithdrawalReport() {
        StringBuilder report = new StringBuilder();
        report.append("Withdrawal Report for Client: ").append(personalInfo.getName()).append("\n\n");
        
        if (associatedWithdrawals != null && !associatedWithdrawals.isEmpty()) {
            for (WithdrawalHistoryDTO withdrawal : associatedWithdrawals) {
                report.append("Date: ").append(withdrawal.getDate())
                      .append("\tAmount: ").append(withdrawal.getAmount())
                      .append("\n");
            }
        } else {
            report.append("No withdrawal history available.\n");
        }

        return report.toString();
    }
}
