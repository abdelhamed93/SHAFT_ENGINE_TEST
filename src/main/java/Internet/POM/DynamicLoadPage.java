package Internet.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.POM.BaseClass;

public class DynamicLoadPage extends BaseClass {

	public DynamicLoadPage(WebDriver driver) {
		super(driver);
	}

	// Locators
	private By example2_btn = By.partialLinkText("Example 2: Element r");

	// Actions

	// returns Link called "Example2"
	public By getExample2_btn() {
		return example2_btn;
	}
}
