package SelectClass;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutCollectionsPrintOptions 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("file:///Users/vinayau/Desktop/selectdropdown.html");  
        WebElement ele = driver.findElement(By.id("hotel"));
        Select s = new Select(ele);
        List<WebElement> opt = s.getOptions();
        TreeSet<String> l = new TreeSet<String>();
        for(WebElement o:opt)
        {
        	l.add(o.getText());
        }	
        for(String x:l)
        {
        	System.out.println(x);
        }
	}
}
