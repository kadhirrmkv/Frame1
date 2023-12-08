package ddd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ccc.Base;

public class SecondPage extends Base {
	public SecondPage() {
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private WebElement cl;
	
	public WebElement getCl() {
		return cl;
	}
}
