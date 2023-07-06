package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    WebDriver driver;
    FramesPagePO framesPagePO = new FramesPagePO();

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToEditArea() {
        driver.switchTo().frame(framesPagePO.editorIframeID);
    }

    public void clearTextArea() {
        switchToEditArea();
        for (int i = 0; i < 50; i++)
            driver.findElement(framesPagePO.textArea).sendKeys(Keys.BACK_SPACE);//driver.findElement(framesPagePO.textArea).clear();
        switchToMainArea();
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public void setTextArea(String text) {
        switchToEditArea();
        driver.findElement(framesPagePO.textArea).sendKeys(text);
        switchToMainArea();
    }

    public void clickIncreaseIndentButton() {
        driver.findElement(framesPagePO.increaseIndentButton).click();
    }

    public String getTextFromEditor() {
        switchToEditArea();
        String text = driver.findElement(framesPagePO.textArea).getText();
        switchToMainArea();
        return text;
    }
}
