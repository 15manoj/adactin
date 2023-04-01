package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;



public class bookHotel extends Base {

	public bookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//td[@class='login_title'])[2]")
	private WebElement header3;

	@FindBy(xpath = "//*[@id='first_name']")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cardNo;

	@FindBy(id = "cc_type")
	private WebElement cardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement expMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expYear;

	@FindBy(id = "cc_cvv")
	private WebElement ccvNumber;

	@FindBy(id = "book_now")
	private WebElement booking;

	@FindBy(id = "process_span")
	private WebElement orderid;

	public WebElement getHeader3() {
		return header3;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCcvNumber() {
		return ccvNumber;
	}

	public WebElement getBooking() {
		return booking;
	}

	public WebElement getOrderid() {
		return orderid;
	}

}
