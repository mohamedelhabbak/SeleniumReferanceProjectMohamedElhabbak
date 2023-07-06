package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollingPage {
    WebDriver driver;
    ScrollingPagePO scrollingPagePO=new ScrollingPagePO();
    public ScrollingPage(WebDriver driver){
        this.driver=driver;
    }
    public void scrollToTable(){
        WebElement tableElement=driver.findElement(scrollingPagePO.table);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script="arguments[0].scrollIntoView";
        js.executeScript("window.scrollBy(0,2750)", "");
//        js.executeScript(script,tableElement);
    }
}
