package Project.PageObjects;

import Project.Utils.Debugger;
import Project.Utils.SeleniumLib;
import Project.config.SeleniumDriver;
import io.cucumber.java8.De;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
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
    By lastName = By.xpath("//input[@ng-model='LastName']");
    @FindBy(xpath = "//textarea[@ng-model='Adress']")
    public WebElement adressTextBox;
    By emailTextBox = By.xpath("//input[@ng-model='EmailAdress']");
    By phoneTextBox = By.xpath("//input[@ng-model='Phone']");
    By genderRadioButtion = By.xpath("//input[@value='Male']");

    public boolean verifyPageTitle(String title) {
        try {
            if (!driver.getTitle().trim().equalsIgnoreCase(title)) {
                Debugger.println("ACT Title : " + driver.getTitle() + " = EXP Title : " + title);
                return false;
            }
            return true;
        } catch (Exception exp) {
            exp.printStackTrace();
            return false;
        }
    }

    public boolean verifyPageHeader2(String expHeader) {
        try {
            if (!seleniumLib.isElementPresent(header2)) {
                Debugger.println("Page Header 2 Is not Presence");
                return false;
            }
            String heaterText = seleniumLib.getText(header2);
            if (!heaterText.equalsIgnoreCase(expHeader)) {
                Debugger.println("ACT Header - " + heaterText + " = EXP Header - " + expHeader);
                return false;
            }
            return true;
        } catch (Exception exp) {
            Debugger.println(" verifyPageHeader2 : RegisterFormPage " + exp);
            return false;
        }
    }

    public boolean fillFirstNameInputFields(String fName) {
        try {
            if (!seleniumLib.isElementPresent(firstNameTextBox)) {
                Debugger.println("First Name text field Is not Presence");
                return false;
            }
            seleniumLib.sendValue(firstNameTextBox, fName);
            return true;
        } catch (Exception exp) {
            Debugger.println(" fillFirstNameInputFields : RegisterFormPage " + exp);
            return false;
        }
    }

    public boolean fillLastNameInputFields(String lName) {
        try {
            if (!seleniumLib.isElementPresent(lastName)) {
                Debugger.println("Last Name text file is present");
            }
            seleniumLib.sendValue(lastName, lName);
            return true;
        } catch (Exception exp) {
            Debugger.println("fillLastNameInputFields :RegisterFormPage " + exp);
            return false;
        }
    }

    public boolean fillAdressInputBox(String adress) {
        try {
            if (!seleniumLib.isElementPresent(adressTextBox)) {
                Debugger.println("Adress text box is present");
            }
            seleniumLib.sendValue(adressTextBox, adress);
            return true;
        } catch (Exception exp) {
            Debugger.println("fillAdressInputBox :RegisterFormPage " + exp);
            return false;
        }
    }

    public boolean fillEmailInputBox(String email) {
        try {
            if (!seleniumLib.isElementPresent(emailTextBox)) {
                Debugger.println("Email input field is not presence");
                return false;
            }
            seleniumLib.sendValue(emailTextBox, email);
            return true;
        } catch (Exception exp) {
            Debugger.println("fillEmailInputBox : RegisterFormPage : " + exp);
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
        } catch (Exception exp) {
            Debugger.println("fillPhoneInputBox : RegisterFormPage : " + exp);
            return false;
        }

    }

    By genderRadioButtons = By.xpath("//input[@name='radiooptions']");
