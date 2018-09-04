package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;



public class App 
{
	
    public static void main( String[] args ){
   
    System.setProperty("webdriver.chrome.driver", "C://Users//IBM_ADMIN//Downloads//Selenium//chromedriver.exe");

	WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("http://toolsqa.com/automation-practice-form/");
    //driver.findElement(By.id(""));

   // driver.close();
    
    
    
    }
}
