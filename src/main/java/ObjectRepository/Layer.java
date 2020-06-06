package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Layer {

	
	public WebDriver driver;
	

	private By LBtn = By.xpath("//button[@id='controlLayer']");
	
	//Radio Button
	
	private By fileRB = By.xpath("//input[@id='layer1']");
	
	
	
	public Layer(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement LayerMenuBtn()
	{
		return driver.findElement(LBtn);
	}
	
	public WebElement FileRadioBtnCheck()
	{
		return driver.findElement(fileRB);
	}

	
}
