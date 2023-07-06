package slider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTests extends BaseTests {
    @Test
    public void testSlider(){
           var horizontalSliderPage= homePage.clickHorizontalSliderLink();
           horizontalSliderPage.selectSliderValue(3.5F);
        Assert.assertEquals(horizontalSliderPage.getSelectedValue(),3.5);
    }

}
