package com.capgemini.stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.*;

public class HomePageStep extends BaseClass {
	WebDriver driver;
	@Given("^scroll down to bottom of the home page$")
	public void scroll_down_to_bottom_of_the_home_page() {
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1400)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("^Click on Help center$")
	public void click_on_Help_center() {
		driver.findElement(By.partialLinkText("Contact Us")).click();
	}

	@Then("^it navigates to particular page$")
	public void it_navigates_to_particular_page() {
		System.out.println("conctact us apge");
	}

}
