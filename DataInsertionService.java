import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.model.entities.CityEntity;
import com.proj.model.entities.ProvinceEntity;
import com.proj.model.entities.CountryEntity;
import com.proj.model.entities.CurrencyEntity;
import com.proj.model.entities.CurrencyConversionEntity;
import com.proj.model.entities.BankBranchEntity;
import com.proj.model.entities.Client_AccountJunctionEntity;
import com.proj.model.entities.AgentInformationEntity;
import com.proj.model.entities.AccountInformationEntity;
import com.proj.model.repositories.CityRepository;
import com.proj.model.repositories.ProvinceRepository;
import com.proj.model.repositories.CountryRepository;
import com.proj.model.repositories.CurrencyRepository;
import com.proj.model.repositories.CurrencyConversionRepository;
import com.proj.model.repositories.BankBranchRepository;
import com.proj.model.repositories.Client_AccountJunctionRepository;
import com.proj.model.repositories.AgentInformationRepository;
import com.proj.model.repositories.AccountInformationRepository;

@Service
public class DataInsertionService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private ProvinceRepository provinceRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CurrencyRepository currencyRepository;

    @Autowired
    private CurrencyConversionRepository currencyConversionRepository;

    @Autowired
    private BankBranchRepository bankBranchRepository;

    @Autowired
    private Client_AccountJunctionRepository clientAccountJunctionRepository;

    @Autowired
    private AgentInformationRepository agentInformationRepository;

    @Autowired
    private AccountInformationRepository accountInformationRepository;

    // Method to insert data into the database
    public void insertData() {
        // Insert cities
        CityEntity city1 = new CityEntity();
        city1.setCityName("New York");
        cityRepository.save(city1);

        CityEntity city2 = new CityEntity();
        city2.setCityName("Los Angeles");
        cityRepository.save(city2);

        CityEntity city3 = new CityEntity();
        city3.setCityName("Chicago");
        cityRepository.save(city3);

        // Insert provinces
        ProvinceEntity province1 = new ProvinceEntity();
        province1.setProvinceName("New York State");
        provinceRepository.save(province1);

        ProvinceEntity province2 = new ProvinceEntity();
        province2.setProvinceName("California");
        provinceRepository.save(province2);

        ProvinceEntity province3 = new ProvinceEntity();
        province3.setProvinceName("Illinois");
        provinceRepository.save(province3);

        // Insert countries
        CountryEntity country1 = new CountryEntity();
        country1.setCountryName("USA");
        countryRepository.save(country1);

        // Insert currencies
        CurrencyEntity usdCurrency = new CurrencyEntity();
        usdCurrency.setCurrencyName("US Dollar");
        usdCurrency.setCurrencyAcronym("USD");
        currencyRepository.save(usdCurrency);

        CurrencyEntity eurCurrency = new CurrencyEntity();
        eurCurrency.setCurrencyName("Euro");
        eurCurrency.setCurrencyAcronym("EUR");
        currencyRepository.save(eurCurrency);

        CurrencyEntity gbpCurrency = new CurrencyEntity();
        gbpCurrency.setCurrencyName("British Pound");
        gbpCurrency.setCurrencyAcronym("GBP");
        currencyRepository.save(gbpCurrency);

        // Insert currency conversions
        CurrencyConversionEntity usdToEurConversion = new CurrencyConversionEntity();
        usdToEurConversion.setCurrencyFrom(usdCurrency);
        usdToEurConversion.setCurrencyTo(eurCurrency);
        usdToEurConversion.setConversionRate(0.85); // 1 USD = 0.85 EUR
        currencyConversionRepository.save(usdToEurConversion);

        CurrencyConversionEntity usdToGbpConversion = new CurrencyConversionEntity();
        usdToGbpConversion.setCurrencyFrom(usdCurrency);
        usdToGbpConversion.setCurrencyTo(gbpCurrency);
        usdToGbpConversion.setConversionRate(0.72); // 1 USD = 0.72 GBP
        currencyConversionRepository.save(usdToGbpConversion);

        // Insert bank branches
        BankBranchEntity bankBranch1 = new BankBranchEntity();
        bankBranch1.setDescription("Main Branch, New York");
        bankBranchRepository.save(bankBranch1);

        BankBranchEntity bankBranch2 = new BankBranchEntity();
        bankBranch2.setDescription("Downtown Branch, Los Angeles");
        bankBranchRepository.save(bankBranch2);

        // Insert client-account junctions
        Client_AccountJunctionEntity clientAccountJunction = new Client_AccountJunctionEntity();
        // Assuming you have necessary entities for AgentInformation and AccountInformation
        // Set agent and account entities accordingly
        // clientAccountJunction.setAgent(agentInformation);
        // clientAccountJunction.setAccount(accountInformation);
        clientAccountJunction.setRelationshipDescription("Primary Account");
        clientAccountJunctionRepository.save(clientAccountJunction);

        // Insert agents
        AgentInformationEntity agent = new AgentInformationEntity();
        // Set agent properties accordingly
        agentInformationRepository.save(agent);

        // Insert accounts
        AccountInformationEntity account = new AccountInformationEntity();
        // Set account properties accordingly
        accountInformationRepository.save(account);
    }
}
