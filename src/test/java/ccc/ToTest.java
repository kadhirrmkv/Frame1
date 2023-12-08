package ccc;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ddd.FirstPage;
import ddd.PageMa;
import ddd.SecondPage;

public class ToTest extends Base {
	static PageMa pagema;
	static FirstPage fp;
	static SecondPage sp;
	@BeforeClass
	public static void befcl() {
		webstart();
		pagema = new PageMa();
	}
	@Test
	public static void a() {
		fp = pagema.getFp();
		sear(fp.getSear(), "apple watch series");
		click(fp.getSearbut());
		
		
		}
	@Test
	public static void b() {
		sp = pagema.getSp();
		sp.getCl().click();
	}
	
	

}
