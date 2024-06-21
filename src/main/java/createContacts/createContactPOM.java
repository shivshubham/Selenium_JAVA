package createContacts;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import io.cucumber.java.Before;

public class createContactPOM {
	
	WebDriver driver;
	String path="\"C:\\Users\\shubh\\eclipse-workspace\\SeleniumPOMframwork\\screenshots\\lastscreen.png\"";
	
	@BeforeTest
	public void BeforTest() {
		driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\eclipse-workspace\\Thursday\\msedgedriver.exe");
		
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		createContactPOMStep contactstep =new createContactPOMStep(driver);
		contactstep.fillUsername("shivshubham863@gmail.com");
		contactstep.fillPassword("Shubh861#@");
		contactstep.clickLogin();
		//contactstep.User();
	}
	@Test
	public void createContact() throws AWTException {
		createContactPOMStep contactstep =new createContactPOMStep(driver);
		contactstep.gotoContacts();
		contactstep.crreatecontactbutton();
		contactstep.fillFirstname("Shubham007");
		contactstep.fillLastname("Shiv");
		contactstep.selectAccess();
		contactstep.emailaddress("Shivshubham0090@gmail.com");
		contactstep.selectcompany1();
		contactstep.selectcompany2("Infy");
		contactstep.selectcompany3();
		contactstep.selectassignee1();
		contactstep.selectassignee2();
		contactstep.selectags1();
		contactstep.selectags2("Name");
		contactstep.selectags3();
		contactstep.filltags1();
		contactstep.filltags2();
		contactstep.description("Define the description");
		contactstep.timezone1("Kolkata");
		contactstep.timezone2();
		contactstep.Address1("pattandur");
		contactstep.Address2("Bangalore");
		contactstep.Address3("Karnataka");
		contactstep.Address4("India");
		contactstep.Address5();
		contactstep.donotcall();
		contactstep.imageUP(path);
		contactstep.savebutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
