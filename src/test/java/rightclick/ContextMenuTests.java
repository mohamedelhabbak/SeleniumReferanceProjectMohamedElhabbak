package rightclick;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testRightClick(){
           var rightClick= homePage.clickContextMenuLink();
           rightClick.clickRightClick();
           assertTrue(rightClick.getAlertText().contains("You selected a context menu"));
           rightClick.clickAcceptAlert();
    }
}
