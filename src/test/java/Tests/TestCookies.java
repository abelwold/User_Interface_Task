package Tests;

import Pages.FirstCardPage;
import Pages.WelcomePage;
import org.testng.annotations.Test;

public class TestCookies extends BaseTest {

    @Test
    public void testCookiesForm(){

        WelcomePage welcomePage = new WelcomePage();
        welcomePage.nextPage();

        FirstCardPage firstCardPage = new FirstCardPage();
        firstCardPage.acceptCookies();
        assert firstCardPage.cookiesFormIsClosed(): "Cookies form is not closed";
    }
}
