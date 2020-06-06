package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AnalyticsZoneLayer {
	
	
	  public WebDriver driver;
	  
	  
	  //Untick The New Layer File
	  
	  private By UntickF = By.xpath("//input[@id='layer1']");
	  
	  
	  //Analytics Tab  Menu Button
	  
	  private By AnalyticsTB = By.xpath("//button[@id='controlAnalytics']");
	  
	  
	 // Analytics Zonal Button
	  
	  private By AnalyticsZB = By.xpath("//button[@class='btn zonalbtn']");
	  
	  //ZonalLayer
	  
	  
	  
	  
	  // LevelBy
	  
	  
	  
	 
	  //  ValueLayer
	  
	  
	  
	  
	  
	  
	 	  
	  
	  public AnalyticsZoneLayer(WebDriver driver) {
		// TODO Auto-generated constructor stub
		  
		  this.driver = driver;
	}

	public WebElement UntickFile100()
	  {
		  return driver.findElement(UntickF);
	  }
	  
	  public WebElement AnalyticsTab101()
	  {
		  return driver.findElement(AnalyticsTB);
		 
	  }
	  
	  public WebElement AnalyticZonalBtn102()
	  {
		  return driver.findElement(AnalyticsZB);
	  }
	  	  
	  
	  
}
