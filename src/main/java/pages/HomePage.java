package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    HomePagePO homePagePO = new HomePagePO();
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink() {
        driver.findElement(homePagePO.formAuthenticationLink).click();
        return new LoginPage(driver);
    }
    public DropdownPage clickDropdownLink(){
        driver.findElement(homePagePO.dropdownLink).click();
        return new DropdownPage(driver);
    }
    public HoversPage clickHoversLink(){
        driver.findElement(homePagePO.hoversLink).click();
        return new HoversPage(driver);
    }

private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
}

public KeyPressesPage clickKeyPressesLink(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
}
public HorizontalSliderPage clickHorizontalSliderLink(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
}
public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
}
public FileUploadPage clickFileUploadLink(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
}
public RightClickPage clickContextMenuLink(){
        clickLink("Context Menu");
        return new  RightClickPage(driver);
}
public FramesPage clickWysiwygEditorPage(){
        clickLink("WYSIWYG Editor");
        return new FramesPage(driver);
}
public DynamicLoadingPage clickDynamicLoadingLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);

}
public ScrollingPage clickLargeAndDeepDOMLink(){
        clickLink("Large & Deep DOM");
        return new ScrollingPage(driver);
}
public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
}
}
