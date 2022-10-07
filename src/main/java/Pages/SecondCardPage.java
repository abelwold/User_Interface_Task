package Pages;

import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Random;


public class SecondCardPage extends Form {

    private ILink image = getElementFactory().getLink(By.xpath("//a[@class='avatar-and-interests__upload-button']"),"Image");
    private ICheckBox deselectAll = getElementFactory().getCheckBox(By.xpath("//label[@for='interest_unselectall']"),"Deselect All");
    private ILink nextThirdCard = getElementFactory().getLink(By.xpath("//button[contains(@class,'button')and contains(@class, 'button button--stroked button--white button--fluid')]"),"Next Card");
    private List<ICheckBox> listCheckBox = getElementFactory().findElements(By.xpath("//span[contains(@class,'checkbox small')]"), ElementType.CHECKBOX);

    public SecondCardPage() {
        super(By.xpath("//div[@class='page-indicator' and text()[contains(.,'2')]]"), "Second card page");
    }
    public void interactWithWinForm() throws AWTException {
        Robot robot = new Robot();
        robot.setAutoDelay(4000);
        String pathToAvatar = System.getProperty("user.home") + File.separator + "Downloads"+ File.separator + "RoundTwoFix" + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img.jpg";
        StringSelection stringSelection = new StringSelection(pathToAvatar);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
        robot.setAutoDelay(3000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public void uploadImageLink() {
        image.click();
    }
    public void passPathInWinForm() throws AWTException {
        interactWithWinForm();
    }
    public void deselectCheckBoxes() {
        deselectAll.click();
    }
    public void selectThreeRandomCheckBoxes(){
        Random random = new Random();
        for(int i=0; i<3; i++) {
            int randomInteger = random.nextInt(10);
            listCheckBox.get(randomInteger).click();
        }
    }
    public void nextToThirdCard(){
        nextThirdCard.click();
    }
}

