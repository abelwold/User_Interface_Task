package Pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ThirdCardPage extends Form {


    public ThirdCardPage() {
            super(By.xpath("//div[@class='page-indicator' and text()[contains(.,'3')]]"), "Third card page");
    }

}
