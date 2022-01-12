package Project.StepDef;

import Project.PageObjects.Pages;
import Project.Utils.SeleniumLib;
import Project.config.SeleniumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterFormSteps extends Pages {
    public RegisterFormSteps(SeleniumDriver driver) {
        super(driver);
    }
    @Then("the user verify page title {string}")
    public void theUserVerifyPageTitle(String title) {
        boolean testResult = false;
        testResult = registerFormPage.verifyPageTitle(title);
        Assert.assertTrue(testResult);
    }

    @And("the user verify page {string} text")
    public void theUserVerifyPageText(String header) {
        boolean testResult = false;
        testResult = registerFormPage.verifyPageHeader2(header);
        Assert.assertTrue("Page header 2 is not match",testResult);
    }

    @When("the user fill first name {string} text box")
    public void theUserFillFirstNameTextBox(String fName) {
        boolean testResult = false;
        testResult = registerFormPage.fillFirstNameInputFields(fName);
        Assert.assertTrue("First Name element is not presence",testResult);
    }

    @When("the user fill last name {string} text box")
    public void theUserFillLastNameTextBox(String lName) {
        boolean testResult = false;
        testResult = registerFormPage.fillLastNameInputFields(lName);
        Assert.assertTrue("Last Name element is not prent",testResult);
    }

    @And("the user fill Address box {string} text Box")
    public void theUserFillAdressBoxTextBox(String adress) {
        boolean testResult=false;
        testResult=registerFormPage.fillAdressInputBox(adress);
        Assert.assertTrue("Address box is present",testResult);
    }

    @And("the usr fill email {string} text box")
    public void theUsrFillEmailTextBox(String email) {
        boolean testResult = false;
        testResult = registerFormPage.fillEmailInputBox(email);
        Assert.assertTrue(testResult);
    }

    @And("the user fill phone number {string} text box")
    public void theUserFillPhoneNumberTextBox(String phone) {
        boolean testResult = false;
        testResult = registerFormPage.fillPhoneInputBox(phone);
        Assert.assertTrue(testResult);
    }

    @And("the user select select gender radio button as male")
    public void theUserSelectSelectGenderRadioButtonAsMale() {
        boolean testResult = false;
        testResult = registerFormPage.selectGenderRadiobutton();
        Assert.assertTrue(testResult);
    }

    @And("the user select select gender radio button as {string}")
    public void theUserSelectSelectGenderRadioButtonAs(String gender) {
        boolean testResult = false;
        testResult = registerFormPage.selectGenderRadiobutton(gender);
        Assert.assertTrue(testResult);
    }

    @And("the user select select hobbies check box as {string}")
    public void theUserSelectSelectHobbiesCheckBoxAs(String hobbies) {
        boolean testResult = false;
        testResult = registerFormPage.selectHobbiesCheckBox(hobbies);
        Assert.assertTrue(testResult);
    }

    @And("the user select select Langauges multiselect {string}")
    public void theUserSelectSelectLangaugesMultiselect(String language) {
        boolean testResult = false;
        testResult = registerFormPage.selectLanguagesList(language);
        Assert.assertTrue(testResult);
    }

    @And("the user select skill by Dropdown {string}")
    public void theUserSelectSkillByDropdown(String skill) {
        boolean testResult = false;
        testResult = registerFormPage.selectSkillDropdownlist(skill);
        Assert.assertTrue(testResult);
    }

    @And("the user select secondary country dropdown {string} option {string}")
    public void theUserSelectSecondaryCountryDropdownOption(String hintText, String option) {
        boolean testResult = false;
        testResult = registerFormPage.selectSecondaryCountryDropdown(hintText, option);
        Assert.assertTrue(testResult);
    }

    @And("the user select date of year dropdown {string}")
    public void selectYearDropdownList(String year) {
        boolean testResult = false;
        testResult = registerFormPage.selectYearDropdownList(year);
        Assert.assertTrue(testResult);
    }

    @And("the user select date of Month dropdown {string}")
    public void theUserSelectDateOfMonthDropdown(String month) {
        boolean testResult = false;
        testResult = registerFormPage.selectMonthDropdownList(month);
        Assert.assertTrue(testResult);
    }

    @And("the user select date of day dropdown {string}")
    public void theUserSelectDateOfDayDropdown(String day) {
        boolean testResult=false;
        testResult=registerFormPage.selectDayDropdownList(day);
        Assert.assertTrue(testResult);
    }

    @And("the user fill password box {string} text box")
    public void theUserFillPasswordBoxTextBox(String psw) {
        boolean testResult=false;
        testResult=registerFormPage.fillPasswordTextBoxField(psw);
        Assert.assertTrue(testResult);
    }

    @And("the user fill confirm password box {string} text box")
    public void theUserFillConfirmPasswordBoxTextBox(String cpsw) {
        boolean testResult= false;
        testResult=registerFormPage.fillconfirmPasswordtextbox(cpsw);
        Assert.assertTrue(testResult);
    }

    @And("the user verify submit Button is visible")
    public void theUserVerifySubmitButtonIsVisible() {
        boolean testResult=false;
        testResult=registerFormPage.verifySubmitButton();
        Assert.assertTrue(testResult);
    }

    @Then("the user is click refresh button")
    public void theUserIsClickRefreshButton() {
        boolean testResult=false;
        testResult=registerFormPage.verifyRefreshButton();
        Assert.assertTrue(testResult);
    }
}
