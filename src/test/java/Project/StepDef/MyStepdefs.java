package Project.StepDef;

import Project.PageObjects.Pages;
import Project.Utils.Debugger;
import Project.config.SeleniumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MyStepdefs extends Pages {
    public MyStepdefs(SeleniumDriver driver) {
        super(driver);
    }
    @Given("the user open application {string} url")
    public void theUserOpenApplicationUrl(String url) {
//        Debugger.println(url);
        commonPage.openApplicationUrl(url);
//        driver.get(url);
    }


}
