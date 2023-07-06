package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntilVisible(){
        var loadingPage=homePage.clickDynamicLoadingLink();
        var example1= loadingPage.clickExample1();
        example1.clickStart();
        assertEquals(example1.getResultText(),"Hello World!") ;
    }
}
