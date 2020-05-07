package com.capgemini.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.capgemini.pageObjects.HelpCenterPage;
import com.capgemini.pageObjects.HomePage;
import com.capgemini.pageObjects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public HomePage hp;
	public HelpCenterPage helpcenterpage;

	@Test
	@Given("^open browser browser$")
	public void open_browser_browser() {
		System.setProperty(key, chromePath);
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		helpcenterpage=new HelpCenterPage(driver);
		// openBrowser();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	@When("^enter the url of the application$")
	public void enter_the_url_of_the_application() {
		driver.get(url);
	}

	@Then("^get title of current page$")
	public void get_title_of_current_page() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Then("^click on sign$")
	public void click_on_sign() {
		lp.signinButton();
	}

	@Then("^click on login present in current page$")
	public void click_on_login_present_in_current_page() {
		lp.logininButton();
	}

	@Then("^enter valid Email or mobile number$")
	public void enter_valid_Email_or_mobile_number() {
		driver.switchTo().frame(0);
		lp.usernameTextbox(mobileNumber);
	}

	@Then("^click on continue$")
	public void click_on_continue() {
		lp.checkuserButton();
	}

	@Then("^enter valid password$")
	public void enter_valid_password() {
		lp.passwordTextbox(password);
	}

	@Then("^click on login$")
	public void click_on_login() {
		lp.submitButton();
		driver.switchTo().parentFrame();
	}

	@Then("^it should direct to home page$")
	public void it_should_direct_to_home_page() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Then("^application home page is displayed$")
	public void application_home_page_is_displayed() {
		String title = driver.getTitle();
		System.out.println("homepage titlle" + title);
	}

	@Given("^scroll down to bottom of the home page$")
	public void scroll_down_to_bottom_of_the_home_page() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1400)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("^Click on Help center$")
	public void click_on_Help_center() {
		System.out.println(driver.getTitle());
		hp.contactUsButtonClick();
	}

	@Then("^it navigates to particular page$")
	public void it_navigates_to_particular_page() {
		System.out.println("conctact us page");
	}

	@When("^user searches for particular query$")
	public void user_searches_for_particular_query() {
		helpcenterpage.searchBarIcon(searchData);
	}

	@Then("^answers related to that query should display$")
	public void answers_related_to_that_query_should_display() {
		helpcenterpage.searchButtonClick();
		
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		// driver.close();
	}
}
