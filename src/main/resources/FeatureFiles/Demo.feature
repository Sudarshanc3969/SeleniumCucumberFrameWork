Feature: Demo feature

  @test
  Scenario Outline: Demo Scenario
    Given the user open application "http://demo.automationtesting.in/Register.html" url
    Then the user verify page title "<Header2>"
    And the user verify page "<Header2>" text
    When the user fill first name "<FirstName>" text box
    When the user fill last name "<LastName>" text box
    And the user fill Address box "<Address>" text Box
    And the usr fill email "<Email>" text box
    And the user fill phone number "<Phone>" text box

    Examples:
      | Header2  | FirstName | LastName | Address                        | Email          | Phone      |
      | Register | Sudha     | Reddy    | Marthahalli, Bangalore, 560037 | test@gmail.com | 9876543210 |