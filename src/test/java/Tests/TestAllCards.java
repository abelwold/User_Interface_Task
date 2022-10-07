package Tests;

import Pages.FirstCardPage;
import Pages.SecondCardPage;
import Pages.ThirdCardPage;
import Pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TestAllCards extends BaseTest {

    @Test
    public void testAllCards() throws AWTException {

        WelcomePage mainPageOpened = new WelcomePage();
        assert mainPageOpened.state().waitForDisplayed() : "Main Page is not opened.";
        mainPageOpened.nextPage();

        FirstCardPage firstCardPage = new FirstCardPage();
        assert firstCardPage.state().isDisplayed(): "First card ` 1 ` is not opened.";
        firstCardPage.inputValues();
        firstCardPage.selectDomain();
        firstCardPage.termAndCond();
        firstCardPage.nextSecondCard();

        SecondCardPage secondCardPage = new SecondCardPage();
        assert secondCardPage.state().isDisplayed(): "Second card ` 2 ` is not opened.";
        secondCardPage.uploadImageLink();
        secondCardPage.passPathInWinForm();
        secondCardPage.deselectCheckBoxes();
        secondCardPage.selectThreeRandomCheckBoxes();
        secondCardPage.nextToThirdCard();

        ThirdCardPage thirdCardPage = new ThirdCardPage();
        assert thirdCardPage.state().waitForDisplayed():" Third card ` 3 ` is not opened. ";;

    }
}