//    @FindBy(xpath = "//input[@name='radiooptions']")
//    public List<WebElement> GenderRadioButtonsList;

    @FindBy(xpath = "//input[contains(@id,'checkbox')]")
    public List<WebElement> hobbiesCheckBoxList;

    public boolean selectGenderRadiobutton(String gender) {
        try {
            List<WebElement> genderRadio = seleniumLib.getElements(genderRadioButtons);
            if (genderRadio.isEmpty() || genderRadio.size() == 0) {
                Debugger.println("Gender Radio button field is not presence");
                return false;
            }
            for (int i = 0; i < genderRadio.size(); i++) {
                if (genderRadio.get(i).getAttribute("value").equalsIgnoreCase(gender)) {
                    genderRadio.get(i).click();
                    return true;
                }
            }
            return false;
        } catch (Exception exp) {
            SeleniumLib.takeAScreenShot("selectGenderRadiobutton");
            Debugger.println("Gender Radio button field is not presence : selectGenderRadiobutton : RegisterFormPage : " + exp);
            return false;
        }
    }

    public boolean selectGenderRadiobutton() {
        try {
            if (!seleniumLib.isElementClickable(genderRadioButtion)) {
                Debugger.println("Gender Radio button field is not presence");
                return false;
            }
            seleniumLib.clickOnElement(genderRadioButtion);
            return true;
        } catch (Exception exp) {
            Debugger.println("Gender Radio button field is not presence : selectGenderRadiobutton : RegisterFormPage : " + exp);
            return false;
        }
    }

    public boolean selectHobbiesCheckBox(String hobbies) {
        try {
            if (hobbiesCheckBoxList.isEmpty() || hobbiesCheckBoxList.size() == 0) {
                Debugger.println("hobbies check box field is not presence");
                return false;
            }
            for (int i = 0; i < hobbiesCheckBoxList.size(); i++) {
                if (hobbiesCheckBoxList.get(i).getAttribute("value").equalsIgnoreCase(hobbies)) {
                    hobbiesCheckBoxList.get(i).click();
                    return true;
                }
            }
            return false;
        } catch (Exception exp) {
            SeleniumLib.takeAScreenShot("selectHobbiesCheckBox");
            Debugger.println("hobbies check box field is not presence : selectHobbiesCheckBox : RegisterFormPage : " + exp);
            return false;
        }
    }


    @FindBy(xpath = "//a[@class='ui-corner-all']")
    public List<WebElement> languagesList;

    By languages = By.id("msdd");

    public boolean selectLanguagesList(String language) {
        try {
            seleniumLib.isElementClickable(languages);
            seleniumLib.clickOnElement(languages);

            if (languagesList.isEmpty() || languagesList.size() == 0) {
                Debugger.println("Languages check box field is not presence");
                return false;
            }
            for (int i = 0; i < languagesList.size(); i++) {
                if (languagesList.get(i).getText().equalsIgnoreCase(language)) {
                    languagesList.get(i).click();
                    SeleniumLib.takeAScreenShot("selectLanguagesList");
                    return true;
                }
            }
            return false;
        } catch (Exception exp) {
            SeleniumLib.takeAScreenShot("selectLanguagesList");
            Debugger.println("Languages check box field is not presence : selectLanguagesList : RegisterFormPage : " + exp);
            return false;
        }
    }

