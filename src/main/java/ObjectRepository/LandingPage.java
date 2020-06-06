package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	public WebDriver driver;
	
	
  private By loginregister = By.xpath("//a[@href='login.php']");


  
  public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	  
	  this.driver = driver;
}





public WebElement LoginReisterLink()
  {
	  return driver.findElement(loginregister);
  }

}
