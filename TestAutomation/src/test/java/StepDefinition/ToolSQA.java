package StepDefinition;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class ToolSQA 
{
	
 
  @Test
  
   @Then("^I navigate to the Application URL")
   public void openTheApplication(){
	   System.out.println("In the step Definition");
   System.setProperty("webdriver.chrome.driver", "C://Users//IBM_ADMIN//Downloads//Selenium//chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://toolsqa.com/automation-practice-form/");
   driver.close();
   }
    
    
    
}
