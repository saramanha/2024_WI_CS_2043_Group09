package com.proj.model.dtos;

import java.time.LocalDate;



public class AgentInformationDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String additionalNames;
    private LocalDate dateOfRegistration;
    private AddressDTO primaryAddress;
    private AddressDTO secondaryAddress;
    private String email;
    private GenderDTO selfIdentGender;
    private char sex;
    private Long socialSecurityNumber;
    private BankBranchDTO bankBranch;
    private RoleDTO role;

    public AgentInformationDTO() {
    }

    public AgentInformationDTO(Long id, String firstName, String lastName, String middleName, String additionalNames,
            LocalDate dateOfRegistration, AddressDTO primaryAddress, AddressDTO secondaryAddress, String email,
            GenderDTO selfIdentGender, char sex, Long socialSecurityNumber, BankBranchDTO bankBranch, RoleDTO role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.additionalNames = additionalNames;
        this.dateOfRegistration = dateOfRegistration;
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = secondaryAddress;
        this.email = email;
        this.selfIdentGender = selfIdentGender;
        this.sex = sex;
        this.socialSecurityNumber = socialSecurityNumber;
        this.bankBranch = bankBranch;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAdditionalNames() {
        return additionalNames;
    }

    public void setAdditionalNames(String additionalNames) {
        this.additionalNames = additionalNames;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public AddressDTO getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(AddressDTO primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public AddressDTO getSecondaryAddress() {
        return secondaryAddress;
    }

    public void setSecondaryAddress(AddressDTO secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GenderDTO getSelfIdentGender() {
        return selfIdentGender;
    }

    public void setSelfIdentGender(GenderDTO selfIdentGender) {
        this.selfIdentGender = selfIdentGender;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(Long socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public BankBranchDTO getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(BankBranchDTO bankBranch) {
        this.bankBranch = bankBranch;
    }

    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
    }
}
