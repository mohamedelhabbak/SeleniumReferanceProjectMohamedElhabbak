package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    WebDriver driver;
    DynamicLoadingPagePO dynamicLoadingPagePO = new DynamicLoadingPagePO();


    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1() {
        driver.findElement(dynamicLoadingPagePO.linkExample1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public class DynamicLoadingExample1Page {
        WebDriver driver;

        public DynamicLoadingExample1Page(WebDriver driver) {
            this.driver = driver;
        }

        public void clickStart() {
            driver.findElement(dynamicLoadingPagePO.startButton).click();

        }

        public String getResultText() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(dynamicLoadingPagePO.resultText)));
            return driver.findElement(dynamicLoadingPagePO.resultText).getText();
        }

    }
}

