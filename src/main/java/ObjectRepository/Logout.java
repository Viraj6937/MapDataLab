package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {

	
	public WebDriver driver;
	
	private By logout = By.xpath("//a[@id='controlLog']");
	
	
	public Logout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}


	public WebElement logOut()
	{
		return driver.findElement(logout);
	}
}
