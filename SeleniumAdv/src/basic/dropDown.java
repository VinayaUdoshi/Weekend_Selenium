package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown 
{
	public static void main(String[] args)
	{

		{

			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");

			WebDriver driver = new FirefoxDriver();
			driver.get(" ");
			WebElement ele = driver.findElement(By.id("hotel"));
			Select a = new Select(ele);
			a.selectByIndex(3);;
			a.selectByValue("m");
			a.selectByVisibleText("BBB");
		
            
		
		}
}
}
