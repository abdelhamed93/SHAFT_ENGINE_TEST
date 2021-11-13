package GoogleTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.tools.io.ExcelFileManager;

import Google.POM.GooglePage;

public class GoogleTestBase {
	public static WebDriver driver;

	private String base_url = "https://www.google.com.eg/";
	private String fileName = "googleData.xlsx";
	private String filePath = System.getProperty("user.dir") + "/data/" + fileName;
	ExcelFileManager excelReader;
	public GooglePage google;

	@BeforeMethod
	public void setup() {
		driver = DriverFactory.getDriver();
		google = new GooglePage(driver);
		BrowserActions.navigateToURL(driver, base_url);
		excelReader = new ExcelFileManager(filePath);
	}

	@AfterMethod
	public void tearDown() {
		BrowserActions.closeCurrentWindow(driver);
	}
}
