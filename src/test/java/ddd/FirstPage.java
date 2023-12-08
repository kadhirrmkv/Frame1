package ddd;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ccc.Base;

public class FirstPage extends Base {
	
	public FirstPage() {
		
		PageFactory.initElements(dr, this);
	}
	
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement sear;
	public WebElement getSear() {
		return sear;
	}
	
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement searbut;
	public WebElement getSearbut() {
		return searbut;
	}
	
}
