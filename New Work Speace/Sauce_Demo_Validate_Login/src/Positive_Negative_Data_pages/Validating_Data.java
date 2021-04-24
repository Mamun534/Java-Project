package Positive_Negative_Data_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validating_Data {

	WebDriver driver;
	Validating_Data bd;

	public Validating_Data(WebDriver driver) {

		this.driver = driver;
	}
	
	public WebElement UserId() {

		WebElement username = driver.findElement(By.id("user-name"));
		return username;

	}

	public WebElement Password() {

		WebElement Password = driver.findElement(By.id("password"));
		return Password;

	}

	public WebElement LoginButton() {

		WebElement LoginButton = driver.findElement(By.id("login-button"));
		return LoginButton;

	}
}
