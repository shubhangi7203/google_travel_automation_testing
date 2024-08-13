package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMTPage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/div/a/span[2]")
	WebElement Flights;
	
	public WebElement getFlights() {
		return Flights;
	}
	
	@FindBy(id="webklipper-publisher-widget-container-notification-close-div")
	WebElement ad;
	
	public WebElement getad() {
		return ad;
	}
	
	@FindBy(className="wrapper-outer")
	WebElement frame;
	
	public WebElement getframe() {
		return frame;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]/ul/li[2]")
	WebElement RoundTrip;
	
	public WebElement getRoundTrip() {
		return RoundTrip;
	}
	@FindBy(id="fromCity")
	WebElement fromCity;
	
	public WebElement getfromCity() {
		return fromCity;
	}
	@FindBy(xpath="//input[@type=\"text\" and @placeholder=\"From\"]")
	WebElement searchFrom;
	
	public WebElement getsearchFrom(){
		return searchFrom;
	}
	
	@FindBy(id="toCity")
	WebElement toCity;
	
	public WebElement gettoCity(){
		return toCity;
	}
	
	@FindBy(xpath="//input[@type=\"text\" and @placeholder=\"To\"]")
	WebElement searchTo;
	
	public WebElement getsearchTo(){
		return searchTo;
	}
	
	@FindBy(id="departure")
	WebElement departure;
	
	public WebElement getdeparture(){
		return departure;
	}
	
	@FindBy(xpath="//div[@class=\"DayPicker-Day\"][contains(@aria-label,\"Sep 29 2023\")]")
	WebElement DeptDate;
	
	public WebElement getDeptDate(){
		return DeptDate;
	}
	
	@FindBy(id="return")
	WebElement returnD;
	
	public WebElement getreturnD(){
		return returnD;
	}
	
	@FindBy(xpath="//div[@class=\"DayPicker-Day\"][contains(@aria-label,\"Oct 31 2023\" )]")
	WebElement returnDate;
	
	public WebElement getreturnDate(){
		return returnDate;
	}
	
	@FindBy(xpath="//a[text()='Search']")
	WebElement Search;
	
	public WebElement getSearch(){
		return Search;
	}
	
	
	public MMTPage(WebDriver rDriver) {
        this.driver=rDriver;
        PageFactory.initElements(rDriver,this);
	}
	
	
	
	
}
