package Tests;

import Pages.FirstCardPage;
import Pages.WelcomePage;
import org.testng.annotations.Test;

public class TestTimer extends BaseTest{
    @Test
    public void testTime(){

        WelcomePage welcomePage = new WelcomePage();
        welcomePage.nextPage();

        FirstCardPage firstCardPage = new FirstCardPage();
        String result = firstCardPage.getTimerValue();
        assert result.equals("00:00:00"): "Timer is not starting from `00:00:00`.";
    }
}
