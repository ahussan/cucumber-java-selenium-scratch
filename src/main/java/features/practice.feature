Feature: Practice feature for intern
  Scenario: Navigate to Test Site
  Description: Navigate to test site

    When I navigate to test site
    Then I should be on testing site


  Scenario: Navigate to Test Site and fillout form
  Description: Navigate to test site and fillout form
    When I navigate to test site
    Then I should be on testing site
    When I enter first name as "John"
    And I enter last name as "Cunningham"
    And I enter email as "jc@gmail.com"
    And I choose male
    And I enter phone number as "7187778787"
    And I enter subjects as "Biology"
    And I check checkbox sports
    And I enter address as "119 The Knoll"
    And I select state as NCR
    And I select city as Delhi
    And I click on submit
    Then I verify pop up window exists


