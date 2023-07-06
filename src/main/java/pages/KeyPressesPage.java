package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressesPage {
    WebDriver driver;
    KeyPressesPagePO keyPressesPO= new KeyPressesPagePO();

    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterText(String Text){
        driver.findElement(keyPressesPO.keyPressesTextField).sendKeys(Text);
    }
    public void enterKeys(String string){
        switch (string.toLowerCase()){
            case "enter":
                driver.findElement(keyPressesPO.keyPressesTextField).sendKeys(Keys.ENTER);
                break;
            case "backspace":
                driver.findElement(keyPressesPO.keyPressesTextField).sendKeys(Keys.BACK_SPACE);
                break;
            case "space":
                driver.findElement(keyPressesPO.keyPressesTextField).sendKeys(Keys.SPACE);
                break;
            case "pi":
//                driver.findElement(keyPressesPO.keyPressesTextField)
//                        .sendKeys(Keys.chord
//                                (Keys.ALT,Keys.NUMPAD2,Keys.NUMPAD2,Keys.NUMPAD7));
                Actions actions = new Actions(driver);
                actions.keyDown(Keys.ALT);
                StringBuilder keys = new StringBuilder();
                keys.append(Keys.NUMPAD2);
                keys.append(Keys.NUMPAD2);
                keys.append(Keys.NUMPAD7);
                enterText(Keys.chord(keys.toString()));
                actions.keyUp(Keys.ALT);
                break;
            default:
                driver.findElement(keyPressesPO.keyPressesTextField).sendKeys(string);
                break;

        }


    }

    public String getResult(){
        return driver.findElement(keyPressesPO.resultMessage).getText();
    }



}
