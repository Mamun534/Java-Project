package Geico_Main_Method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Geico_Test_Functions.autoBuyPage;

public class Geigo_Run_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop" + "\\Program Libraries Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.geico.com/");
		autoBuyPage ap = new autoBuyPage();
		
		SausceDemoPages.Utility.CaptureScreenshot(driver, "SauceDemo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);

		ap.getZipCodeBox().sendKeys("22031");
		String buttonValue = ap.getStartQuoteButton().getText();
		ap.getStartQuoteButton().click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(buttonValue);

		ap.getNextButton().click();

		String nextButtonValue = ap.getNextButton().getText();

		System.out.println(nextButtonValue);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		ap.getBirthDate().sendKeys("01/01/1990");
		ap.getNextButton().click();

	}

}
