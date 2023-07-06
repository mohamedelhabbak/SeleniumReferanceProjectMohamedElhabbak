package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    LoginPagePO loginPagePO = new LoginPagePO();

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendUsernameAndPassword(String username, String password) {
        driver.findElement(loginPagePO.usernameTextField).sendKeys(username);
        driver.findElement(loginPagePO.passwordTextField).sendKeys(password);

    }

    public SecureAreaPage clickLoginButton() {
        driver.findElement(loginPagePO.loginButton).click();
        return new SecureAreaPage(driver);
    }
}
