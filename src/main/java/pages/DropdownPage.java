package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    WebDriver driver;
    DropdownPagePO dropdownPagePO = new DropdownPagePO();

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropdown(String option) {
        Select select = findDropDownElement();
        select.selectByVisibleText(option);

    }

    public List<String> optionSelected() {
        Select select = findDropDownElement();
    List<WebElement> selectedElements= select.getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(dropdownPagePO.dropDownMenu));
    }


}
