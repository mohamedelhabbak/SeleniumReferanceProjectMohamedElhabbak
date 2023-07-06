package scrollusingjavascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class Scrolltests extends BaseTests {
    @Test
    public void testScrollToTable(){
           var scrollPage= homePage.clickLargeAndDeepDOMLink();
           scrollPage.scrollToTable();

    }
}
