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
#    And the user select select gender radio button as male
    And the user select select gender radio button as "<Gender>"
    And the user select select hobbies check box as "<Hobbies>"
    And the user select select Langauges multiselect "<Languages>"
    And the user select skill by Dropdown "<Skill>"
    And the user select secondary country dropdown "<HintText>" option "<Option>"
    And the user select date of year dropdown "<Year>"
    And the user select date of Month dropdown "<Month>"
    And the user select date of day dropdown "<Day>"
    And the user fill password box "<Password>" text box
    And the user fill confirm password box "<ConfirmPassword>" text box
    And the user verify submit Button is visible
    Then the user is click refresh button
    Examples:
      | Header2  | FirstName | LastName | Address                        | Email          | Phone      | Gender | Hobbies | Languages | Skill |Option|HintText|Year|Month|Day|Password|ConfirmPassword|
      | Register | Sudha     | Reddy    | Marthahalli, Bangalore, 560037 | test@gmail.com | 9876543210 | Male   | Movies  | English   | C     | India| i      |2002|May  |15 |password|password       |