package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{

	  //Declaration
        @FindBy(id = "email")
        private WebElement facebook_username_button;
        
      //Declaration
        @FindBy(id = "pass")
        private WebElement facebook_password_button; 
       
  	  //Declaration
            @FindBy(name = "login")
            private WebElement facebook_search_button;
          
          
     //Initialization     
          public Pom(WebDriver driver)
          {
        	  PageFactory.initElements(driver, this);
          }
        
     //Utilization 
          public void Facebook_username_button()
          {
        	  facebook_username_button.sendKeys("abc");
          }      
          
     //Utilization 
          public void Facebook_password_button()
          {
        	  facebook_password_button.sendKeys("123");
          } 
          
          
    //Utilization 
         public void Facebook_button()
          {
        	  facebook_search_button.click();
          }
          
}
