package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleTravelFlightPage
{
WebDriver driver;
    
@FindBy(xpath="/html/body/c-wiz[2]/div/div[2]/div/c-wiz/div[1]/div/div[1]/div[2]/div/span[2]/a/button")
WebElement Flights;

public WebElement getFlights()
{
	return Flights;
}

@FindBy(xpath ="//div[@class = 'VfPpkd-TkwUic VfPpkd-ksKsZd-mWPk3d-OWXEXe-AHe6Kc-XpnDCe VfPpkd-ksKsZd-mWPk3d']")
WebElement FlightTrip;

public WebElement getFlightTrip()
{
	return FlightTrip;
}

@FindBy(xpath="//li[@class = 'MCs1Pd UbEQCe VfPpkd-OkbHre VfPpkd-OkbHre-SfQLQb-M1Soyc-bN97Pc VfPpkd-aJasdd-RWgCYc-wQNmvb ib1Udf VfPpkd-rymPhb-ibnC6b VfPpkd-rymPhb-ibnC6b-OWXEXe-SfQLQb-M1Soyc-Bz112c VfPpkd-rymPhb-ibnC6b-OWXEXe-SfQLQb-Woal0c-RWgCYc VfPpkd-rymPhb-ibnC6b-OWXEXe-gk6SMd']")
WebElement MultiCity;

public WebElement getMultiCity()
{
	return MultiCity;
}


@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div/div[1]/div/button")
WebElement FlightAdults;

public WebElement getFlightAdults()
{
	return FlightAdults;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div/div[2]/ul/li[1]/div/div/span[3]/button")
WebElement Person2;

public WebElement getPerson2()
{
	return Person2;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div/div")
WebElement FlightEconomy;

public WebElement getFlightEconomy()
{
	return FlightEconomy;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div/div/div[2]/ul/li[3]")
WebElement FlightBusiness;

public WebElement getFlightBusiness()
{
	return FlightBusiness;
}


@FindBy(xpath="//*[@id=\"i23\"]/div[6]/div[2]/div[2]/div[1]/div/input")
WebElement FlightFrom;

public WebElement getFlightFrom()
{
	return FlightFrom;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[2]/div[1]/div[6]/div[3]/ul/li[1]")
WebElement FlightPune;

public WebElement getFlightPune()
{
	return FlightPune;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[2]/div[1]/div[4]/div/div/div[1]/div/div/input")
WebElement FlightTo;

public WebElement getFlightTo()
{
	return FlightTo;
}


@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[2]/div[1]/div[6]/div[3]/ul/li[1]")
WebElement FlightToDubai;

public WebElement getFlightToDubai()
{
	return FlightToDubai;
}


@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/div/input")
WebElement Departure;

public WebElement getDeparture()
{
	return Departure;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div[3]/div[5]/div[2]")
WebElement DepartureDate27;

public WebElement getDepartureDate27()
{
	return DepartureDate27;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/div[3]")
WebElement Return5;

public WebElement getReturn5()
{
	return Return5;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div[3]/div/button")
WebElement Done;

public WebElement getDone()
{
	return Done;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[2]/div/button")
WebElement Search;

public WebElement getSearch()
{
	return Search;
}
	
@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/button")
WebElement StopFilter;

public WebElement getStopFilter()
{
	return StopFilter;
}
	
@FindBy(xpath="/html/body/div[7]/div[1]/div[3]/div[1]/div/div[2]/span/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div[1]/canvas")
WebElement DatesPrice;

public WebElement getDatesPrice()
{
	return DatesPrice;
}

@FindBy(xpath="/html/body/div[7]/div[1]/div[3]/div[2]/div[2]/div[2]/div/button")
WebElement OkButton;

public WebElement getOkButton()
{
	return OkButton;
}

@FindBy(xpath="//*[@class='uRo9t NMm5M']")
WebElement FlightStop;

public WebElement getFlightStop()
{
	return FlightStop;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[1]/div[2]/div[1]/div/div[2]/span/button")
WebElement FlightAirlines;

public WebElement getFlightAirlines()
{
	return FlightAirlines;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[2]/div[3]/div/div[1]/section/div[2]/div[1]/div/div/div/div/div[2]/div[1]/ol/li[1]")
WebElement StarAirlines;

public WebElement getStarAirlines()
{
	return StarAirlines;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[2]/div[3]/div/div[1]/section/div[2]/div[1]/div/div/div/div/div[2]/div[1]/ol/li[2]")
WebElement OnWorldAirlines;

public WebElement getOnWorldAirlines()
{
	return OnWorldAirlines;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[1]/div[2]/div[1]/div/div[3]/span/button")
WebElement FlightBag;

public WebElement getFlightBag()
{
	return FlightBag;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[2]/div[3]/div/div[1]/section/div[2]/div[1]/div/div/div[1]/div[2]/div/div/span[3]/button")
WebElement FlightBag2;

public WebElement getFlightBag2()
{
	return FlightBag2;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div/div[2]/div[1]/div/div[4]/span/button")
WebElement FlightPrice;

public WebElement getFlightPrice()
{
	return FlightPrice;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[1]/div[2]/div[1]/div/div[5]/span/button")
WebElement TimeButton;

public WebElement getTimeButton()
{
	return TimeButton;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[1]/div[2]/div[1]/div/div[6]/span/button")
WebElement FlightEmisions;

public WebElement getFlightEmisions()
{
	return FlightEmisions;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[2]/div[3]/div/div[1]/section/div[2]/div[1]/div/div/div[1]/div[1]")
WebElement LessEmisions;

public WebElement getLessEmisions()
{
	return LessEmisions;
}


@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div/div[2]/div[1]/div/div[7]/span/button")
WebElement ConnectingAirport;

public WebElement getConnectingAirport()
{
	return ConnectingAirport;
}

@FindBy(xpath="/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div/div[2]/div[1]/div/div[8]/span/button")
WebElement DurationFilter;

public WebElement getDurationFilter()
{
	return DurationFilter;
}

	public GoogleTravelFlightPage(WebDriver driver2)
	{
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

}
