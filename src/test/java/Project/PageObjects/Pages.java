package Project.PageObjects;

import Project.config.SeleniumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pages {
    protected WebDriver driver;

    protected CommonPage commonPage;
    protected RegisterFormPages registerFormPage;

    public Pages(SeleniumDriver driver) {
        this.driver =  driver;
        PageObjects();
    }

    public void PageObjects() {
        commonPage = PageFactory.initElements(driver, CommonPage.class);
        registerFormPage = PageFactory.initElements(driver, RegisterFormPages.class);
    }
}
