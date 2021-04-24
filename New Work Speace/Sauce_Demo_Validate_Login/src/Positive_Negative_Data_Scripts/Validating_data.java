package Positive_Negative_Data_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Positive_Negative_Data_pages.Validating_Data;

public class Validating_data {

	WebDriver driver;
	Validating_Data bd;

	@BeforeTest
	public void setupTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop" + "\\Program Libraries Selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		bd = new Validating_Data(driver);

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	@AfterTest
	
	public void FinishTest() {
		
		driver.quit();
	}
}
