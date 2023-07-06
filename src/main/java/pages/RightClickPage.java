package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickPage {
    WebDriver driver;
    RightClickPagePO rightClickPagePO=new RightClickPagePO();
    public RightClickPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickRightClick(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(rightClickPagePO.targetBox)).perform();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void clickAcceptAlert(){
         driver.switchTo().alert().accept();
    }

}
