package applicationnavigation;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public WindowManager(WebDriver driver){
        this.driver=driver;
        navigate=driver.navigate();
    }

    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
    navigate.forward();
    }
    public void refreshPage(){
        navigate.refresh();
    }
    public void goTO(String url){
        navigate.to(url);
    }
    public void switchToTab(String tabTitle){
       var windows= driver.getWindowHandles();
        System.out.println("Number Of Tabs: "+windows.size());
        windows.forEach(System.out::println);
        for(String window: windows){
            System.out.println("Switching to window: "+ window);
            driver.switchTo().window(window);
            System.out.println("current window title: "+ driver.getTitle());
            if (tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }


}
