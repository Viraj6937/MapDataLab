package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeojsonFileUpload {
	
	public WebDriver driver;
	
	
	private By UserDatTab = By.xpath("//button[@id='dataTab']");
	
	private By UserLayer = By.xpath("//span[text()='+ NEW USER LAYER']");
	
	private By filefmt = By.xpath("//select[@id='fileFormat']//option[2]");
	
	private By filenme = By.xpath("//input[@id='file_name']");
	
	private By browsefl = By.id("exampleFormControlFile1");
	
	private By subBtn = By.cssSelector("button[id='upload_file']");
	
    private By pop1 = By.xpath("//button[text()='OK']");
    
    private By pop2 = By.xpath("//button[text()='OK']");
	
	
	public GeojsonFileUpload(WebDriver driver) {
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
	
	public WebElement fileformat()
	{
		return driver.findElement(filefmt);
	}
	
	public WebElement fileName()
	{
		return driver.findElement(filenme);
	}
	
	public WebElement browseFile()
	{
		return driver.findElement(browsefl);
	}
	
	public WebElement addLayerSubmitBtn()
	{
		return driver.findElement(subBtn);
	}


	public WebElement popUp1Btn() {
		
		return driver.findElement(pop1);
		
		
	}
	
	public WebElement popUp2Btn()
	{
		return driver.findElement(pop2);
	}

	
	
	
}
