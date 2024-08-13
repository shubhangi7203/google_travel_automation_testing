package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHotelPage 
{
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/c-wiz[1]/div[1]/header/div[2]/div[2]/div[1]/div/nav/div[4]/div/button")
	WebElement HotelsFun;
	public WebElement getHotelsFun()
	{
		return HotelsFun;
	}
	
	@FindBy(css ="input[placeholder='Search for places, hotels and more']")
	WebElement HotelsSearchFun;
	public WebElement getHotelsSearchFun()
	{
		return HotelsSearchFun;
	}
	
	@FindAll(@FindBy(xpath ="//*[@class='F3AVKd']"))
	List<WebElement> AllItems;
	public List<WebElement>getAllItems()
	{
		return AllItems;
	}
	
	@FindBy(css ="input[placeholder='Check-in']")
	WebElement CheckIn;
	public WebElement getCheckIn()
	{
		return CheckIn;
	}
	
	@FindBy(xpath ="/html/body/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[3]/div[1]/div/div/div[1]/div/div[1]/div[3]/div[3]/div[4]")
	WebElement CheckIn5;
	public WebElement getCheckIn5()
	{
		return CheckIn5;
	}
	
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[3]/div[1]/div/div/div[1]/div/div[1]/div[3]/div[3]/div[7]")
	WebElement CheckOut;

	public WebElement getCheckOut()
	{
		return CheckOut;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[4]/div/button[2]")
	WebElement Done;

	public WebElement getDone()
	{
		return Done;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[1]/div[3]/div")
	WebElement Adults;

	public WebElement getAdults()
	{
		return Adults;
	}
	
	@FindBy(xpath="//button[@aria-label=\"Add adult\"]")
	WebElement Adult5;

	public WebElement getAdult5()
	{
		return Adult5;
	}
	
	@FindBy(xpath="//button[@jsname=\"kZlJze\"]")
	WebElement AdultDone;

	public WebElement getAdultDone()
	{
		return AdultDone;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div[1]/div/div[1]/span/button")
	WebElement HotelRating;

	public WebElement getHotelRating()
	{
		return HotelRating;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div[2]/span/button")
	WebElement Amenities;

	public WebElement getAmenities()
	{
		return Amenities;
	}
	
	@FindBy(xpath="//*[@id=\"yDmH0d\"]/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/section/div[2]/div[1]/div/div/div/div[2]")
	WebElement FreeBreakFast;

	public WebElement getFreeBreakFast()
	{
		return FreeBreakFast;
	}
	
	@FindBy(xpath="//*[@id=\"yDmH0d\"]/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/section/div[2]/div[1]/div/div/div/div[3]")
	WebElement Restaurant;

	public WebElement getRestaurant()
	{
		return Restaurant;
	}
	
	@FindBy(xpath="//*[@id=\"yDmH0d\"]/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/section/div[2]/div[1]/div/div/div/div[12]")
	WebElement Pool;

	public WebElement getPool()
	{
		return Pool;
	}
	
	@FindBy(xpath="//*[@id=\"yDmH0d\"]/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div[1]/div/div[3]/span/button")
	WebElement Price;

	public WebElement getPrice()
	{
		return Price;
	}
	
	@FindBy(xpath="//*[@id=\"yDmH0d\"]/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/section/div[2]/div/div[2]/div/div[3]")
	WebElement HotelPrice;

	public WebElement getHotelPrice()
	{
		return HotelPrice;
	}
	
	@FindBy(xpath="//*[@id=\"ow68\"]/span/button")
	WebElement PropertyType;

	public WebElement getPropertyType()
	{
		return PropertyType;
	}
	
	@FindBy(xpath="//*[@id=\"fpHotelAccommodationTypes\"]/div/div[2]/div/label/div")
	WebElement Resorts;

	public WebElement getResorts()
	{
		return Resorts;
	}
	
	@FindBy(xpath="//*[@id=\"fpHotelAccommodationTypes\"]/div/div[3]/div/label/div")
	WebElement ApartmentHotels;

	public WebElement getApartmentHotels()
	{
		return ApartmentHotels;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div[1]/div/div[4]/span/button")
	WebElement HotelStars;

	public WebElement getHotelStars()
	{
		return HotelStars;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/section/div[2]/div/div/div[2]")
	WebElement Star3;

	public WebElement getStar3()
	{
		return Star3;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[1]/c-wiz/div/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/section/div[2]/div/div/div[3]")
	WebElement Star4;

	public WebElement getStar4()
	{
		return Star4;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/c-wiz/div[1]/div[1]/div[2]/div[2]/main/c-wiz/span/c-wiz/c-wiz[4]/div/div/div/div[1]/div/div[4]/div/div/a/button")
	WebElement HotelResult;

	public WebElement getHotelResult()
	{
		return HotelResult;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/c-wiz/div[1]/div[2]/div[2]/div[2]/div[2]/c-wiz/div/div/div[2]/span[1]/c-wiz[1]/c-wiz[1]/div/section/div[2]/span[2]/div/a")
	WebElement HotelDirections;

	public WebElement getHotelDirections()
	{
		return HotelDirections;
	}
	
	

	
	public GoogleHotelPage(WebDriver driver2)
	{
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

}
