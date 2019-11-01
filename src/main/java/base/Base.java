package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;

	public static void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://prod-keycloak.cloud.utest.com/auth/realms/applause/protocol/openid-connect/auth/?client_id=utestv2&redirect_uri=https%3A%2F%2Fwww.utest.com%2Foauth-login%2F&response_type=code");
	    driver.manage().window().maximize();
	    
	    
	}
	
	
}
