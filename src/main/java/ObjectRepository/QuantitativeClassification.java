package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QuantitativeClassification {
	
	public WebDriver driver;
	
	// classifyBtn
	private By classiBtn = By.cssSelector("button[id='btnlayer1']");
	
    private By classiRadiBtn = By.xpath("//input[@id='quantitative']");	
    
 //   private By classiLayeProp1 = By.xpath("//select[@id='column']");
 	
	
    private By clasfiycircle = By.xpath("//select[@id='classesDrop']//option[1]");
    
    private By classifySubBtn = By.xpath("//button[@id='classifyBtn']");
    
    
	public QuantitativeClassification(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
	   this.driver = driver;
	}

	public WebElement ClassifyBtn()
	{
		return driver.findElement(classiBtn);
	}
	
	public void classifyRadioBtn() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@id='quantitative']")).click();
		
		boolean radioBtn = driver.findElement(classiRadiBtn).isSelected();
		
		if(!radioBtn)
		{
			System.out.println("Sorry Classification radio Button is not selected");
		}
		else
		{
			
			List<WebElement> classiLayerPropty = driver.findElements(By.xpath("//select[@id='column']"));
			
			for(int i=0; i<classiLayerPropty.size();i++)
			{
				
				Thread.sleep(1000);
				
				 WebElement c = classiLayerPropty.get(i);
				 
				 
				 Select sw1 = new Select(c);
				 
				 sw1.selectByIndex(1);
				 
				
				System.out.println("Option Selected successfully is" +sw1);
				
				List<WebElement>classimethod = driver.findElements(By.xpath("//select[@id='methodVal']"));
				
				
				
				for(int j=0;j<classimethod.size();j++)
				{
				
					Thread.sleep(1000);
					
					WebElement s = classimethod.get(j);
					
					Select sw2 = new Select(s);
					
					
					 sw2.selectByIndex(2);				
		
					System.out.println("clasification method is selected is ");
					
					
					
				}
				
				
			}
		}
		
		
		
	}
	
	
	
	public WebElement classifyCircle()
	{
		return driver.findElement(clasfiycircle);
	}
	
	public WebElement classifyBtn()
	{
		return driver.findElement(classifySubBtn);
	}
	
	

}
