package com.macys.ui.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseEngine {
	
	private static WebDriver driver;
	@Parameters("browser")
	@BeforeSuite
	public void openBrowser(String browser) {
		
		String curDir=System.getProperty("user.dir");
		
		if(browser.equalsIgnoreCase("chrome")){
		
		System.setProperty("webdriver.chrome.driver", curDir+"\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.macys.com");
		
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.firefox.driver", curDir+"\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
else if (browser.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver", curDir+"\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		
		
		
		

	}

}
