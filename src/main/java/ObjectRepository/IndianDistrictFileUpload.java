package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndianDistrictFileUpload {

public WebDriver driver;
	
	


    //UserDataTab
     private By UserDatTab = By.xpath("//button[@id='dataTab']");

     //UserLayer 
     private By UserLayer = By.xpath("//span[text()='+ NEW USER LAYER']");
	

	// File Format(Non Csv File) 
	
	private By fileFormat2 = By.xpath("//select[@id='fileFormat']//option[@value='nonspatial']");
	
	// Data Scope
	
	private By fileFormat21 = By.xpath("//select[@id='dataScope']//option[@value='district']");
	
	//File Name
	
	private By fileFormat22 = By.xpath("//input[@id='file_name']");
	
	//File Browse
	
	private By fileFormat23 = By.id("exampleFormControlFile1");
	
	//Submit button
	
	private By filebtn24 = By.cssSelector("button[id='upload_file']");
	
	//PopUp1 button
	
	private By filebtn25 = By.xpath("//button[text()='OK']");
	
	//PopUp2 button
	
	private By filebtn26 = By.xpath("//button[text()='OK']");
	
	
	

	public IndianDistrictFileUpload(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	

	public WebElement userTabBtn()
	{
		return driver.findElement(UserDatTab);
	}
	
	public WebElement userLayerBtn()
	{
		return driver.findElement(UserLayer);
	}

	
	
	public WebElement fileFormatUpload2()
	{
		return driver.findElement(fileFormat2);
	}
	
	public WebElement dataScope21()
	{
		return driver.findElement(fileFormat21);
	}
	
	public WebElement fileName22()
	{
		return driver.findElement(fileFormat22);
	}
	
	public WebElement fileBrowse23()
	{
		return driver.findElement(fileFormat23);
	}
	
	public WebElement submitBtn24()
	{
		return driver.findElement(filebtn24);
	}
	
	public WebElement filePopUp25()
	{
		return driver.findElement(filebtn25);
	}
	
	public WebElement filePopUp26()
	{
		return driver.findElement(filebtn26);
	}

	
	
}
