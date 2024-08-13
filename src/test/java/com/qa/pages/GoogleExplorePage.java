package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleExplorePage
{

	WebDriver driver;
	
	@FindBy(xpath ="//a[@href=\"https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3DGardens%2Bby%2Bthe%2BBay%26stick%3DH4sIAAAAAAAAAONgFuLQz9U3MCsxKlHiBLGSDDKSTLUUs5Ot9HPykxNLMvPz4AyrxJKSosRkELMYAFflGKs6AAAA%23fpstate%3Dtrskp%26trifp%3Dkpq%25253DGardens%25252Bby%25252Bthe%25252BBay%252526skpm%25253D%2Fm%2F0b0hb5%252526t%25253Dd&psig=AOvVaw2gIUTFKfh-PRy9xvD6bLne&ust=1720587092972000&rct=j&opi=77919732&ved=0CAMQz7sGKAFqGAoTCMD10sWUmYcDFQAAAAAdAAAAABC1AQ\"]")
	WebElement GardenByTheBay;

	public WebElement getGardenByTheBay()
	{
		return GardenByTheBay;
	}
	
	@FindBy(xpath ="//a[@aria-label=\"View things to do\"]")
	WebElement ViewThingsToDo;

	public WebElement getViewThingsToDo()
	{
		return ViewThingsToDo;
	}
	
	@FindBy(css ="div.PZPZlf.ssJ7i.B5dxMb")
	WebElement SingaporeWebsite;

	public WebElement getSingaporeWebsite()
	{
		return SingaporeWebsite;
	}
	
	//div[@class = 'kp-wholepage ss6qqb u7yw9 zLsiYe mnr-c kp-wholepage-osrp Jb0Zif EyBRub']
	//a[@aria-label="View things to do"]
	

	public GoogleExplorePage(WebDriver driver2)
	{
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

}
