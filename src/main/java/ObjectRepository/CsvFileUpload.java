package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CsvFileUpload {

	
	public WebDriver driver;
	
	
	private By usrdataTab = By.xpath("//button[@id='dataTab']");
	
	
	private By userLayer = By.xpath("//span[text()='+ NEW USER LAYER']");
	
	//File Format
	private By fileform9 = By.xpath("//select[@id='fileFormat']");
	
	//Layer Name
	private By fileform91 = By.cssSelector("input[id='file_name']");

	// File Browse
	
	private By fileform92 = By.id("exampleFormControlFile1");
	
	//Submit Button
	private By fileform93 = By.xpath("//button[@id='upload_file']");
	
	//PopUp Button 1
	
	private By fileform94 = By.xpath("//button[text()='OK']");
	
	//PopUp Button 2
	
	private By fileform95 = By.xpath("//button[text()='OK']");
	
	
	
	
	
	
	public CsvFileUpload(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement UseTabBtn()
	{
		return driver.findElement(usrdataTab);
	}
	
	
	public WebElement userLayerBtn()
	{
		return driver.findElement(userLayer);
	}
	

	public WebElement fileFormat9()
	{
		return driver.findElement(fileform9);
	}
	
	public WebElement fileName91()
	{
		return driver.findElement(fileform91);
	}
	
	public WebElement fileBrowse92()
	{
		return driver.findElement(fileform92);
	}
	
	public WebElement fileSubBtn93()
	{
		return driver.findElement(fileform93);
	}
	
	public WebElement filePopUp94()
	{
		return driver.findElement(fileform94);
	}
	
	public WebElement filePopUp95()
	{
		return driver.findElement(fileform95);
	}
	
}
