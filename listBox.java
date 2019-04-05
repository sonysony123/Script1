package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class listBox
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver","./oops/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	String URL = "https://qa-ir.amwater.com";
	driver.get(URL);
	//listbox of AWK graph
	
	Select s1 = new Select(driver.findElement(By.xpath("//i[@class='fas fa-angle-down colorlightBlue']")));
	s1.selectByVisibleText("FAQ");


	
	
	
	
	
	
	
}
}
