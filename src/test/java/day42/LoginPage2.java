package day42;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	WebDriver driver;
	
	// constructor
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);  /// page factory appraoch
	}
	
	//locators
	//@FindBy(xpath="//input[@placeholder='Username']") 
	//WebElement txt_username;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@CacheLookup
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@CacheLookup
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	@CacheLookup
	@FindBy(tagName="a")
	List<WebElement> links;
	
	
	//action methods
	public void setUserName(String user)
	{
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
	
	public int getNumberLinks()
	{
		return links.size();
		
	}

}

