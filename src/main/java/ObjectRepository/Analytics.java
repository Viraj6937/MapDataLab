package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Analytics {
	
	public WebDriver driver;
	
	//UserData
	private By UserDataa = By.id("dataTab");
	
	//NewUserLayer
	
	private By NewUser = By.id("controlNewLayer");
	
	public Analytics(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}


	public WebElement UserData()
	{
		return driver.findElement(UserDataa);
	}
	
	
	public WebElement NewUserLayer()
	{
		return driver.findElement(NewUser);
	}
	


}
