# Mamun Chowdhury
# Date : 04/22/2021

Feature: sauce Demo Data Driven

  Scenario Outline: Sauce Demo Login With Multiple sets of Data
  
    Given user is on the login page
    When user enters "<UserName>" in the Box
    And User enters "<PassWord>" on The Box
    And User Able to Click on The Login button
    And User Able to Click backPackAddCart for add the products
    Then User are Able to Click cart for adding products
    Then User can Read backpackText From Page
    And User Can see The backPackPrice same page
    Then user can click for ContinueShoping on the page
    Then user can add products FleeceJacketAddCart by clicking
    And user can FleeceJacketCart jacket Cart option
    And User are able to read The fleeceJacketTex text
    And user are able to read FleeceJacketPrice price on the page
    And user click on the ClickCheckout for more shopping
    When user see the text box and type the "<FirstName>"
    And user see the text box and type the "<LastName>" By type
    Then user must provide "<ZipCode>"
    And user can ClickContinue for more shop
    And user can see the total price TotalPrice from the price page
    When user can read the Tax from tax box
    And user can read the finalprice from the page FinalPrice
    And user can finish the shopping by clicking Finish

    Examples: 
      | UserName      | PassWord     | FirstName | LastName | ZipCode |
      | standard_user | secret_sauce | michle    | jordan   |   11007 |
     
