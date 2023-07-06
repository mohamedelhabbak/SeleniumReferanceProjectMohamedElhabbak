package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload() {
        var fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage
                .uploadFile("D:\\TAU_CourseMaterials\\" +
                        "RefernaceForSelenium\\SeleniumReferanceProject\\resources\\Backround_Qestit logo.png");
        fileUploadPage.clickUploadFile();
      assertEquals(fileUploadPage.getUploadedFiles(),"Backround_Qestit logo.png");
    }
}
