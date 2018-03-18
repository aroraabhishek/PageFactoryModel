package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Browser;

public class ResultsPage {
	
	public ResultsPage() {
		PageFactory.initElements(Browser.driver, this);
	}
	
	// we don't need to add static
	@FindBy(id="result-count")
	public WebElement resultsCount;

	//public static By resultsCount=By.id("result-count");
	//public static By resultsTitle=By.id("watch-card-title");
}
