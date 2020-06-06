package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QualitativeClassification {

	public WebDriver driver;
	
	
	private By classiBtnTab = By.cssSelector("button[id='btnlayer1']");

	private By ClassifySubBtn2 = By.xpath("//button[@id='classifyBtn']");
	
	public QualitativeClassification(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	
	public WebElement ClassiBtnTab()
	{
		return driver.findElement(classiBtnTab);
	}
	

	public void qualitativeClassify() throws InterruptedException
	{
		
		
		driver.findElement(By.xpath("//input[@id='qualitative']")).click();
		
		boolean r = driver.findElement(By.xpath("//input[@id='qualitative']")).isSelected();
		
		if(!r)
		{
			System.out.println("no qualitative option is been selected");
		}
		else
		{
			
			List<WebElement> classilyr = driver.findElements(By.xpath("//select[@id='columnStr']"));
			
			for(int i=0; i<classilyr.size();i++)
			{
				
				Thread.sleep(2000);
				
				WebElement s1 = classilyr.get(i);
				
				Select s2 = new Select(s1);
				
				s2.selectByIndex(2);
				
				
				List<WebElement> classiMtd = driver.findElements(By.xpath("//select[@id='methodValStr']"));
				
				
				for(int j=0; j<classiMtd.size();j++)
				{
					Thread.sleep(2000);
					
					WebElement c4 = classiMtd.get(j);
					
					Select s5 = new Select(c4);
					
					s5.selectByIndex(1);
					

					
				}
				
			}
			
		}
		
		
	}
	
	
	public WebElement ClassifySubBtn()
	{
		return driver.findElement(ClassifySubBtn2);
	}
	
	
	
}
