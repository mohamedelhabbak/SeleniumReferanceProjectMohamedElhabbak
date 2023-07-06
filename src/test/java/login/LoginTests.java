package login;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.sendUsernameAndPassword("tomsmith", "SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        softAssert.assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");
        softAssert.assertAll();
    }


}
