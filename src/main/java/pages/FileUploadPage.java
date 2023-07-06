package pages;

import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    WebDriver driver;
    FileUploadPagePO fileUploadPagePO= new FileUploadPagePO();
    public FileUploadPage(WebDriver driver){
        this.driver= driver;
    }
    public void clickUploadFile(){
        driver.findElement(fileUploadPagePO.uploadButton).click();
    }

    /**
     * provides path of file to the form then clicks Upload button
     * @param absolutePathOfFile    The complete path of the file to upload
     */
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(fileUploadPagePO.inputField).sendKeys(absolutePathOfFile);

    }
    public String getUploadedFiles(){
    return driver.findElement(fileUploadPagePO.uploadedFileName).getText();
    }

}
