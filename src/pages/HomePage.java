package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Browser;
//import util.IWantTo;
import util.IWantTo;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Browser.driver, this);
	}
	
	// we don't need to add static
	@FindBy(id="search")
	public WebElement searchBox;
	
	@FindBy(id="search-icon-legacy")
	public WebElement searchBtn;
	
	@FindBy(partialLinkText="SIGN IN")
	public WebElement signinLink;
	
	@FindBy(id="logo-icon-locator")
	public WebElement logo;
	
	/*
	public static By searchBox=By.id("search");
	public static By searchBtn=By.id("search-icon-legacy");
	public static By signinLink=By.partialLinkText("SIGN IN");
	public static By logo=By.id("logo-icon-locator");
	*/	

	//To search any web-element using any attribute
	@FindAll({
		@FindBy(id="123"),
		@FindBy(className="abc")
	})
	WebElement abc;
	
	//for using driver.finelementsby use
	//<List<WebElement> ab;
	
}