package pages;

import org.openqa.selenium.WebDriver;

public class AlertsPage {
    WebDriver driver;
    AlertsPagePO alertsPagePO = new AlertsPagePO();
    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void triggerAlert(){
        driver.findElement(alertsPagePO.triggerAlertButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getResultMessage(){
        return driver.findElement(alertsPagePO.resultMessage).getText();
    }
}
