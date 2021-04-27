package StefDef;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.SauceDemologinPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	WebDriver driver;
	SauceDemologinPage lp;

	@Before
	public void configureSetUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop" + "\\Program Libraries Selenium\\chromedriver.exe");
				driver = new ChromeDriver();
	}

	@After
	public void FinishTest() {
		driver.quit();
	}
//................Positive testing for login...............................	

	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
	   
		lp = new SauceDemologinPage(driver);
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@When("^user enters right user name$")
	public void user_enters_right_user_name() throws Throwable {
	   
		lp.getUserId().sendKeys("standard_user");
	}

	@When("^user enters right password$")
	public void user_enters_right_password() throws Throwable {
	 
		lp.getPassword().sendKeys("secret_sauce");
	}

	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
	  
		lp.LoginButton().click();
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "https://www.saucedemo.com/inventory.html");
	   
	}

	//....................Negative Test...................................//
	
	
	
	@When("^user enters wrong user name$")
	public void user_enters_wrong_user_name() throws Throwable {
	 
		lp.getUserId().sendKeys("locked_out_user");
	}

	@When("^user enters wrong password$")
	public void user_enters_wrong_password() throws Throwable {
	   
		lp.getPassword().sendKeys("secret_sauce");
	}

	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
	 
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "https://www.saucedemo.com/");
	}

	// ........................................................................................//

	// ............Sauce Demo Shopping ...........

	@Given("^user are in the login page$")
	public void user_are_in_the_login_page() throws Throwable {

		lp = new SauceDemologinPage(driver);
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@When("^user are able to type user name$")
	public void user_are_able_to_type_user_name() throws Throwable {

		boolean x = lp.getUserId().isEnabled();
		Assert.assertTrue(x);
		lp.getUserId().sendKeys("standard_user");
		Thread.sleep(1000);

	}

	@When("^user are able to type password$")
	public void user_are_able_to_type_password() throws Throwable {
		boolean y = lp.getPassword().isEnabled();
		Assert.assertTrue(y);
		lp.getPassword().sendKeys("secret_sauce");
		Thread.sleep(1000);

	}

	@Then("^user able to click on login button$")
	public void user_able_to_click_on_login_button() throws Throwable {
		boolean z = lp.LoginButton().isDisplayed();
		Assert.assertTrue(z);
		lp.LoginButton().click();
		Thread.sleep(1000);
		String expected = "https://www.saucedemo.com/inventory.html";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expected);
	}

	@Then("^user are able to see the backpackText$")
	public void user_are_able_to_see_the_backpackText() throws Throwable {

		boolean x = lp.backpackText().isDisplayed();
		Assert.assertTrue(x);
		String backpackText = lp.backpackText().getText();
		System.out.println(backpackText);
		Thread.sleep(1000);
	}

	@Then("^user are able to see the back pack price$")
	public void user_are_able_to_see_the_back_pack_price() throws Throwable {
		
		boolean c = lp.backPackPrice().isDisplayed();
		Assert.assertTrue(c);
		String backPackPrice = lp.backPackPrice().getText();
		System.out.println(backPackPrice);

	}

	@When("^user are able to backPack add  to Cart$")
	public void user_are_able_to_backPack_add_to_Cart() throws Throwable {
		boolean d = lp.backPackAddCart().isDisplayed();
		Assert.assertTrue(d);
		lp.backPackAddCart().click();
		Thread.sleep(1000);

	}

	@When("^user are able to add cart$")
	public void user_are_able_to_add_cart() throws Throwable {
		boolean e = lp.Cart().isDisplayed();
		Assert.assertTrue(e);
		lp.Cart().click();
		Thread.sleep(1000);

		String expected = "https://www.saucedemo.com/cart.html";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expected);

	}

	@When("^user are able to click on continue shopping$")
	public void user_are_able_to_click_on_continue_shopping() throws Throwable {
		boolean q = lp.ContinueShoping().isDisplayed();
		Assert.assertTrue(q);
		lp.ContinueShoping().click();

		String expected1 = "https://www.saucedemo.com/inventory.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);

	}

	@When("^user are able to see the fleece Jacket Text$")
	public void user_are_able_to_see_the_fleece_Jacket_Text() throws Throwable {
		boolean y = lp.fleeceJacketText().isDisplayed();
		Assert.assertTrue(y);
		String fleeceJacketText = lp.fleeceJacketText().getText();
		System.out.println(fleeceJacketText);
		Thread.sleep(1000);

	}

	@When("^user are able to see fleece Jacket parice$")
	public void user_are_able_to_see_fleece_Jacket_parice() throws Throwable {
		boolean q = lp.FleeceJacketPrice().isDisplayed();
		Assert.assertTrue(q);
		String FleeceJacketPrice = lp.FleeceJacketPrice().getText();
		System.out.println(FleeceJacketPrice);

	}

	@Then("^user are able to Fleece Jacket add to Cart$")
	public void user_are_able_to_Fleece_Jacket_add_to_Cart() throws Throwable {
		boolean z = lp.FleeceJacketAddCart().isDisplayed();
		Assert.assertTrue(z);
		lp.FleeceJacketAddCart().click();
		Thread.sleep(1000);

	}

	@Then("^user able to add Cart$")
	public void user_able_to_add_Cart() throws Throwable {
		boolean e = lp.Cart().isDisplayed();
		Assert.assertTrue(e);
		lp.Cart().click();

	}

	@Then("^user are able to Click Check out$")
	public void user_are_able_to_Click_Check_out() throws Throwable {
		boolean co = lp.ClickCheckout().isDisplayed();
		Assert.assertTrue(co);
		lp.ClickCheckout().click();
		Thread.sleep(1000);

		String expected1 = "https://www.saucedemo.com/checkout-step-one.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);

	}

	@Given("^user have to type First Name$")
	public void user_have_to_type_First_Name() throws Throwable {
		boolean x = lp.FirstName().isEnabled();
		Assert.assertTrue(x);
		lp.FirstName().sendKeys("Mike");
		Thread.sleep(1000);

	}

	@Given("^user have type Last Name$")
	public void user_have_type_Last_Name() throws Throwable {
		boolean y = lp.LastName().isEnabled();
		Assert.assertTrue(y);
		lp.LastName().sendKeys("Hadson");
		Thread.sleep(1000);

	}

	@When("^user type zipcode$")
	public void user_type_zipcode() throws Throwable {
		boolean z = lp.ZipCode().isEnabled();
		Assert.assertTrue(z);
		lp.ZipCode().sendKeys("11367");
		Thread.sleep(1000);

	}

	@Then("^user are able to Click Continue$")
	public void user_are_able_to_Click_Continue() throws Throwable {
		boolean q = lp.ClickContinue().isDisplayed();
		Assert.assertTrue(q);
		lp.ClickContinue().click();

		String expected1 = "https://www.saucedemo.com/checkout-step-two.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);

	}

	@Then("^user are able to see Total Price$")
	public void user_are_able_to_see_Total_Price() throws Throwable {
		boolean x = lp.TotalPrice().isDisplayed();
		Assert.assertTrue(x);
		String totalprice = lp.TotalPrice().getText();
		System.out.println(totalprice);
		Thread.sleep(1000);

	}

	@Then("^user also see the Tax$")
	public void user_also_see_the_Tax() throws Throwable {
		boolean q = lp.Tax().isDisplayed();
		Assert.assertTrue(q);
		String tax = lp.Tax().getText();
		System.out.println(tax);

	}

	@When("^user see trhe Final Price$")
	public void user_see_trhe_Final_Price() throws Throwable {

		boolean c = lp.FinalPrice().isDisplayed();
		Assert.assertTrue(c);
		String fp = lp.FinalPrice().getText();
		System.out.println(fp);

	}

	@When("^user can finish the shopping$")
	public void user_can_finish_the_shopping() throws Throwable {
		boolean y = lp.Finish().isDisplayed();
		Assert.assertTrue(y);
		lp.Finish().click();
	}

