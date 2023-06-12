Feature: Compose functionality of Gmail

 Background:
	Given I landed in Gmail page

  Scenario Outline: Send an email to an user
  
    Given Log in to gmail with username <name> and password <password>
    When click on the compose button 
    And Enter the <subject> and the <body> in email and click send

    Examples: 
      | name  								  |  password		    |	subject                 |      body                     |
      | testseleniumcucumber089 |  Test@123       | Incubyte Deliverables:1 |Automation QA test for Incubyte|
