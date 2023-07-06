package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    WebDriver driver;
    HorizontalSliderPagePO horizontalSliderPagePO = new HorizontalSliderPagePO();

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectSliderValue(float value) {
        driver.findElement(horizontalSliderPagePO.sliderBox).click();

        while(true) {

            driver.findElement(horizontalSliderPagePO.sliderBox).sendKeys(Keys.ARROW_RIGHT);
            if((value == getSelectedValue())){
                return;
            }
            else if (value<getSelectedValue()){
                do{
                    driver.findElement(horizontalSliderPagePO.sliderBox).sendKeys(Keys.ARROW_LEFT);
                    if((value == getSelectedValue())){
                        return;
                    }
                }while (value<getSelectedValue());


            }
        }


    }

    public float getSelectedValue() {
        return Float.parseFloat( driver.findElement(horizontalSliderPagePO.selectedValue).getText());

    }
}
