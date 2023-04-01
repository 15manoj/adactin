package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class selectHotel extends Base{
	
	public selectHotel() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "login_title")
	private WebElement header2;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement selectButton;
	
	@FindBy(id = "continue")
	private WebElement continueButton;
	
	public WebElement getHeader2() {
		return header2;
	}
	
	public WebElement getSelectbutton() {
		return selectButton;
	}
	
	public WebElement getContinuebutton() {
		return continueButton;
	}

}
