package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript3
{
@Test	
	public void verifyPageByTitle()
	
	{
		System.setProperty("webdriver.gecko.driver","./oops/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "https://qa-ir.amwater.com";
		driver.get(url);
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,"Investor Relations");
		driver.quit();
		
		
		
	}

	
}