//................................................................................//

//................	Sauce Demo Data Driven Frame Work.............................//

//................................................................................//

	@When("^user enters \"([^\"]*)\" in the Box$")
	public void user_enters_in_the_Box(String arg1) throws Throwable {

		lp.getUserId().sendKeys(arg1);
		Thread.sleep(1000);
	}

	@When("^User enters \"([^\"]*)\" on The Box$")
	public void user_enters_on_The_Box(String arg1) throws Throwable {

		lp.getPassword().sendKeys(arg1);
		Thread.sleep(1000);

	}

	@When("^User Able to Click on The Login button$")
	public void user_Able_to_Click_on_The_Login_button() throws Throwable {

		lp.LoginButton().click();
		Thread.sleep(1000);
	}
	
	@Then("^User Able to Click backPackAddCart for add the products$")
	public void user_Able_to_Click_backPackAddCart_for_add_the_products() throws Throwable {

		lp.backPackAddCart().click();
		Thread.sleep(1000);
	}
	
	@Then("^User are Able to Click cart for adding products$")
	public void user_are_Able_to_Click_cart_for_adding_products() throws Throwable {

		lp.Cart().click();
		Thread.sleep(1000);
	}

	@Then("^User can Read backpackText From Page$")
	public void user_can_Read_backpackText_From_Page() throws Throwable {

		lp.backpackText().getText();
		Thread.sleep(1000);
	}

	@Then("^User Can see The backPackPrice same page$")
	public void user_Can_see_The_backPackPrice_same_page() throws Throwable {

		lp.backPackPrice().getText();
		Thread.sleep(1000);
	}
	
	@Then("^user can click for ContinueShoping on the page$")
	public void user_can_click_for_ContinueShoping_on_the_page() throws Throwable {

		lp.ContinueShoping().click();
		Thread.sleep(1000);
	}

	@Then("^user can add products FleeceJacketAddCart by clicking$")
	public void user_can_add_products_FleeceJacketAddCart_by_clicking() throws Throwable {

		lp.FleeceJacketAddCart().click();
		Thread.sleep(1000);
	}
	
	@Then("^user can FleeceJacketCart jacket Cart option$")
	public void user_can_FleeceJacketCart_jacket_Cart_option() throws Throwable {

		lp.FleeceJacketCart().click();
		Thread.sleep(1000);
	}

	@Then("^User are able to read The fleeceJacketTex text$")
	public void user_are_able_to_read_The_fleeceJacketTex_text() throws Throwable {

		lp.fleeceJacketText().getText();
		Thread.sleep(1000);
	}

	@Then("^user are able to read FleeceJacketPrice price on the page$")
	public void user_are_able_to_read_FleeceJacketPrice_price_on_the_page() throws Throwable {

		lp.FleeceJacketPrice().getText();
		Thread.sleep(1000);
	}

	@Then("^user click on the ClickCheckout for more shopping$")
	public void user_click_on_the_ClickCheckout_for_more_shopping() throws Throwable {

		lp.ClickCheckout().click();
		Thread.sleep(1000);
	}

	@When("^user see the text box and type the \"([^\"]*)\"$")
	public void user_see_the_text_box_and_type_the(String arg1) throws Throwable {

		lp.FirstName().sendKeys(arg1);
		Thread.sleep(1000);
	}

	@When("^user see the text box and type the \"([^\"]*)\" By type$")
	public void user_see_the_text_box_and_type_the_By_type(String arg1) throws Throwable {

		lp.LastName().sendKeys(arg1);
		Thread.sleep(1000);
	}

	@Then("^user must provide \"([^\"]*)\"$")
	public void user_must_provide(String arg1) throws Throwable {

		lp.ZipCode().sendKeys(arg1);
		Thread.sleep(1000);
	}

	@Then("^user can ClickContinue for more shop$")
	public void user_can_ClickContinue_for_more_shop() throws Throwable {

		lp.ClickContinue().click();
		Thread.sleep(1000);
	}

	@Then("^user can see the total price TotalPrice from the price page$")
	public void user_can_see_the_total_price_TotalPrice_from_the_price_page() throws Throwable {

		lp.TotalPrice().getText();
		Thread.sleep(1000);
	}

	@When("^user can read the Tax from tax box$")
	public void user_can_read_the_Tax_from_tax_box() throws Throwable {

		lp.Tax().getText();
		Thread.sleep(1000);
	}

	@When("^user can read the finalprice from the page FinalPrice$")
	public void user_can_read_the_finalprice_from_the_page_FinalPrice() throws Throwable {

		lp.FinalPrice().getText();
		Thread.sleep(1000);
	}

	@When("^user can finish the shopping by clicking Finish$")
	public void user_can_finish_the_shopping_by_clicking_Finish() throws Throwable {

		lp.Finish().click();
	}

}
