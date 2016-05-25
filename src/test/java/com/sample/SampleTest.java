package com.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class SampleTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:/Documents and Settings/admin/My Documents/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testTitle(){
		Assert.assertEquals("g",driver.getTitle(),"The Title qwerty123 yes Test of the FirstPage is not correct");
		
		//Assert.assertEquals("g",driver.getTitle(),"The Title of the FirstPage is correct");
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();	}
}

