package InternetTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import Internet.POM.*;


public class InternetTestBase {
	public static WebDriver driver;
	public InternetPage internet;
	public FileUploadPage filePage;
	public UploadedPage uploaded;
	public DynamicLoadPage dynamicPage;
	public DL_Example2Page example2;
	private String base_url = "https://the-internet.herokuapp.com/";

	@BeforeMethod
	public void setup() {
		driver = DriverFactory.getDriver();

		internet = new InternetPage(driver);
		filePage = new FileUploadPage(driver);
		uploaded = new UploadedPage(driver);
		dynamicPage = new DynamicLoadPage(driver);
		example2 = new DL_Example2Page(driver);
		BrowserActions.navigateToURL(driver, base_url);

	}

	@AfterMethod
	public void tearDown() {
		BrowserActions.closeCurrentWindow(driver);
	}

}
