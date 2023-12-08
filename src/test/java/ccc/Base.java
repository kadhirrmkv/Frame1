package ccc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	protected static WebDriver dr;
	public static void webstart() {
		dr = new ChromeDriver();
		dr.get("https://www.amazon.in/");
	}
	public static void sear(WebElement aa,String bb) {
		aa.sendKeys(bb);
	}
	public static void click(WebElement cl) {
		cl.click();
	}
	

}
