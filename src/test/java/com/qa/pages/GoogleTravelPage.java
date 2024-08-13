package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleTravelPage 
{
	WebDriver driver;
    
	@FindBy(css ="input[placeholder='Search for flights, hotels and more']")
	WebElement SearchTextField;

	public WebElement getSearchTextField()
	{
		return SearchTextField;
	}

	@FindBy(xpath ="//input[@aria-label=\"Search for places, hotels and more\"]")
	WebElement SearchHotelTextField;

	public WebElement getSearchHotelTextField()
	{
		return SearchHotelTextField;
	}
	

	@FindAll(@FindBy(className ="Q1RWxd"))
	List<WebElement> AllItems;
	public List<WebElement>getAllItems()
	{
		return AllItems;
	}
	
	@FindBy(xpath ="//*[@id=\"yDmH0d\"]/c-wiz[2]/div/div[2]/div/c-wiz/div[1]/div/div[1]/div[2]/div/span[1]/a")
	WebElement Explore;

	public WebElement getExplore()
	{
		return Explore;
	}
	
	@FindBy(xpath ="//*[@id=\"yDmH0d\"]/c-wiz[2]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement RoundTrip;

	public WebElement getRoundTrip()
	{
		return RoundTrip;
	}
	
	@FindBy(xpath ="//*[@id=\"yDmH0d\"]/c-wiz[2]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[1]/div[1]/div/div/div/div[2]/ul/li[2]")
	WebElement OneWayTrip;

	public WebElement getOneWayTrip()
	{
		return OneWayTrip;
	}
	
	@FindBy(xpath ="//*[@id=\"yDmH0d\"]/c-wiz[2]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement Persons;

	public WebElement getPersons()
	{
		return Persons;
	}
	
	@FindBy(xpath ="/html/body/c-wiz[2]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[1]/div[2]/div/div[2]/ul/li[1]/div/div/span[3]/button")
	WebElement Adults;

	public WebElement getAdults()
	{
		return Adults;
	}
	
	@FindBy(xpath ="/html/body/c-wiz[2]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[1]/div[3]/div")
	WebElement Economy;

	public WebElement getEconomy()
	{
		return Economy;
	}
	
	
	@FindBy(xpath ="/html/body/c-wiz[2]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[1]/div[3]/div/div/div/div[2]/ul/li[4]")
	WebElement FirstClass;

	public WebElement getFirstClass()
	{
		return FirstClass;
	}
	
	
	@FindBy(xpath ="/html/body/c-wiz[2]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[1]")
	WebElement WhereFrom;

	public WebElement getWhereFrom()
	{
		return WhereFrom;
	}
	
	@FindBy(xpath ="/html/body/c-wiz[2]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div/div[1]/div/div/input")
	WebElement Pune;

	public WebElement getPune()
	{
		return Pune;
	}
	
	@FindBy(xpath ="/html/body/c-wiz[2]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div/div[2]/div[3]/ul/li[1]")
	WebElement PuneIA;

	public WebElement getPuneIA()
	{
		return PuneIA;
	}
	
	
	@FindBy(xpath ="/html/body/c-wiz[2]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div/div[1]/div/div/input")
	WebElement Singapore;

	public WebElement getSingapore()
	{
		return Singapore;
	}
	
	@FindBy(xpath ="/html/body/c-wiz[2]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/ul/li[1]")
	WebElement SingaporeIA;

	public WebElement getSingaporeIA()
	{
		return SingaporeIA;
	}
	
	@FindBy(xpath ="//a[@href=\"/search?sca_esv=73d0a1271b02ef32&sca_upv=1&q=Sentosa&stick=H4sIAAAAAAAAAONgFuLQz9U3MCsxKlHiBLEM89IsCrUUs5Ot9HPykxNLMvPz4AyrxJKSosRkELN4ESt7cGpeSX5xIgAAuaBlRAAAAA&sa=X&ved=2ahUKEwjBg9XGr5eHAxWgamwGHevgCW4Q2coHegQIUhAD\"]")
	WebElement SentosaCity;

	public WebElement getSentosaCity()
	{
		return SentosaCity;
	}
	
	@FindBy(xpath ="/html/body/div[5]/div/div[10]/div[4]/div[1]/div[2]/div/div/div/div/div/div/div/div/div/div/div[1]/div[5]/div/div/div/div/div/div[1]")
	WebElement SentosaLink;

	public WebElement getSentosaLink()
	{
		return SentosaLink;
	}
	
	@FindBy(id="onetrust-accept-btn-handler")
	WebElement AcceptAll;

	public WebElement getAcceptAll()
	{
		return AcceptAll;
	}
	
	@FindBy(xpath="/html/body/div[7]/div[1]/section/div/div[1]/div/div")
	WebElement CityDetails;

	public WebElement getCityDetails()
	{
		return CityDetails;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/div[2]/div/c-wiz/div[2]/div/div/div[2]/div/div[4]/div[3]")
	WebElement WhenToVist;

	public WebElement getWhenToVist()
	{
		return WhenToVist;
	}
	
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/div[2]/div/c-wiz/div[1]/div/div[1]/div[2]/div/span[2]/a/button")
	WebElement Flights;

	public WebElement getFlights()
	{
		return Flights;
	}
	
	@FindBy(xpath="//div[@class=\"RLVa8 GeHXyb\"]")
	WebElement FlightTrip;

	public WebElement getFlightTrip()
	{
		return FlightTrip;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/div/div/div[2]/ul/li[1]")
	WebElement RoundTripCity;

	public WebElement getRoundTripCity()
	{
		return RoundTripCity;
	}
	
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div/div[1]/div/button")
	WebElement FlightAdults;

	public WebElement getFlightAdults()
	{
		return FlightAdults;
	}
	
	@FindBy(xpath="//button[@aria-label=\"Add adult\"]")
	WebElement Person2;

	public WebElement getPerson2()
	{
		return Person2;
	}
	
	@FindBy(xpath="//div[@class=\"JQrP8b PLrkBc\"]")
	WebElement FlightEconomy;

	public WebElement getFlightEconomy()
	{
		return FlightEconomy;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div/div/div[2]/ul/li[3]")
	WebElement FlightBusiness;

	public WebElement getFlightBusiness()
	{
		return FlightBusiness;
	}
	
	
	@FindBy(xpath="//input[@placeholder=\"Where from?\"]")
	WebElement FlightFrom;

	public WebElement getFlightFrom()
	{
		return FlightFrom;
	}
	
	@FindBy(xpath="//li[@aria-label=\"Pune, Maharashtra\"]")
	WebElement FlightPune;

	public WebElement getFlightPune()
	{
		return FlightPune;
	}
	
	@FindBy(xpath="//div//input[@aria-label=\"Where to? \"]")
	WebElement FlightTo;

	public WebElement getFlightTo()
	{
		return FlightTo;
	}
	
	
	@FindBy(xpath="//li[@aria-label=\"Dubai - United Arab Emirates\"]")
	WebElement FlightToDubai;

	public WebElement getFlightToDubai()
	{
		return FlightToDubai;
	}
	
	
	@FindBy(xpath="//div[@class=\"icWGef A84apb P0ukfb bgJkKe BtDLie\"]")
	WebElement Departure;

	public WebElement getDeparture()
	{
		return Departure;
	}
	
	@FindBy(xpath="//div[@aria-label=\"Friday, August 16, 2024\"]")
	WebElement DepartureDate27;

	public WebElement getDepartureDate27()
	{
		return DepartureDate27;
	}
	
	@FindBy(xpath="//div[@aria-label=\"Saturday, August 24, 2024\"]")
	WebElement Return5;

	public WebElement getReturn5()
	{
		return Return5;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div[3]/div/button")
	WebElement Done;

	public WebElement getDone()
	{
		return Done;
	}
	
	@FindBy(xpath="//button[@aria-label=\"Search\"]")
	WebElement Search;

	public WebElement getSearch()
	{
		return Search;
	}
	
	@FindBy(xpath="/html/body/c-wiz[2]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[2]/div[3]")
	WebElement BestFlight;

	public WebElement getBestFlight()
	{
		return BestFlight;
	}
	
	
	@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[2]/div[3]/ul/li[2]/div")
	WebElement FlightCheck;

	public WebElement getFlightCheck()
	{
		return FlightCheck;
	}
	
	@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[2]/div[3]/ul/li[2]/div")
	WebElement FlightBooking;

	public WebElement getFlightBooking()
	{
		return FlightBooking;
	}
	
	@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div/div/div[2]/div[1]/div/div/button")
	WebElement BookingWithSpice;

	public WebElement getBookingWithSpice()
	{
		return BookingWithSpice;
	}
	
	@FindBy(className="SheetContainer-module__inner___tqQq2")
	WebElement MyFlight;

	public WebElement getMyFlight()
	{
		return MyFlight;
	}
	
	@FindBy(xpath = "/html/body/c-wiz[1]/div[1]/header/div[2]/div[2]/div[1]/div/nav/div[5]/div/button")
	WebElement VacationRentals;
	public WebElement getVacationRentals()
	{
		return VacationRentals;
	}
	
	
	@FindBy(xpath ="//div[@aria-label=\"Main menu\"]")
	WebElement Menu;
	public WebElement getMenu()
	{
		return Menu;
	}

	@FindBy(xpath = "//div[@aria-label=\"Feedback\"]")
	WebElement FeedBack;
	public WebElement getFeedBack()
	{
		return FeedBack;
	}
	
	//@FindBy(xpath="//*[@id=\"iframe-internal-wrapper\"]/div/sc-shared-material-popup/div/div/div/uv-feedback-feedback-manager/div/div/div[2]/uv-feedback-form/div/div[3]/div[2]/div/div[2]/sc-shared-material-button/div/button")
	@FindBy(xpath="//*[@class='scSharedMaterialtextfieldnative-control']")
	WebElement CaptureScreenshot;

	public WebElement getCaptureScreenshot()
	{
		return CaptureScreenshot;
	}
	
	
	@FindBy(xpath = "//div[@data-id=\"7-hmit\"]")
	WebElement HelpButton;
	public WebElement getHelpButton()
	{
		return HelpButton;
	}
	
	@FindBy(xpath = "//*[@id=\"hcfe-content\"]/section/div/div/article/nav/section[3]/h3")
	WebElement HelpTopic;
	public WebElement getHelpTopic()
	{
		return HelpTopic;
	}
	
	@FindBy(xpath = "//*[@id=\"hcfe-content\"]/section/div/div/article/nav/section[3]/div/div/div[2]/a")
	WebElement HelpQuestion;
	public WebElement getHelpQuestion()
	{
		return HelpQuestion;
	}
	
	@FindBy(xpath = "//*[@id=\"hcfe-content\"]/section/div/div[1]/article")
	WebElement HelpAns;
	public WebElement getHelpAns()
	{
		return HelpAns;
	}
	
	@FindBy(xpath = "//*[@id=\"hcfe-content\"]/footer/div/div[1]/form/div")
	WebElement SelectLang;
	public WebElement getSelectLang()
	{
		return SelectLang;
	}
	
	@FindBy(xpath = "/html/body/div[2]/div/footer/div/div[1]/form/div/ol/li[60]")
	WebElement Hindi;
	public WebElement getHindi()
	{
		return Hindi;
	}
	
	@FindBy(xpath = "/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[2]/div[3]/div/div[2]/div/div[1]/section[1]/div/div[1]/div/div/div[4]/div")
	WebElement Stop2;
	public WebElement getStop2()
	{
		return Stop2;
	}
	
	@FindBy(xpath ="//div[@class='yTFeqb wp-ms oJxARb nBWfrd i8qq8b']")
	WebElement About;
	public WebElement getAbout()
	{
		return About;
	}

	public GoogleTravelPage(WebDriver driver2)
	{
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

}
