package base;

import applicationnavigation.WindowManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BaseTests {
    public LoginPage loginPage;
    protected HomePage homePage;
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");//or use can use --> (WebDriverManager.chromedriver().setup();)
        driver = new ChromeDriver(getChrompeOptions());
        goHome();
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
       
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot.toPath(), new File("resources/screenshots/test.png").toPath());
            }catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("Screenshot taken: "+ screenshot.getAbsolutePath());
        }


    }
    public WindowManager getWindowManager(){
        return new  WindowManager(driver);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        wait(1000);
        driver.quit();
    }
    private ChromeOptions getChrompeOptions(){
        ChromeOptions option= new ChromeOptions();
        option.addArguments("disable-infobars");
//        option.setHeadless(true);
        return option;
    }
    private void setCookie(){
        Cookie cookie = new Cookie.Builder("Moh","123")
                .domain("https://the-internet.herokuapp.com/")
                .build();
        driver.manage().addCookie(cookie);
    }

}
