package com.org;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {

	WebDriver driver=null;
	
		@BeforeMethod
		public void setUp()
		{
		System.setProperty("webdriver.chrome.driver","C:\\Workspace\\Maven_GIT_Selenium_Integration\\Browsers\\chromedriver.exe");  
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--no-sandbox", "--disable-dev-shm-usage");	
		chromeOptions.setBinary("C:\\Users\\HP\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver(chromeOptions);
		System.out.println("browser opened");
		}
		
		@Test
		public void testcase1()
		{
			driver.get("https://www.google.com");	
			String title = driver.getTitle();
			System.out.println("title="+title);
			
		}
		
		@AfterMethod
		public void closeDriver()
		{
			driver.close();
		}
		
	}

