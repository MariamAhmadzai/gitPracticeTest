Feature: Tek School Scenarios

  Background: 
    Given User is on TekSchool page
    And User Click on Test Environment link
    And User should see Test Environment page

  @SDET_003
  Scenario: SDET2019AUG_SDET_003_Execution
    When User click on my Account menu on top of the page
    And User click on login on my Account menu
    And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
    And User click on login button
    Then User should be logined in

  @SDET_003_SO
  Scenario Outline: SDET2019AUG_SDET_003_Execution with multiple user and password
    When User click on my Account menu on top of the page
    And User enter username '<username>' and password '<password>' in returning menu
    And User click on login button
    Then User should be logined in

    Examples: 
      | username               | password     |
      | teststudent@gmail.com  | Tek@Test.com |
      | tekschool001@gmail.com | testtest     |
      | testdata@gmail.com     | testdata     |

  @SDET_004
  Scenario: SDET2019AUG_SDET_004
    When User click on my Account menu on top of the page
    And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
    And User click on login button
    Then User should be logined in
    And User click on Logout option on top of the page
    Then User click on Continue button

  #And User fill 'firstname' 'last name' 'telephone' 'email' password
  @SDET_RF
  Scenario: SDET2019AUG_SDET_Register_Form_Test
    When User click on my Account menu on top of the page
    And User click on register my Account menu
    And User fill register form with below information
      | Suzy | Amini | suzy@testschool.com | 2021234453 | test@123 |
    And User click on 'yes' radio button for subscribe
    And User click on continue button
    Then User should see your 'Your Account Has Been Created!'

  @SDET_RF_SO
  Scenario Outline: SDET2019AUG_SDET_Register_Form_Test
    When User click on my Account menu on top of the page
    And User click on register my Account menu
    And User fill register form with below information
      | Suzy | Amini | <email> | 2021234453 | test@123 |
    And User click on '<radioButton>' radio button for subscribe
    And User click on continue button
    Then User should see your 'Your Account Has Been Created!'

    Examples: 
      | email                | radioButton |
      | mary@tesk.school.com | yes         |
      | kal@gmail.com        | no          |

  @SDET_005
  Scenario: SDET2019AUG_SDET_Add_Products_to_Shopping_Cart
    When User click on my Account menu on top of the page
    And User click on login on my Account menu
    And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
    And User click on login button
    And User should be logined in
    And User should click on Phone&PDA from product menu
    And User should  click on Iphone image link
    And User should click on Add to Cart button
    And User should click on Shopping Cart item button on the top of the menu
    Then  User should click on x button next to item
    
    
   @SDET_RF_DBV
   
   Scenario: SDET2019AUG_SDET_Register_Form_Test
    When User click on my Account menu on top of the page
    And User click on register my Account menu
    And User fill register form with below information
      | Suzy | Amini | ricardo.meador@sakilacustomer.org | 2021234453 | test@123 |
    And User click on 'yes' radio button for subscribe
    And User click on continue button
    Then User should see your 'Your Account Has Been Created!'  
    When User conncects to DataBase
    And User sends Query 'select * from public.customer where email='ricardo.meador@sakilacustomer.org''
    Then User verify account is created with email 'ricardo.meador@sakilacustomer.org'
    
