package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IWantTo extends Browser{
	
		public static void click(WebElement element){
		element.click();
	}
	
	public static void waitAndClick(WebElement element){
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public static void clear(WebElement element){
		element.clear();
	}
	
	public static void waitAndClear(WebElement element){
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
	}
	
	public static void type(WebElement element, String value){
		element.sendKeys(value);
	}
	
	public static void type(WebElement element, Keys value){
		element.sendKeys(value);
	}

	public static void waitAndType(WebElement element, String value){
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(value);
	}
	
	public static void waitAndType(WebElement element, Keys value){
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(value);
	}
	
	public static String getText(WebElement element){
		return element.getText();
	}
	
	public static String waitAndGetText(WebElement element){
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}
}