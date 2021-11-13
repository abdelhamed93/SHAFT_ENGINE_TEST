package Base.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.shaft.gui.element.ElementActions;

public class BaseClass {

	public WebDriver driver;

	public BaseClass(WebDriver driver) {
		this.driver = driver;
	}

	// to set value to any input element.
	public void setValue(By element, String text) {
		ElementActions.type(driver, element, text);

	}

	// to Click on any Clickable Element.
	public void clickOnElement(By element) {
		ElementActions.click(driver, element);

	}

	// to return String value of elements.
	public String getElementText(WebDriver driver, By element) {
		return ElementActions.getText(driver, element);
	}
}
