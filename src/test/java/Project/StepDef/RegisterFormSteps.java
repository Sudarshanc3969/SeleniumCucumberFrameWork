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
}
