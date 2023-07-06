package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoadingLink().clickExample1();
        getWindowManager().goBack();//you will find getWindowManager Method in base tests
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTO("https:www.google.com");
    }
    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

}
