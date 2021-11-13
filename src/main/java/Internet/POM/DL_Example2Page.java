package Internet.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shaft.gui.element.ElementActions;

import Base.POM.BaseClass;

public class DL_Example2Page extends BaseClass {

	public DL_Example2Page(WebDriver driver) {
		super(driver);
	}

	// Locators
	private By start_btn = By.tagName("button");
	private By loading_icon = By.id("loading");
	private By loadedText = By.id("finish");

	// Actions

	// Clicks on Start Btn and waits until invisibility of Loading bar.

	public void clickStartBtn() {

		ElementActions.click(driver, start_btn);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading_icon)));

	}

	// returns Start Btn.
	public By getStart_btn() {
		return start_btn;
	}

	// returns the Loaded Text.
	public String getLoadedText() {
		return ElementActions.getText(driver, loadedText);
	}
}