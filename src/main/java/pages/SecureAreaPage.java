package pages;

import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    public SecureAreaPagePO secureAreaPagePO = new SecureAreaPagePO();
    WebDriver driver;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText() {
        return driver.findElement(secureAreaPagePO.successfullyLoginMessage).getText();
    }

}
