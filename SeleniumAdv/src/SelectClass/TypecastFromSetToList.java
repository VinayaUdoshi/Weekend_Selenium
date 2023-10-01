package SelectClass;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TypecastFromSetToList 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("file:///Users/vinayau/Desktop/selectdropdown.html");  
        WebElement ele = driver.findElement(By.id("hotel"));
        TreeSet<String> t = new TreeSet<String>();
        Select s = new Select(ele);
        List<WebElement> opt = s.getOptions();
        for(WebElement o:opt)
        {
        	String text = o.getText();
        	t.add(text);
        }
        ArrayList<String> l = new ArrayList<String> (t);
        for(String x : l)
        {
        	System.out.println(x);
        }
	}
	
}
