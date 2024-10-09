-- Create Countries Table
CREATE TABLE Countries (
    CountryID INT AUTO_INCREMENT PRIMARY KEY,
    CountryName VARCHAR(255) NOT NULL
);

-- Create Cities Table
CREATE TABLE Cities (
    CityID INT AUTO_INCREMENT PRIMARY KEY,
    CityName VARCHAR(255) NOT NULL
);

-- Create Provinces Table
CREATE TABLE Provinces (
    ProvinceID INT AUTO_INCREMENT PRIMARY KEY,
    ProvinceName VARCHAR(255) NOT NULL,
    CountryID INT,
    FOREIGN KEY (CountryID) REFERENCES Countries(CountryID)
);

-- Create Currencies Table
CREATE TABLE Currencies (
    CurrencyID INT AUTO_INCREMENT PRIMARY KEY,
    CurrencyCode VARCHAR(3) NOT NULL,
    CurrencyName VARCHAR(50) NOT NULL,
    ConversionRateToCAD DECIMAL(5, 2)
);

-- Create Clients Table
CREATE TABLE Clients (
    ClientID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(255) NOT NULL,
    LastName VARCHAR(255) NOT NULL,
    PrimaryAddress VARCHAR(255),
    SecondaryAddress VARCHAR(255),
    Email VARCHAR(255) NOT NULL,
    Gender VARCHAR(10),
    DateOfBirth DATE,
    SSN VARCHAR(11)
);

-- Create AccountTypes Table
CREATE TABLE AccountTypes (
    AccountTypeID INT AUTO_INCREMENT PRIMARY KEY,
    AccountTypeName VARCHAR(50) NOT NULL
);

-- Create BankAccounts Table
CREATE TABLE BankAccounts (
    AccountID INT AUTO_INCREMENT PRIMARY KEY,
    ClientID INT,
    AccountTypeID INT,
    FOREIGN KEY (ClientID) REFERENCES Clients(ClientID),
    FOREIGN KEY (AccountTypeID) REFERENCES AccountTypes(AccountTypeID)
);
