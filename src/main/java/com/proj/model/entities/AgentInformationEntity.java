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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((additionalNames == null) ? 0 : additionalNames.hashCode());
		result = prime * result + ((dateOfRegistration == null) ? 0 : dateOfRegistration.hashCode());
		result = prime * result + ((primaryAddress == null) ? 0 : primaryAddress.hashCode());
		result = prime * result + ((secondaryAddress == null) ? 0 : secondaryAddress.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((selfIdentGender == null) ? 0 : selfIdentGender.hashCode());
		result = prime * result + sex;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
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
		AgentInformationEntity other = (AgentInformationEntity) obj;
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
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
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
}
