package com.sap.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver driver;
	@FindBy(id="USERNAME_FIELD-inner")
	public WebElement username;
	@FindBy(id="PASSWORD_FIELD-inner")
	public WebElement password;
	@FindBy(id="login") 
	public WebElement login;
	
	public void filluid(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void fillpwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		login.click();
	}
}




