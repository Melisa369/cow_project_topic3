Feature: Farm registration

  Scenario: Registration of a new farm
    Given User opens register creation tab
    When User enters name "FarmVille"
    And User enters owner "Melisa Simavi"
    And Clicks on create registration
    Then Message to user "Registered"
    
    
   Scenario: Registration of an existing farm
    Given User opens register creation tab
    When User enters name "Farm Detelini"
    And User enters owner "Mariq Dimitrova"
    And Clicks on create registration
    Then Message to user "Registration is already available"
    
    
  Scenario: Create a registration without entering a farm name
    Given User opens register creation tab
    When User enters name ""
    And User enters owner "Ivka Gospodinova"
    And Clicks on create registration
    Then Message to user "Please enter a name"
    
    
  Scenario: Create a registration without entering a farm owner
    Given User opens register creation tab
   When User enters name "Farm Kalinka"
    And User enters owner ""
    And Clicks on create registration
    Then Message to user "Please enter a owner name"
    
  Scenario: Create a registration with an invalid owner
    Given User opens register creation tab
    When User enters name "Farm Cows"
    And User enters owner "%iva"
    And Clicks on create registration
    Then Message to user "Please enter a valid owner"
