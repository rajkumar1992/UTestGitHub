package pageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.UPage;

public class UPageTest extends Base {

	
	@BeforeMethod
	public void inIt()
	{
		startBrowser();
	}
	
	
	@Test
	public void test() throws InterruptedException
	{
		PageFactory.initElements(driver, UPage.class);
		UPage.fillSignIn();
	}
}
