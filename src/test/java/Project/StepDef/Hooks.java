package Project.StepDef;

import Project.PageObjects.Pages;
import Project.Utils.Debugger;
import Project.Utils.SeleniumLib;
import Project.config.SeleniumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Pages {
    SeleniumLib seleniumLib;
//    WebDriver driver;
public static String currentTagName = "";
    public static String currentTags = "";
    public static String currentFeature = "";
    public static String temptagname = "";
    public static boolean new_scenario_feature = false;

    public Hooks(SeleniumDriver driver) {

        super(driver);
//        this.driver = driver;
        seleniumLib = new SeleniumLib(driver);
    }

    @Before
    public void begininingOfTest(Scenario scenario){
        currentTagName = scenario.getSourceTagNames().toString();
        currentTags = scenario.getSourceTagNames().toString();
        currentFeature = scenario.getId().split(";")[0];
        if(temptagname.isEmpty() || !(temptagname.equalsIgnoreCase(currentTagName))){
            Debugger.println("\n"+scenario.getSourceTagNames()+" STARTED");
            temptagname = currentTagName;
            new_scenario_feature = true;
            Debugger.println("FEATURE: " + currentFeature.replaceAll("-", " "));
        }else{
            new_scenario_feature = false;
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        String scenarioStatus = String.valueOf(scenario.getStatus());
        if (!scenarioStatus.equalsIgnoreCase("PASSED")) {
//            scenario.(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        Debugger.println("STATUS: " + scenarioStatus.toUpperCase());
    }
}
