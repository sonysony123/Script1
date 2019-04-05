package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript2 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./oops/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		String url ="https://qa-ir.amwater.com";
		driver.get(url);
		String actualTitle =driver.getTitle();
		String expectedTitle = "Investor Relations";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Testcase pass");
			
		}
		else
		{
			System.out.println("Testcase fail");
		}
	}
	}