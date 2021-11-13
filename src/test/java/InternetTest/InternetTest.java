package InternetTest;

import org.testng.annotations.Test;

import com.shaft.validation.Assertions;

public class InternetTest extends InternetTestBase {
    
	
	//checking uploading file and verify the successful uploading by comparing between  the file name and the uploaded file name.
	@Test (priority = 1)
	public void checkUploadingFile() {
		internet.clickOnElement(internet.getFileUpload_btn());
		filePage.fileUpload();

		Assertions.assertEquals(filePage.getImageName(),
				uploaded.getElementText(driver, uploaded.getUploadedFileName()));
	}
    //checking dynamic loading of a webElement and verify the Loaded Text is equal to ["Hello World!"] or not
	@Test (priority = 2)
	public void checkLoadedText() {
		internet.clickOnElement(internet.getDynamicLoading_btn());
		dynamicPage.clickOnElement(dynamicPage.getExample2_btn());
		example2.clickStartBtn();
		Assertions.assertEquals("Hello World!", example2.getLoadedText());

	}

}
