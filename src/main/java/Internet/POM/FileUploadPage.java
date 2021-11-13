package Internet.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

import Base.POM.BaseClass;

public class FileUploadPage extends BaseClass {
	public FileUploadPage(WebDriver driver) {
		super(driver);
	}

	// defining Image Name and Path.
	private String imageName = "HTTP.jpg";
	String imagePath = System.getProperty("user.dir") + "/data/" + imageName;

	// Locators

	private By chooseFile_btn = By.id("file-upload");
	private By upload_btn = By.id("file-submit");

	// Actions

	// returns Image name.
	public String getImageName() {
		return imageName;
	}

	public void fileUpload() {
		ElementActions.typeFileLocationForUpload(driver, chooseFile_btn, imagePath);
		ElementActions.click(driver, upload_btn);

	}

	// returns Choose File Btn.
	public By getChooseFile_btn() {
		return chooseFile_btn;
	}

	// returns Upload Btn.
	public By getUpload_btn() {
		return upload_btn;
	}

}
