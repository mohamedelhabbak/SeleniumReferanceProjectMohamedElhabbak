package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertsPage=homePage.clickJavaScriptAlerts();
        String alertMessage="You successfully clicked an alert";
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(alertsPage.getResultMessage(),alertMessage);
        softAssert.assertAll();
    }
}
