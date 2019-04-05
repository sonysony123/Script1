package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class toolTip
{
	public static void main(String[] args)
	{
		String URL="https://qa-ir.amwater.com/#/home";
		System.setProperty("webdriver.gecko.driver","./oops/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get(URL);
		String expectedTooltip ="Presentations";
		//WebElement Presentations = driver.findElement(""));
		
		Actions builder =new Actions(driver);
	//	builder.clickAndHold().moveToElement(Presentations);
	//	builder.moveToElement(Presentations).build().perform();	
		
		 WebElement toolTipElement = driver.findElement(By.xpath("//li[@tooltip='Presentations']"));
		 String actualTooltip = toolTipElement.getText();
		 
		 System.out.println("Actual Title of Tool Tip "+actualTooltip);
		 if(actualTooltip.equals(expectedTooltip))
		 {
			 System.out.println("Tet Case Passes");
		 }
		 else
		 {
			 System.out.println("Test Case Failed");
		 }
	}

}
