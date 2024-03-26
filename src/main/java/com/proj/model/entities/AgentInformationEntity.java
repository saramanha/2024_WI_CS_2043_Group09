package com.proj.model.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Represents an agent's information entity.
 */
@Entity
@Table(name = "agent_information")
public class AgentInformationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agent_id")
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "middle_name", nullable = false)
    private String middleName;

    @Column(name = "additional_names")
    private String additionalNames;

    @Column(name = "date_of_registration", nullable = false, updatable = false)
    private LocalDate dateOfRegistration;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "primary_address_id", nullable = false)
    private AddressEntity primaryAddress;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "secondary_address_id")
    private AddressEntity secondaryAddress;

    @Column(name = "email")
    private String email;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "gender_id")
    private GenderEntity selfIdentGender;

    @Column(name = "sex")
    private char sex;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "social_security_number")
    private Long socialSecurityNumber;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "bank_branch_id")
    private BankBranchEntity bankBranch;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "role_id")
    private RoleEntity role;

    /**
     * Constructs a new agent information entity.
     * 
     * @param id                The unique identifier of the agent.
     * @param firstName         The first name of the agent.
     * @param lastName          The last name of the agent.
     * @param middleName        The middle name of the agent.
     * @param additionalNames   Any additional names of the agent.
     * @param dateOfRegistration    The date when the agent was registered.
     * @param primaryAddress    The primary address of the agent.
     * @param secondaryAddress  The secondary address of the agent.
     * @param email             The email address of the agent.
     * @param selfIdentGender   The gender entity representing the gender identity of the agent.
     * @param sex               The biological sex of the agent.
     * @param dateOfBirth       The date of birth of the agent.
     * @param socialSecurityNumber  The social security number of the agent.
     * @param bankBranch        The bank branch entity associated with the agent.
     * @param role              The role entity representing the role of the agent.
     */
    public AgentInformationEntity(Long id, String firstName, String lastName, String middleName, String additionalNames,
            LocalDate dateOfRegistration, AddressEntity primaryAddress, AddressEntity secondaryAddress, String email,
            GenderEntity selfIdentGender, char sex, LocalDate dateOfBirth, Long socialSecurityNumber, BankBranchEntity bankBranch,
            RoleEntity role) {
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
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Default constructor.
     */
    public AgentInformationEntity() {
    }

    // Getters and setters

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

    public AddressEntity getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(AddressEntity primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public AddressEntity getSecondaryAddress() {
        return secondaryAddress;
    }

    public void setSecondaryAddress(AddressEntity secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GenderEntity getSelfIdentGender() {
        return selfIdentGender;
    }

    public void setSelfIdentGender(GenderEntity selfIdentGender) {
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

    public BankBranchEntity getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(BankBranchEntity bankBranch) {
        this.bankBranch = bankBranch;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
