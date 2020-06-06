package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminZone {

	public WebDriver driver;

	
	
	
	
	  public AdminZone(WebDriver driver) {
		// TODO Auto-generated constructor stub
		  
		  this.driver = driver;
		  
	}

	public void adminZone() throws InterruptedException
	  {
		  

		   List<WebElement> zonallayer = driver.findElements(By.id("zonalLay"));
		  
		   for(int i=0; i<zonallayer.size();i++)
		   {
			   
			  WebElement t1 = zonallayer.get(i);
			  
			  Select s1 = new Select(t1);
			  
			  s1.selectByIndex(1);
			  
		
			    List<WebElement> levelBy = driver.findElements(By.xpath("//select[@id='seleBy']"));
			    
			    for(int j=0; j<levelBy.size();j++)
			    {
			    	
			    	
			    	WebElement t2 = levelBy.get(j);
			    	
			    	Select s2 = new Select(t2);
			    	
			    	s2.selectByIndex(1);
			    	
			    }
			    
		
			     List<WebElement> valueLayer = driver.findElements(By.xpath("//select[@id='valueLay']"));
			  
			     
			     for(int k = 0; k<valueLayer.size();k++)
			     {
			    	 
			    	 WebElement t3 = valueLayer.get(k);
			    	 
			    	 Select s3 = new Select(t3);
			    	 
			    	 s3.selectByIndex(1);
			    	 
			     }
			     
			     
			     List<WebElement> zonalStateType = driver.findElements(By.xpath("//select[@id='stateType']"));
			     
			     
			     for(int l=0; l<zonalStateType.size();l++)
			     {
			    	 Thread.sleep(1000);
			    	 
			    	 WebElement t4 = zonalStateType.get(l);
			    	 
			    	 Select s4 = new Select(t4);
			    	 
			    	 s4.selectByIndex(5);
			    	 
			     }
			  
			     
			     List<WebElement> valueField = driver.findElements( By.xpath("//select[@id='valueField']"));
			     
			     for(int m=0;i<valueField.size();i++)
			     {
	
			    	 Thread.sleep(1000);
			    	 
			    	 WebElement t5 = valueField.get(m);
			    	 
			    	 Select s5 = new Select(t5);
			    	 
			    	 s5.selectByIndex(1);
			    	 
			     }
			     
			        
			     
		   }
		     
		  
		  
	  }
	  
	  
	  
	public void classificationMethods() throws InterruptedException
	{
		
	  driver.findElement(By.id("zonLayerbtn")).sendKeys(Keys.ENTER);
	  
	  Thread.sleep(1000);
	  
	  List<WebElement>radioSelect = driver.findElements(By.cssSelector("//input[@class='change-methodDL']"));
	  
	  
	  for(int i=1; i<radioSelect.size();i++)
	  {
		  
		   radioSelect.get(i).click();
		  
		  if( radioSelect.get(i).isSelected())
		  {
			driver.findElement(By.xpath("//select[@class='form-control change-numberDL']//option[1]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@id='classifyZonal']")).click();
			  
		  }
		  
	  }
	  
	  
		
	}
	
	
	
	
}
