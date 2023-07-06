package keys;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeysTests extends BaseTests {
    @Test
    public void testBackSpace(){
          KeyPressesPage keyPressesPage= homePage.clickKeyPressesLink();
          keyPressesPage.enterKeys("backspace");
        Assert.assertTrue(keyPressesPage.getResult().toLowerCase().contains("back_space"));
    }
    @Test
    public void testText(){
        KeyPressesPage keyPressesPage= homePage.clickKeyPressesLink();
        keyPressesPage.enterKeys("A");
        Assert.assertTrue(keyPressesPage.getResult().toLowerCase().contains("a"));
    }



}
