package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DropdownPage;

public class DropdownTests extends BaseTests {
    SoftAssert softAssert= new SoftAssert();
    @Test
    public void testOptionSelected() {
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        String option ="Option 1";
        dropdownPage.selectFromDropdown(option);
       var selectedOption = dropdownPage.optionSelected();
        softAssert.assertEquals(selectedOption.size(), 1);
        softAssert.assertTrue(selectedOption.contains(option),"Option not Selected!");
        softAssert.assertAll();
    }
}