//    @FindBy(xpath = "//select[@id='Skills']")
//    public WebElement skillSetDropdown;

    By skillSetDropdown = By.xpath("//select[@id='Skills']");

    public boolean selectSkillDropdownlist(String skill) {
        try {
            if (!seleniumLib.isElementPresent(skillSetDropdown)) {
                Debugger.println("Skill Dropdown check box field is not presence");
                SeleniumLib.takeAScreenShot("selectSkillDropdownlist");
                return false;
            }
            seleniumLib.selectFromListByText(skillSetDropdown, skill);
            return true;
        } catch (Exception exp) {
            SeleniumLib.takeAScreenShot("selectSkillDropdownlist");
            Debugger.println("Skill Dropdown check box field is not presence : selectSkillDropdownlist : RegisterFormPage : " + exp);
            return false;
        }
    }

    @FindBy(xpath = "//ul[@id='select2-country-results']/li")
    public List<WebElement> countryOptionsList;

    @FindBy(xpath = "//span[@class='select2-selection__arrow']")
    public WebElement selectCountryDropdownArrow;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement selectCountrySearchBox;

    public boolean selectSecondaryCountryDropdown(String hintText, String option){
        try {
            if (!seleniumLib.isElementPresent(selectCountryDropdownArrow)) {
                Debugger.println("Secondary country dropdown is not presence");
                return false;
            }
            seleniumLib.clickOnWebElement(selectCountryDropdownArrow);
            if (!seleniumLib.isElementPresent(selectCountrySearchBox)) {
                Debugger.println("Secondary country dropdown search box is not presence");
                return false;
            }
            seleniumLib.sendValue(selectCountrySearchBox, hintText);
            if (countryOptionsList.isEmpty()|| countryOptionsList.size()==0) {
                Debugger.println("Secondary country dropdown option is not presence");
                return false;
            }
            for(int i=0; i<countryOptionsList.size();i++){
                if(countryOptionsList.get(i).getText().equalsIgnoreCase(option)){
                    seleniumLib.clickOnWebElement(countryOptionsList.get(i));
                    return true;
                }
            }
            return false;
        }catch (Exception exp){
            SeleniumLib.takeAScreenShot("selectSecondaryCountryDropdown");
            Debugger.println("Secondary country dropdown is not presence : selectSecondaryCountryDropdown : RegisterFormPage : "+exp);
            return false;
        }
    }

    By yearBox=By.id("yearbox");
    public boolean selectYearDropdownList(String year) {
        try {
            if (!seleniumLib.isElementPresent(yearBox)) {
                Debugger.println("Year Dropdown check box field is not presence");
                SeleniumLib.takeAScreenShot("selectYearDropdownList");
                return false;
            }
            seleniumLib.selectFromListByText(yearBox, year);
            return true;
        } catch (Exception exp) {
            SeleniumLib.takeAScreenShot("selectYearDropdownList");
            Debugger.println("Year Dropdown check box field is not presence : selectYearDropdownList : RegisterFormPage : " + exp);
            return false;
        }
    }
    By monthBox=By.xpath("//select[@placeholder='Month']");
    public boolean selectMonthDropdownList(String month){
        try{
            if(!seleniumLib.isElementPresent(monthBox)){
                Debugger.println("Month Dropdown check box field is not presence");
                SeleniumLib.takeAScreenShot("selectMonthDropdownList");
                return false;
            }
            seleniumLib.selectFromListByText(monthBox,month);
            return true;
        }catch (Exception exp){
            seleniumLib.takeAScreenShot("selectMonthDropdownList");
            Debugger.println("Month Dropdown check box field is not presence : selectMonthDropdownList : RegisterFormPage : " + exp);
            return false;
        }
    }
    By dateBox=By.xpath("//*[@placeholder='Day']");
    public boolean selectDayDropdownList(String day){
        try{
            if(!seleniumLib.isElementPresent(dateBox)){
                Debugger.println("Day Dropdown check box field is not presence");
                SeleniumLib.takeAScreenShot("selectDayDropdownList");
                return false;
            }
                SeleniumLib.takeAScreenShot("selectDayDropdownList");
            seleniumLib.selectFromListByText(dateBox,day);
            return true;
        }catch (Exception exp){
            seleniumLib.takeAScreenShot("selectDayDropdownList");
            Debugger.println("Month Dropdown check box field is not presence : selectDayDropdownList : RegisterFormPage : " + exp);
            return false;
        }
    }
    By passwordTextBox=By.id("firstpassword");
    public boolean fillPasswordTextBoxField(String psw){
    try{
        if(!seleniumLib.isElementPresent(passwordTextBox))
        {
            Debugger.println("Fill password text box is present");
            return false;
        }
        seleniumLib.sendValue(passwordTextBox,psw);
        return true;
    }catch (Exception exp){
        Debugger.println("fillPasswordTextBoxField: RegisterFromPages:"+exp );
        return false;
    }
    }
    By confirmPassowrd=By.xpath("//input[@id='secondpassword']");
    public boolean fillconfirmPasswordtextbox(String cpsw){
        try{
            if (!seleniumLib.isElementPresent(confirmPassowrd)){
                Debugger.println("Confirm password text box file is prent");
                return false;
            }
            seleniumLib.sendValue(confirmPassowrd,cpsw);
            return true;
        }catch (Exception exp){
            Debugger.println("fillconfirmPasswordtextbox: RegisterFromPages:"+exp);
            return false;
        }
    }
    By refreshbutton=By.id("Button1");
    public boolean verifyRefreshButton(){
        try {
            if(!seleniumLib.isElementClickable(refreshbutton)){
                Debugger.println("refresh button is not presence");
                return false;
            }
            return true;
        }catch (Exception exp){
            Debugger.println("refresh button is not display : verifyRefreshButton : RegisterFormPage : "+exp);
            return false;
        }

    }

    By submitbutton=By.xpath("//button[@id='submitbtn']");
    public boolean verifySubmitButton(){
        try{
            if (!seleniumLib.isElementPresent(submitbutton)){
                Debugger.println("Submit Button is not present");
            return false;
            }
            seleniumLib.isElementClickable(submitbutton);
            return true;
        }catch (Exception exp){
            Debugger.println("verifySubmitButton:RegisterFromPages  "+exp);
            return false;
        }
    }
}
