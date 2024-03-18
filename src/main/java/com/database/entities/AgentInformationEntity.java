package com.database.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "agent_information")
public class AgentInformationEntity {
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String additionalNames;
    private LocalDate dateOfRegistration;
    private AddressEntity primaryAddress;
    private AddressEntity secondaryAddress;
    private String email;
    private String selfIdentGender;
    private char sex;
    private Long socialSecurityNumber;
    private BankBranchEntity bankBranch;
    private RoleEntity role;
}
