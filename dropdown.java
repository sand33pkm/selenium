package superman;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdown {
	public static void main (String args[]) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandeep\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		Select oselect=new Select(driver.findElement(By.id("continents")));
		oselect.selectByIndex(1);
		Thread.sleep(5000);
		oselect.selectByVisibleText("Africa");
		Thread.sleep(5000);
		List<WebElement> isize=oselect.getOptions();
		int osize=isize.size();
		for(int i=0;i<osize;i++)
		{
			String svalue=oselect.getOptions().get(i).getText();
			System.out.println(svalue);
			if (svalue.equalsIgnoreCase("Australia"))
			{
				oselect.selectByIndex(i);
				break;
			}
		}
		
		driver.quit();
		
		
		
		
		
		
	
		
		
	}
	
	}


