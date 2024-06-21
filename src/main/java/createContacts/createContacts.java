package createContacts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class createContacts {
	
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\eclipse-workspace\\Thursday\\msedgedriver.exe");
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shivshubham863@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shubh861#@");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

	}
	@Test
	public void addcontacts() {
		driver.findElement(By.xpath("//a[@class='item'][@href='/contacts']")).click();
		driver.findElement(By.xpath("//button[@class='ui linkedin button']//i[@class='edit icon']")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Shubham7777");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Kumar");
		
		//Company
		driver.findElement(By.xpath("//div[@class='ui fluid search selection dropdown']")).click();
		driver.findElement(By.xpath("//div[@class='ui active visible fluid search selection dropdown']//input[@class='search']")).sendKeys("infy");
		driver.findElement(By.xpath("//div[@class='ui active visible fluid search selection dropdown']//div[@class='selected item']")).click();
		
		//Select public access
		driver.findElement(By.xpath("//button[@class='ui small fluid positive toggle button']")).click();
		
		//Select the Assignee
		driver.findElement(By.xpath("//div[@class='ui fluid multiple selection dropdown']//div[@class='divider default text']")).click();
		driver.findElement(By.xpath("//div[@class='ui active visible fluid multiple selection dropdown']//div[@class='selected item']")).click();
		//Email
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("ABCsooohort@gmail.com");
		
		//Tags
		driver.findElement(By.xpath("//div[@class='ui fluid multiple search selection dropdown']")).click();
		driver.findElement(By.xpath("//div[@class='ui active visible fluid multiple search selection dropdown']//input[@class='search']")).sendKeys("Name");
		driver.findElement(By.xpath("//div[@class='ui active visible fluid multiple search selection dropdown']//div[@class=\"visible menu transition\"]")).click();
		
		//Category
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/div/div[2]/div[2]")).click();
		
		//Status
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[1]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[1]/div/div/div[2]/div[2]")).click();
		
		//Description
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Description of Contact");
		
		//TimeZone
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[2]/div/div/input")).sendKeys("Kolkata");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[2]/div/div/input")).click();
									
		//Address
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Room mahal");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Prem Galli");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Kholi no 420");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div/div/div[5]/div/input")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div/div/div[5]/div/div[2]/div[2]")).click();
		
		//Do not call
		WebElement wbb=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[11]/div[1]/div/div/label"));
		wbb.click();
		
		//image
		WebElement wbb1=driver.findElement(By.xpath("//input[@name='image']"));
		String imagelocation="C://Users//shubh//eclipse-workspace//SeleniumPOMframwork//screenshots//lastscreen.png";
		wbb1.sendKeys(imagelocation);
		
		//Save
		driver.findElement(By.xpath("//button[@class='ui linkedin button']]")).click();
		
		
	}
	
	@AfterTest
	public void aftertest() {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Specify the location to save the screenshot
        String screenshotLocation = "C://Users//shubh//eclipse-workspace//SeleniumPOMframwork//screenshots//lastscreen.png";

        // Copy the screenshot to the specified location
        try {
            FileUtils.copyFile(screenshotFile, new File(screenshotLocation));
            System.out.println("Screenshot saved to: " + screenshotLocation);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
		driver.close();
		driver.quit();
	}
	
	

}
