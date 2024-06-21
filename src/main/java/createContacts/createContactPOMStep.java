package createContacts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createContactPOMStep {
	WebDriver driver;
	
	//Login Page
	//Username
	@FindBy(xpath="//input[@name='email']") WebElement Username;
	public void fillUsername(String username) {
		Username.sendKeys(username);
	}
	
	//Password
	@FindBy(xpath="//input[@name='password']") WebElement Password;
	public void fillPassword(String password) {
		Password.sendKeys(password);
	}
	
	//Login
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement LoginButton;
	public void clickLogin() {
		LoginButton.click();
	}
	
	//User 
	@FindBy(xpath="//span[@class='user-display']") WebElement DisplayedUser;
	
	//navigate to Contacts page
	@FindBy(xpath="//a[@class='item'][@href='/contacts']") WebElement gotoContactpage;
	public void gotoContacts() {
		gotoContactpage.click();
	}
	
	//CreateContact
	@FindBy(xpath="//button[@class='ui linkedin button']//i[@class='edit icon']") WebElement createbutton;
	public void crreatecontactbutton() {
		createbutton.click();
	}
	
	//First Name
	@FindBy(xpath="//input[@name='first_name']") WebElement Firstname;
	public void fillFirstname(String firstName) {
		Firstname.sendKeys(firstName);
	}
	
	//Last Name
	@FindBy(xpath="//input[@name='last_name']") WebElement Lastname;
	public void fillLastname(String lastName) {
		Lastname.sendKeys(lastName);
	}
	
	//Select Access
	@FindBy(xpath="//button[@class='ui small fluid positive toggle button']") WebElement Access;
	public void selectAccess() {
		Access.click();
	}
	
	//Email
	@FindBy(xpath="//input[@placeholder='Email address']") WebElement Emailaddress;
	public void emailaddress(String email) {
		Emailaddress.sendKeys(email);
	}
	
	//Company
	@FindBy(xpath="//div[@class='ui fluid search selection dropdown']") WebElement company1;
	public void selectcompany1() {
		company1.click();
	}
	@FindBy(xpath="//div[@class='ui active visible fluid search selection dropdown']//input[@class='search']") WebElement company2;
	public void selectcompany2(String companyname) {
		company2.sendKeys(companyname);
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/div[2]/div") WebElement company3;
	public void selectcompany3() {
		company3.click();
	}
	
	//Select the Assignee
	@FindBy(xpath="//div[@class='ui fluid multiple selection dropdown']//div[@class='divider default text']") WebElement assignee1;
	public void selectassignee1() {
		assignee1.click();
	}
	@FindBy(xpath="//div[@class='ui active visible fluid multiple selection dropdown']//div[@class='selected item']") WebElement assignee2;
	public void selectassignee2() {
		assignee2.click();
	}
	
	//Tags
	@FindBy(xpath="//div[@class='ui fluid multiple search selection dropdown']") WebElement tags1;
	public void selectags1() {
		tags1.click();
	}
	@FindBy(xpath="//div[@class='ui active visible fluid multiple search selection dropdown']//input[@class='search']") WebElement tags2;
	public void selectags2(String tagvalue) {
		tags2.sendKeys(tagvalue);
	}
	@FindBy(xpath="//div[@class='ui active visible fluid multiple search selection dropdown']//div[@class='visible menu transition']") WebElement tags3;
	public void selectags3() {
		tags3.click();
	}
	
	//Category
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/div") WebElement category1;
	public void filltags1() {
		category1.click();
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/div/div[2]/div[2]") WebElement category2;
	public void filltags2() {
		category2.click();
	}
	
	//Status
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[1]/div/div") WebElement status1;
	public void selectstatus1() {
		status1.click();
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[1]/div/div/div[2]/div[2]") WebElement status2;
	public void selectstatus2() {
		status2.click();
	}
	
	//Description
	@FindBy(xpath="//textarea[@name='description']") WebElement description;
	public void description(String description_value) {
		description.sendKeys(description_value);
	}
	
	//TimeZone
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[2]/div/div/input") WebElement timezone1;
	public void timezone1(String zonenation) {
		timezone1.sendKeys(zonenation);
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[2]/div/div/div[2]/div") WebElement timezone2;
	public void timezone2() {
		timezone2.click();
	}
	
	//Address
	@FindBy(xpath="//input[@name='address']") WebElement address1;
	public void Address1(String street) {
		address1.sendKeys(street);
	}
	@FindBy(xpath="//input[@name='city']") WebElement address2;
	public void Address2(String city) {
		address2.sendKeys(city);
	}
	@FindBy(xpath="//input[@name='state']") WebElement address3;
	public void Address3(String state) {
		address3.sendKeys(state);
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div/div/div[5]/div/input") WebElement address4;
	public void Address4(String nation) {
		address4.sendKeys(nation);
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div/div/div[5]/div/div[2]/div[2]") WebElement address5;
	public void Address5() {
		address5.click();
	}
	
	//Do not call
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[11]/div[1]/div/div/label") WebElement checkbox1;
	public void donotcall() {
		checkbox1.click();
	}
	
	//image
	@FindBy(xpath="//input[@name='image']") WebElement image;
	public void imageUP(String path1) throws AWTException {
		image.click();
		Robot robot= new Robot();
		
		StringSelection stringselect=new StringSelection(path1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		// Simulate Ctrl+V (paste) to paste the file path into the file explorer dialog
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	//Save
	@FindBy(xpath="//button[@class='ui linkedin button']//i[@class='save icon']") WebElement savedata;
	public void savebutton() {
		savedata.click();
	}
	
	createContactPOMStep(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void User() {
		String user= DisplayedUser.getText();
		if(user=="Shubham  kumar") {
			System.out.print("Login Success for:"+ user);
		}
		else {
			System.out.print("Login Not Success for:");
		}
		
	}
	
}
