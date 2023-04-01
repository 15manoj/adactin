package com.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import org.testng.asserts.SoftAssert;

import com.adactin.bookHotel;
import com.adactin.loginPage;
import com.adactin.searchHotel;
import com.adactin.selectHotel;
import com.base.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class excecution extends Base {
	
	@Given("user is on  Adcatin Hotel")
	public void user_is_on_adcatin_hotel() {
		launchBrowser("https://adactinhotelapp.com/");
	}

	@When("user enter the user name and password")
	public void user_enter_the_user_name_and_password() throws IOException {
		loginPage l = new loginPage();

		inputText(l.getUsername(), stringData(1, 0));
		inputText(l.getPassword(), stringData(1, 1));
		buttonClick(l.getLoginbotton());
	}

	@When("user search hotel in hotel page")
	public void user_search_hotel_in_hotel_page() throws IOException {

		searchHotel s = new searchHotel();

		downDrop(s.getLocation(), stringData(1, 2));
		Assert.assertEquals(s.getLocation().getAttribute("value"), stringData(1, 2));

		downDrop(s.getHotels(), stringData(1, 3));
		Assert.assertEquals(s.getHotels().getAttribute("value"), stringData(1, 3));

		downDrop(s.getRoomtype(), stringData(1, 4));
		Assert.assertEquals(s.getRoomtype().getAttribute("value"), stringData(1, 4));

		downDrop(s.getnoroom(), stringData(1, 5));

		SoftAssert a = new SoftAssert();
		a.assertEquals(s.getnoroom().getAttribute("value"), stringData(1, 5));

		downDrop(s.getAdults(), stringData(1, 6));
		a.assertEquals(s.getAdults().getAttribute("value"), stringData(1, 6));

		downDrop(s.getInchildrens(), stringData(1, 7));
		a.assertEquals(s.getInchildrens().getAttribute("value"), stringData(1, 7));

		buttonClick(s.getSearchbutton());
	}

	@When("user select hotel in hotel page")
	public void user_select_hotel_in_hotel_page() {
		selectHotel s1 = new selectHotel();

		buttonClick(s1.getSelectbutton());
		buttonClick(s1.getContinuebutton());

	}

	@When("user book hotel in booking page")
	public void user_book_hotel_in_booking_page() throws IOException {

		bookHotel b = new bookHotel();
		inputText(b.getFirstName(), stringData(1, 8));
	//	Assert.assertEquals(b.getFirstName().getAttribute("value"), stringData(1, 8));

		inputText(b.getLastName(), stringData(1, 9));
		Assert.assertEquals(b.getLastName().getAttribute("value"), stringData(1, 9));

		inputText(b.getAddress(), stringData(1, 10));
		Assert.assertEquals(b.getAddress().getAttribute("value"), stringData(1, 10));

		inputText(b.getCardNo(), numaricData(1, 11));
		Assert.assertEquals(b.getCardNo().getAttribute("value"), numaricData(1, 11));

		downDrop(b.getCardtype(), stringData(1, 12));
		Assert.assertEquals(b.getCardtype().getAttribute("value"), stringData(1, 12));

		downDrop(b.getExpMonth(), stringData(1, 13));

		SoftAssert a1 = new SoftAssert();
		a1.assertEquals(b.getExpMonth().getAttribute("value"), stringData(1, 13));

		downDrop(b.getExpYear(),numaricData(1, 14));
		a1.assertEquals(b.getExpYear().getAttribute("value"), numaricData(1, 14));

		inputText(b.getCcvNumber(), numaricData(1, 15));
		Assert.assertEquals(b.getCcvNumber().getAttribute("value"), numaricData(1, 15));

		buttonClick(b.getBooking());

		
	}

	@Then("user verify the order")
	public void user_verify_the_order() throws InterruptedException, IOException {
		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\User\\eclipse-workspace\\cucumberProject\\Test output/img.png");
		FileUtils.copyFile(source, destination);
	}

}
