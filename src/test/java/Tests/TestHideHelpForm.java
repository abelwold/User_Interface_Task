package Tests;

import Pages.FirstCardPage;
import Pages.WelcomePage;
import org.testng.annotations.Test;

public class TestHideHelpForm extends BaseTest {

    @Test
    public void testHideHelpForm(){

        WelcomePage welcomePage = new WelcomePage();
        welcomePage.nextPage();

        FirstCardPage firstCardPage = new FirstCardPage();
        firstCardPage.sendToBottom();
        assert firstCardPage.isHideFormDisplaying():"Help form is not closed";
    }
}
