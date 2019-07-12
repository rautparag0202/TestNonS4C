package com.sap.test;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sap.objectrepository.Loginpage;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;

public class Methods
{
	public WebDriver driver;
	public Scenario s;
	Loginpage LP;
	static Properties p=new Properties();
	public static void configfile() throws Exception
	{
		File f1=new File("config.propeties");
		FileInputStream fis=new FileInputStream(f1);
		p.load(fis);	
	}
	
	public void screnshot()
	{
		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		s.embed(ss, "image.png");
	}
	
	@Before
	public void method1(Scenario s)
	{
		this.s=s;
	}
	@Given("^Launch application1$")
	public void method2() throws Exception
	{
		Methods.configfile();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(p.getProperty("url"));	
	}
}