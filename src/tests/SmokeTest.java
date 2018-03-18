package tests;

import java.util.Iterator;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ResultsPage;
import util.Browser;
import util.IWantTo;
import util.ReadFile;

public class SmokeTest {

	HomePage hp;
	ResultsPage rp;
	
	@BeforeTest
	public void setup(){
		Browser.launch();
		hp=new HomePage();
		rp=new ResultsPage();
	}

	@Test(dataProvider="getData")
	public void searchTest(String key){
		//IWantTo.clear(hp.searchBox);
		IWantTo.waitAndType(hp.searchBox, key);
		IWantTo.click(hp.searchBtn);
		System.out.println(IWantTo.waitAndGetText(rp.resultsCount));
		Browser.pageBack();
		Browser.pageRefresh();
	}
	
	@DataProvider
	public Iterator<String[]> getData(){
		return ReadFile.csv("user.csv");
	}
	
	@AfterTest
	public void quit(){
		Browser.shutdown();
	}
}