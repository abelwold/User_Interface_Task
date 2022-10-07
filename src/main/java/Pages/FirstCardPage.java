package Pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;


public class FirstCardPage extends Form  {


    private ITextBox inputPassword = getElementFactory().getTextBox(By.xpath("//div[@class='login-form__field-row']//input"), "Input Password");
    private ITextBox inputEmail = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Your email']"), "Input Email");
    private ITextBox inputDomain = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Domain']"), "Input Domain");
    private ICheckBox clickDropDown = getElementFactory().getCheckBox(By.xpath("//div[@class='dropdown__field']"), "Select Dropdown");
    private IButton domainName = getElementFactory().getButton(By.xpath("//div[@Class='dropdown__list-item'][contains(.,'.com')]"), "Select Domain Name");
    private ICheckBox uncheckBox = getElementFactory().getCheckBox(By.xpath("//span[@class='checkbox__box']"), "deselect Check Box");
    private ILink nextCard = getElementFactory().getLink(By.xpath("//a[@class='button--secondary']"), "Next");
    private IButton sendToBottomBtn = getElementFactory().getButton(By.xpath("//div[@class='align__cell u-right']"), "Send To Bottom");
    private IButton cookies = getElementFactory().getButton(By.xpath("//button[@class='button button--solid button--transparent']"), "Accept Cookies");
    private ITextBox getTimer = getElementFactory().getTextBox(By.xpath("//div[contains(@class, 'timer')]"), "Get Timer");


    public FirstCardPage() {
        super(By.xpath("//div[@class='page-indicator' and text()[contains(.,'1')]]"), "First card page");
    }

    public void sendToBottom(){
        sendToBottomBtn.click();
    }
    public void inputValues(){
        inputPassword.clearAndType("Mypasswordisthis1brain");
        inputEmail.clearAndType("brain");
        inputDomain.clearAndType("gmail");
    }

    public void selectDomain() {
        clickDropDown.click();
        domainName.click();
    }
    public void termAndCond(){
        uncheckBox.click();
    }
    public void nextSecondCard(){
        nextCard.click();
    }
    public boolean isHideFormDisplaying(){
        return sendToBottomBtn.state().waitForNotDisplayed();
    }
    public void acceptCookies(){
        cookies.click();
    }
    public boolean cookiesFormIsClosed(){
        return cookies.state().waitForNotDisplayed();
    }
    public String getTimerValue(){
       return getTimer.getText();
    }
}

