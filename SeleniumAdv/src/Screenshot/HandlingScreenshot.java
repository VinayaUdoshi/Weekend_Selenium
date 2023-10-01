package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class HandlingScreenshot
{
	public static void main(String[] args) throws InterruptedException, IOException
	{

		{
 
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.amazon.com/");
            
            TakesScreenshot tss = (TakesScreenshot)driver;
            File temp = tss.getScreenshotAs(OutputType.FILE);
            
            File per = new File("./Screenshots/a1.png");
            FileHandler.copy(temp, per);    
                            
		}
	}
}
