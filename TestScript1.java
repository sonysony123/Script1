package Scripts;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class TestScript1

{
	
		public static void main(String[] args)
		{
			
	String URL ="https://qa-ir.amwater.com";
	System.setProperty("webdriver.gecko.driver","./oops/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get(URL);
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	
		}
}
