package Google.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Base.POM.*;

public class GooglePage extends BaseClass {

	public GooglePage(WebDriver driver) {
		super(driver);
	}

	// Locators
	private By searchBar = By.name("q");

	private By thirdResult = By.xpath("(//div[contains(@class, 'pcTkSc')])[3]");

	// Actions

	// returns third result (google search bar suggestion).
	public By getThirdResult() {
		return thirdResult;
	}

	// returns search bar element
	public By getSearchBar() {
		return searchBar;
	}

	/*
	 * public String getSearchText() { return ElementActions.getText(driver,
	 * thirdResult); }
	 */
}
