package com.database.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private AddressEntity primaryAddress;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private AddressEntity secondaryAddress;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "gender_id")
    private GenderEntity selfIdentGender;

    @Column(name = "sex")
    private char sex;

    @Column(name = "social_security_number")
    private Long socialSecurityNumber;

    @ManyToOne
    @JoinColumn(name = "bank_branch_id")
    private BankBranchEntity bankBranch;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;

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
}
