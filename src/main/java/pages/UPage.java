package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UPage {
 
	@FindBy(id="username")
	static WebElement uname;
	
	
	@FindBy(id="password")
	static WebElement pass;
	
	
	public static void fillSignIn() throws InterruptedException
	{
		uname.sendKeys("rajkumar@gmail.com");
		Thread.sleep(2000);
		pass.sendKeys("Hello123");
	}
}
