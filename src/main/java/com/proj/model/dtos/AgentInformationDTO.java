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
    private LocalDate dateOfBirth;
    
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
     * @param dateOfBirth         The date of birth of the agent.
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
    LocalDate dateOfRegistration, LocalDate dateOfBirth, AddressDTO primaryAddress, AddressDTO secondaryAddress, String email,
    GenderDTO selfIdentGender, char sex, Long socialSecurityNumber, BankBranchDTO bankBranch, RoleDTO role) {
        this.dateOfBirth = dateOfBirth;
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
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
        result = prime * result + ((additionalNames == null) ? 0 : additionalNames.hashCode());
        result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
        result = prime * result + ((dateOfRegistration == null) ? 0 : dateOfRegistration.hashCode());
        result = prime * result + ((primaryAddress == null) ? 0 : primaryAddress.hashCode());
        result = prime * result + ((secondaryAddress == null) ? 0 : secondaryAddress.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((selfIdentGender == null) ? 0 : selfIdentGender.hashCode());
        result = prime * result + sex;
        result = prime * result + ((socialSecurityNumber == null) ? 0 : socialSecurityNumber.hashCode());
        result = prime * result + ((bankBranch == null) ? 0 : bankBranch.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AgentInformationDTO other = (AgentInformationDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (middleName == null) {
            if (other.middleName != null)
                return false;
        } else if (!middleName.equals(other.middleName))
            return false;
        if (additionalNames == null) {
            if (other.additionalNames != null)
                return false;
        } else if (!additionalNames.equals(other.additionalNames))
            return false;
        if (dateOfBirth == null) {
            if (other.dateOfBirth != null)
                return false;
        } else if (!dateOfBirth.equals(other.dateOfBirth))
            return false;
        if (dateOfRegistration == null) {
            if (other.dateOfRegistration != null)
                return false;
        } else if (!dateOfRegistration.equals(other.dateOfRegistration))
            return false;
        if (primaryAddress == null) {
            if (other.primaryAddress != null)
                return false;
        } else if (!primaryAddress.equals(other.primaryAddress))
            return false;
        if (secondaryAddress == null) {
            if (other.secondaryAddress != null)
                return false;
        } else if (!secondaryAddress.equals(other.secondaryAddress))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (selfIdentGender == null) {
            if (other.selfIdentGender != null)
                return false;
        } else if (!selfIdentGender.equals(other.selfIdentGender))
            return false;
        if (sex != other.sex)
            return false;
        if (socialSecurityNumber == null) {
            if (other.socialSecurityNumber != null)
                return false;
        } else if (!socialSecurityNumber.equals(other.socialSecurityNumber))
            return false;
        if (bankBranch == null) {
            if (other.bankBranch != null)
                return false;
        } else if (!bankBranch.equals(other.bankBranch))
            return false;
        if (role == null) {
            if (other.role != null)
                return false;
        } else if (!role.equals(other.role))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AgentInformationDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
                + middleName + ", additionalNames=" + additionalNames + ", dateOfBirth=" + dateOfBirth
                + ", dateOfRegistration=" + dateOfRegistration + ", primaryAddress=" + primaryAddress
                + ", secondaryAddress=" + secondaryAddress + ", email=" + email + ", selfIdentGender=" + selfIdentGender
                + ", sex=" + sex + ", socialSecurityNumber=" + socialSecurityNumber + ", bankBranch=" + bankBranch
                + ", role=" + role + "]";
    }
}
