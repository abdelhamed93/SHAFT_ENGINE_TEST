package Internet.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.POM.*;

public class InternetPage extends BaseClass {
	public InternetPage(WebDriver driver) {
		super(driver);
	}

	// Locators
	private By fileUpload_btn = By.linkText("File Upload");
	private By dynamicLoading_btn = By.linkText("Dynamic Loading");

	// Actions

	// returns File Upload Link.
	public By getFileUpload_btn() {
		return fileUpload_btn;
	}

	// returns Dynamic Link.
	public By getDynamicLoading_btn() {
		return dynamicLoading_btn;
	}

}
