package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenTest 
{
      @Test
      public void test()
      {
    	  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver");
          WebDriver driver = new FirefoxDriver();
      	  driver.get("https://www.amazon.in");       
      }      
}
