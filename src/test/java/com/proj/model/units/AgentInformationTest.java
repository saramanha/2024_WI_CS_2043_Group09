package com.proj.model.units;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.proj.controller.Main;
import com.proj.model.entities.AddressEntity;
import com.proj.model.entities.AgentInformationEntity;
import com.proj.model.entities.BankBranchEntity;
import com.proj.model.entities.CityEntity;
import com.proj.model.entities.CountryEntity;
import com.proj.model.entities.GenderEntity;
import com.proj.model.entities.ProvinceEntity;
import com.proj.model.entities.RoleEntity;
import com.proj.model.repositories.AddressRepository;
import com.proj.model.repositories.AgentInformationRepository;
import com.proj.model.repositories.BankBranchRepository;
import com.proj.model.repositories.CityRepository;
import com.proj.model.repositories.CountryRepository;
import com.proj.model.repositories.GenderRepository;
import com.proj.model.repositories.ProvinceRepository;
import com.proj.model.repositories.RoleRepository;

@SpringBootTest(classes = Main.class)
public class AgentInformationTest {
    @Autowired
    private AgentInformationRepository agentInfoRepo;

    @Autowired
    private AddressRepository addressRepo;

    @Autowired
    private CityRepository cityRepo;

    @Autowired
    private ProvinceRepository provinceRepo;

    @Autowired
    private CountryRepository countryRepo;

    @Autowired
    private GenderRepository genderRepo;

    @Autowired
    private BankBranchRepository bankBranchRepo;

    @Autowired
    private RoleRepository roleRepo;

    @Test
    public void testInsertion() {
        CountryEntity country = countryRepo.saveAndFlush(new CountryEntity(null, "Test country"));
        CityEntity city = cityRepo.saveAndFlush(new CityEntity(null, "Test city"));
        ProvinceEntity province = provinceRepo.saveAndFlush(new ProvinceEntity(null, "Test province"));
        AddressEntity primaryAddress = addressRepo.saveAndFlush(new AddressEntity(
            null,
            "123", 
            "546",
            "Test street name", 
            city, 
            province, 
            country)
        );

        GenderEntity gender = genderRepo.saveAndFlush(new GenderEntity(null, "Test gender", "..."));

        BankBranchEntity bankBranch = bankBranchRepo.saveAndFlush(new BankBranchEntity(null, primaryAddress, "Test branch"));

        RoleEntity role = roleRepo.saveAndFlush(new RoleEntity(null, "tester", "..."));

        AgentInformationEntity newAgentInfo = new AgentInformationEntity(
            null,
            "Test first name",
            "Test last name",
            "Test",
            "FAdfgasdgg",
            LocalDate.now(),
            primaryAddress,
            primaryAddress,
            "Abc@fmail.com",
            gender,
            'M',
            LocalDate.now(),
            123435L,
            bankBranch,
            role
        );

        AgentInformationEntity savedAgentInfo = agentInfoRepo.saveAndFlush(newAgentInfo);

        Optional<AgentInformationEntity> retrievedAgent = agentInfoRepo.findById(savedAgentInfo.getId());

        assertNotNull(retrievedAgent.get(), "Failed to retrieve the agent information");
        assertEquals(savedAgentInfo, retrievedAgent.get(), "Not equal");
    }
}
