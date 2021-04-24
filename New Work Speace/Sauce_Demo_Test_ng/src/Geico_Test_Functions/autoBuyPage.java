package Geico_Test_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class autoBuyPage {

	WebDriver driver;
	autoBuyPage abp;
	public WebElement getNextButton() {

		WebElement x = driver.findElement(By.xpath(
				"//*[@id=\"breakdown-main\"]/section[2]/div/div/div/form/div[3]/div[1]/div[1]/div[2]/div/button"));

		return x;

	}

	public WebElement getZipCodeBox() {

		WebElement x = driver.findElement(By.id("zip"));
		return x;

	}

	public WebElement getStartQuoteButton() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"submitBtn\"]/button"));
		return x;

	}

	public WebElement getBirthDate() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"Id_GiveDateOfBirth_52507\"]"));
		
		return x; 
		
		
	}
	
public WebElement getNextButton1() {
		
		WebElement x = driver.findElement(By.id("Id_NEXT_39775Button"));
		
		return x; 
		
		
	}
	
}
