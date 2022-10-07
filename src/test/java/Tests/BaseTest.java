package Tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    Browser browser = AqualityServices.getBrowser();
    ISettingsFile urls = new JsonSettingsFile("urls.json");

    @BeforeMethod
    public void setUp(){
        browser.goTo(urls.getValue("/mainUrl").toString());
        browser.maximize();
    }

    @AfterMethod
    public void tearDown(){
        if (AqualityServices.isBrowserStarted()) {
            AqualityServices.getBrowser().quit();
        }
    }
}
