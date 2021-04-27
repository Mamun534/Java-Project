package Maven.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class signup {

	WebDriver driver;

	@BeforeTest

	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",		
				"C:\\Users\\Owner\\OneDrive\\Desktop" + "\\Program Libraries Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/?");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@AfterMethod

	public void ScreenShots() {

		Utility.CaptureScreenshot(driver, "yahoo");
	}

	@AfterTest
	public void SignUpTest() throws InterruptedException {

		driver.quit();
	}
}
