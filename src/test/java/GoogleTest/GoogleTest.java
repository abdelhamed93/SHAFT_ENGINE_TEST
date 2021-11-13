package GoogleTest;

import org.testng.annotations.Test;

import com.shaft.validation.Assertions;

public class GoogleTest extends GoogleTestBase {

	private String actual_text;
	private String expected_text = "What is Selenium WebDriver?";

	/*
	 * checking if the third result (suggestion) in Google search bar is matching
	   with the expected or not.
	 * method reads data from External Excel data file [from project data folder]
	 */
	@Test
	public void checkThirdResult() {

		google.setValue(google.getSearchBar(), excelReader.getCellData("GoogleSearchData"));
		actual_text = google.getElementText(driver, google.getThirdResult());
		Assertions.assertEquals(expected_text, actual_text);

	}

}
