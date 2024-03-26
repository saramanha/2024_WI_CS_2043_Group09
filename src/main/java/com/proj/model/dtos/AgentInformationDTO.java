package com.proj.model.dtos;

import java.time.LocalDate;

/**
 * DTO class representing agent information.
 */
public class AgentInformationDTO {
    private Long id; // Unique identifier for the agent
    private String firstName; // First name of the agent
    private String lastName; // Last name of the agent
    private String middleName; // Middle name of the agent
    private String additionalNames; // Additional names of the agent
    private LocalDate dateOfRegistration; // Date of registration for the agent
    private AddressDTO primaryAddress; // Primary address of the agent
    private AddressDTO secondaryAddress; // Secondary address of the agent
    private String email; // Email address of the agent
    private GenderDTO selfIdentGender; // Gender of the agent
    private char sex; // Sex of the agent
    private Long socialSecurityNumber; // Social security number of the agent
    private BankBranchDTO bankBranch; // Bank branch associated with the agent
    private RoleDTO role; // Role of the agent

    /**
     * Default constructor for AgentInformationDTO.
     */
    public AgentInformationDTO() {
    }

    /**
     * Constructor with parameters for creating an AgentInformationDTO object.
     * 
     * @param id                  The unique identifier for the agent.
     * @param firstName           The first name of the agent.
     * @param lastName            The last name of the agent.
     * @param middleName          The middle name of the agent.
     * @param additionalNames     The additional names of the agent.
     * @param dateOfRegistration  The date of registration for the agent.
     * @param primaryAddress      The primary address of the agent.
     * @param secondaryAddress    The secondary address of the agent.
     * @param email               The email address of the agent.
     * @param selfIdentGender     The gender of the agent.
     * @param sex                 The sex of the agent.
     * @param socialSecurityNumber The social security number of the agent.
     * @param bankBranch          The bank branch associated with the agent.
     * @param role                The role of the agent.
     */
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

    /**
     * Retrieves the unique identifier of the agent.
     * 
     * @return The unique identifier of the agent.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the agent.
     * 
     * @param id The unique identifier to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the first name of the agent.
     * 
     * @return The first name of the agent.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the agent.
     * 
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retrieves the last name of the agent.
     * 
     * @return The last name of the agent.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the agent.
     * 
     * @param lastName The last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Retrieves the middle name of the agent.
     * 
     * @return The middle name of the agent.
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the middle name of the agent.
     * 
     * @param middleName The middle name to set.
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Retrieves the additional names of the agent.
     * 
     * @return The additional names of the agent.
     */
    public String getAdditionalNames() {
        return additionalNames;
    }

    /**
     * Sets the additional names of the agent.
     * 
     * @param additionalNames The additional names to set.
     */
    public void setAdditionalNames(String additionalNames) {
        this.additionalNames = additionalNames;
    }

    /**
     * Retrieves the date of registration for the agent.
     * 
     * @return The date of registration for the agent.
     */
    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }


    /**
     * Retrieves the primary address of the agent.
     * 
     * @return The primary address of the agent.
     */
    public AddressDTO getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the primary address of the agent.
     * 
     * @param primaryAddress The primary address to set.
     */
    public void setPrimaryAddress(AddressDTO primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    /**
     * Retrieves the secondary address of the agent.
     * 
     * @return The secondary address of the agent.
     */
    public AddressDTO getSecondaryAddress() {
        return secondaryAddress;
    }

    /**
     * Sets the secondary address of the agent.
     * 
     * @param secondaryAddress The secondary address to set.
     */
    public void setSecondaryAddress(AddressDTO secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    /**
     * Retrieves the email address of the agent.
     * 
     * @return The email address of the agent.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the agent.
     * 
     * @param email The email address to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves the self-identified gender of the agent.
     * 
     * @return The self-identified gender of the agent.
     */
    public GenderDTO getSelfIdentGender() {
        return selfIdentGender;
    }

    /**
     * Sets the self-identified gender of the agent.
     * 
     * @param selfIdentGender The self-identified gender to set.
     */
    public void setSelfIdentGender(GenderDTO selfIdentGender) {
        this.selfIdentGender = selfIdentGender;
    }

    /**
     * Retrieves the sex of the agent.
     * 
     * @return The sex of the agent.
     */
    public char getSex() {
        return sex;
    }

    /**
     * Sets the sex of the agent.
     * 
     * @param sex The sex to set.
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * Retrieves the social security number of the agent.
     * 
     * @return The social security number of the agent.
     */
    public Long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the social security number of the agent.
     * 
     * @param socialSecurityNumber The social security number to set.
     */
    public void setSocialSecurityNumber(Long socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Retrieves the bank branch of the agent.
     * 
     * @return The bank branch of the agent.
     */
    public BankBranchDTO getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the bank branch of the agent.
     * 
     * @param bankBranch The bank branch to set.
     */
    public void setBankBranch(BankBranchDTO bankBranch) {
        this.bankBranch = bankBranch;
    }

    /**
     * Retrieves the role of the agent.
     * 
     * @return The role of the agent.
     */
    public RoleDTO getRole() {
        return role;
    }

    /**
     * Sets the role of the agent.
     * 
     * @param role The role to set.
     */
    public void setRole(RoleDTO role) {
        this.role = role;
    }
}
