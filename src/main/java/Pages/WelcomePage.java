package Pages;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.*;
import org.openqa.selenium.By;


public class WelcomePage extends Form {

    private ILink nextPageLink = getElementFactory().getLink(By.xpath("//a[@class='start__link']"), "Next page link");

    public WelcomePage(){
        super(By.xpath("//button[@class='start__button']"), "Unique Element Welcome Page");
    }
    public void nextPage(){
        nextPageLink.click();
    }
}