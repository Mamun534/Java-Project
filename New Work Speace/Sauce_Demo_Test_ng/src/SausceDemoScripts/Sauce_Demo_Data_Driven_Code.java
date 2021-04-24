package SausceDemoScripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SausceDemoPages.inventoryPage;

public class Sauce_Demo_Data_Driven_Code {

	WebDriver driver;
	inventoryPage invp;

	@BeforeTest
	public void setupTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop" + "\\Program Libraries Selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		invp = new inventoryPage(driver);

		driver.get("https://www.saucedemo.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@AfterTest()
	
	public void FinishTest() {
		driver.quit();
	}

	@BeforeMethod()

	public void gotoHomePage() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Parameters({ "standard_user", "secret_sauce", "expectedvalue" })

	@Test

	public void ValidateLogin(String userid, String Password, String expectedvalue) throws InterruptedException {

		invp.UserId().sendKeys("userid");
		invp.Password().sendKeys("Password");
		invp.LoginButton().click();
		Thread.sleep(1000);

		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expectedvalue);
	}

}