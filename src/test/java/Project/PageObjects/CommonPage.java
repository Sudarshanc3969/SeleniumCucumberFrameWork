package Project.PageObjects;

import Project.Utils.Debugger;
import Project.Utils.SeleniumLib;
import Project.appConfig.AppConfig;
import Project.config.SeleniumDriver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CommonPage {
    private WebDriver driver;
    private SeleniumLib seleniumLib;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        seleniumLib = new SeleniumLib(driver);
    }
    public void openApplicationUrl(String url){
        Debugger.println(url);
        driver.get(url);
//        String actUrl = AppConfig.getApp_url();
//        driver.get(actUrl);
    }
}
