package com.osa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
public static WebDriver openBrowser(String browser) { 
	WebDriver dr=null;
	if(System.getProperty("os.name").toLowerCase().contains("windows")) {
		
		if(browser.toLowerCase().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\win\\chromedriver.exe");
		    dr=new ChromeDriver();
		}else if(browser.toLowerCase().equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\win\\geckodriver.exe");
			dr=new FirefoxDriver();
		}
	}else {
		System.out.println("===========The test is running on "+System.getProperty("os.name")+"==========");
		if(browser.toLowerCase().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/mdzakaria/Desktop/TestNG_project/chromedriver");
		    dr=new ChromeDriver();
		}else if(browser.toLowerCase().equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/mdzakaria/Desktop/TestNG_project/geckodriver");
			dr=new FirefoxDriver();
		}
	}
	return dr;
  }
}
