package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteFileLayer {
	
	public WebDriver driver;
	
	private By deletelyr = By.id("Dllayer1");
	
	private By deletepopup1 = By.xpath("//button[text()='OK']");
	
	private By deletepopup2 = By.xpath("//button[text()='OK']");
	
	
	
	public DeleteFileLayer(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}


	public WebElement deleteFileLayerBtn()
	{
		return driver.findElement(deletelyr);
	}
	
	public WebElement deletepopup1()
	{
		return driver.findElement(deletepopup1);
	}
	

	public WebElement deletepopup2()
	{
		return driver.findElement(deletepopup2);
	}


}
