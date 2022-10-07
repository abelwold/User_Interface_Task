package Tests;

import Pages.WelcomePage;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.Test;

public class TestWelcomePage extends BaseTest {

    @Test
    public void testNavMain()  {
            WelcomePage mainPageOpened = new WelcomePage();
            assert mainPageOpened.state().waitForDisplayed() : "Main Page is not opened.";
        }

}