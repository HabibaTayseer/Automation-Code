package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        String asbsolutePath ="C:\\Users\\ahmed\\IdeaProjects\\Selenium\\resources\\";
        String fileName="aaa.txt";
        var fileUploadPage =homepage.clickFileUpload();
        fileUploadPage.uploadFile(asbsolutePath+fileName);
        fileUploadPage.clickSubmitButton();
        assertEquals(fileUploadPage.getUploadedFileName(),fileName,
                "The file name is incorrect");
    }
}
