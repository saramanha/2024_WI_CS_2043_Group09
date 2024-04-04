-- Insert cities
INSERT INTO Cities (CityName) VALUES ('New York'), ('London'), ('Paris');

-- Insert provinces
INSERT INTO Provinces (ProvinceName, CountryID) 
VALUES ('New York State', (SELECT CountryID FROM Countries WHERE CountryName = 'USA')),
       ('Greater London', (SELECT CountryID FROM Countries WHERE CountryName = 'UK')),
       ('Île-de-France', (SELECT CountryID FROM Countries WHERE CountryName = 'France'));

-- Insert countries
INSERT INTO Countries (CountryName) VALUES ('USA'), ('UK'), ('France');

-- Insert currency types with conversion rates
-- Insert currency types with conversion rates
INSERT INTO Currencies (CurrencyCode, CurrencyName, ConversionRateToCAD) 
VALUES ('USD', 'US Dollar', 0.79), -- 1 USD = 0.79 CAD
       ('GBP', 'British Pound', 0.45), -- 1 GBP = 0.45 CAD
       ('EUR', 'Euro', 0.53), -- 1 EUR = 0.53 CAD
       ('CAD', 'Canadian Dollar', 1.00); -- 1 CAD = 1.00 CAD

-- Insert clients
INSERT INTO Clients (FirstName, LastName, PrimaryAddress, SecondaryAddress, Email, Gender, DateOfBirth, SSN) 
VALUES ('John', 'Doe', 'New York City, New York State, USA', NULL, 'john.doe@example.com', 'Male', '1990-01-15', '123-45-6789'),
       ('Alice', 'Smith', 'London, Greater London, UK', NULL, 'alice.smith@example.com', 'Female', '1985-05-20', '987-65-4321');

-- Insert bank accounts
-- Assuming there's a table for account types where AccountTypeID is the primary key
INSERT INTO BankAccounts (ClientID, AccountTypeID) 
VALUES (1, (SELECT AccountTypeID FROM AccountTypes WHERE AccountTypeName = 'Checking')),
       (1, (SELECT AccountTypeID FROM AccountTypes WHERE AccountTypeName = 'Savings')),
       (2, (SELECT AccountTypeID FROM AccountTypes WHERE AccountTypeName = 'Checking')),
       (2, (SELECT AccountTypeID FROM AccountTypes WHERE AccountTypeName = 'Money Market'));
