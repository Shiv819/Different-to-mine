#Author: softwaretestlab
#HN website

Feature: Customer Registration

  Scenario Outline: Create multiple Accounts
    Given Navigate to Registartion screen on HN website
    Then Customer enter firstname as "<FirstName>"
    Then Customer enter lastname as "<LastName>"
    Then Customer enter emailadd as "<EmailAdd>"
    Then Customer enter Pass as "<passwrd>"
    Then Customer enter repass as "<RePasswrd>"
    Examples:
    |FirstName|LastName|EmailAdd|passwrd|RePasswrd|
    |FirstName01|LastName01|EmailAdd01|passwrd01|RePasswrd01|
    |FirstName02|LastName02|EmailAdd02|passwrd02|RePasswrd02|
    |FirstName03|LastName03|EmailAdd03|passwrd03|RePasswrd03|
    |FirstName04|LastName04|EmailAdd04|passwrd04|RePasswrd04|