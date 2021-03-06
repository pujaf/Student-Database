CREATE TABLE Students(
StudentID INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
LastName VARCHAR(30) NOT NULL,
FirstName VARCHAR(30) NOT NULL,
MiddleName VARCHAR(30),
StreetAddress1 VARCHAR(100) NOT NULL,
StreetAddress2 VARCHAR(100),
City VARCHAR(50) NOT NULL,
State VARCHAR(50) NOT NULL,
Country VARCHAR(50) NOT NULL,
ZipCode VARCHAR(10) NOT NULL, 
EmailAddress VARCHAR(50) NOT NULL UNIQUE,
PhoneNumber VARCHAR(20) NOT NULL, 
Major VARCHAR(50) NOT NULL,
Level VARCHAR(10) NOT NULL CHECK (Level in ('Grad','Undergrad')),
Gender VARCHAR(1) NOT NULL CHECK (Gender in ('M','F','N')),
DateOfBirth Date CHECK(DateOfBirth BETWEEN '1850-01-01' AND CURRENT_DATE)
);