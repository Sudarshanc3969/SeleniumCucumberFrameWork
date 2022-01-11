package Project.PageObjects;

import Project.Utils.Debugger;
import Project.Utils.SeleniumLib;
import Project.config.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class RegisterFormPages {

    private WebDriver driver;
    private SeleniumLib seleniumLib;

    public RegisterFormPages(WebDriver driver) {
//        super(driver);
        this.driver = driver;
        seleniumLib = new SeleniumLib(driver);
    }

    By header2 = By.xpath("//h2");
    @FindBy(xpath = "//input[@ng-model='FirstName']")
    public WebElement firstNameTextBox;
    By lastName=By.xpath("//input[@ng-model='LastName']");
    @FindBy (xpath = "//textarea[@ng-model='Adress']")
    public WebElement adressTextBox;
    By emailTextBox= By.xpath("//input[@ng-model='EmailAdress']");

    By phoneTextBox = By.xpath("//input[@ng-model='Phone']");

    public boolean verifyPageTitle(String title){
        try{
            if(!driver.getTitle().trim().equalsIgnoreCase(title)){
                Debugger.println("ACT Title : "+driver.getTitle()+" = EXP Title : "+title);
                return false;
            }
            return true;
        }catch (Exception exp){
            exp.printStackTrace();
            return false;
        }
    }

    public boolean verifyPageHeader2(String expHeader){
        try{
            if(!seleniumLib.isElementPresent(header2)){
                Debugger.println("Page Header 2 Is not Presence");
                return false;
            }
            String heaterText = seleniumLib.getText(header2);
            if (!heaterText.equalsIgnoreCase(expHeader)){
                Debugger.println("ACT Header - "+heaterText+" = EXP Header - "+expHeader);
                return false;
            }
            return true;
        }catch (Exception exp){
            Debugger.println(" verifyPageHeader2 : RegisterFormPage "+exp);
            return false;
        }
    }

    public boolean fillFirstNameInputFields(String fName){
        try{
            if(!seleniumLib.isElementPresent(firstNameTextBox)){
                Debugger.println("First Name text field Is not Presence");
                return false;
            }
            seleniumLib.sendValue(firstNameTextBox,fName);
            return true;
        }catch (Exception exp){
            Debugger.println(" fillFirstNameInputFields : RegisterFormPage "+exp);
            return false;
        }
    }
    public boolean fillLastNameInputFields(String lName){
        try {
            if(!seleniumLib.isElementPresent(lastName)){
                Debugger.println("Last Name text file is present");
            }
            seleniumLib.sendValue(lastName,lName);
            return true;
        }catch (Exception exp){
            Debugger.println("fillLastNameInputFields :RegisterFormPage "+exp);
            return false;
        }
    }
    public boolean fillAdressInputBox(String adress){
        try{
            if(!seleniumLib.isElementPresent(adressTextBox)) {
                Debugger.println("Adress text box is present");
            }
            seleniumLib.sendValue(adressTextBox, adress);
            return true;
        }catch (Exception exp){
            Debugger.println("fillAdressInputBox :RegisterFormPage "+exp);
            return false;
        }
    }
    public boolean fillEmailInputBox(String email){
        try {
            if (!seleniumLib.isElementPresent(emailTextBox)) {
                Debugger.println("Email input field is not presence");
                return false;
            }
            seleniumLib.sendValue(emailTextBox, email);
            return true;
        }catch (Exception exp){
            Debugger.println("fillEmailInputBox : RegisterFormPage : "+exp);
            return false;
        }

    }

    public boolean fillPhoneInputBox(String phone) {
        try {
            if (!seleniumLib.isElementPresent(emailTextBox)) {
                Debugger.println("phone input field is not presence");
                return false;
            }
            seleniumLib.sendValue(phoneTextBox, phone);
            return true;
        }catch (Exception exp){
            Debugger.println("fillPhoneInputBox : RegisterFormPage : "+exp);
            return false;
        }

    }
}
