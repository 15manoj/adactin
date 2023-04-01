package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class searchHotel extends Base{
	public searchHotel() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//td[@class='login_title']")
	private WebElement header;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement noroom;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "adult_room")
	private WebElement adults;
	
	@FindBy(id = "child_room")
	private WebElement inchildrens;
	
	@FindBy(id = "Submit")
	private WebElement searchbutton;
	
	public WebElement getHeader() {
		return header;
	}
	
	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotels() {
		return hotels;
	}
	
	public WebElement getRoomtype() {
		return roomtype;
	}
	
	public WebElement getnoroom() {
		return  noroom;
	}
	
	public WebElement getAdults() {
		return adults;
	}
	
	public WebElement getInchildrens() {
		return inchildrens;
	}
	
	public WebElement getSearchbutton() {
		return searchbutton;
	}

}
