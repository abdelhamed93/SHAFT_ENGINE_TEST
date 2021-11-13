package Internet.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.POM.BaseClass;

public class UploadedPage extends BaseClass {
	public UploadedPage(WebDriver driver) {
		super(driver);
	}

	// Locators.
	private By uploadedFileName = By.id("uploaded-files");

	private By fileUploaded = By.tagName("h3");

	// Actions.

	// returns the Uploaded file.
	public By getFileUploaded() {
		return fileUploaded;
	}

	// returns Uploaded File Name.
	public By getUploadedFileName() {
		return uploadedFileName;
	}

}
