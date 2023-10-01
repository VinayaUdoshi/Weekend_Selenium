package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test
{
	public static void main(String[] args) throws InterruptedException
    {
    	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
    	WebDriver driver = new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.get("https://www.facebook.com/");
    	Pom p = new Pom(driver);
    	p.Facebook_button();
    	Thread.sleep(2000);
    	driver.navigate().refresh();
    	Thread.sleep(2000);
    	p.Facebook_username_button();
    	p.Facebook_password_button();
    	p.Facebook_button();
    	
    }
}
