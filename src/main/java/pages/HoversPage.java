package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    WebDriver driver;
    HoversPagePO hoversPagePO=new HoversPagePO();
    public HoversPage(WebDriver driver){
        this.driver=driver;
    }

    /**
     * @param index starts at 1
     */
    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(hoversPagePO.figureBox).get(index-1);
        Actions actions= new Actions(driver);
        actions.moveToElement(figure).perform();

        return new FigureCaption(driver.findElement(hoversPagePO.boxCaption)); //that means to find the children of the parent web element
    }
    public class FigureCaption{
        private WebElement caption;
        private By header=By.tagName("h5");
        private By link=By.tagName("a");

        public  FigureCaption(WebElement caption){
           this.caption=caption;
        }
        public boolean isCaptionDisplayed()  {
            return caption.isDisplayed();

        }
        public String getTitle(){
            return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }


}
