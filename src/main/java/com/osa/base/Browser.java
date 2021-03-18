package com.osa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
public static void main(String[] args) {
	WebDriver dr=openBrowser("chrome");
	dr.manage().window().maximize();
	dr.get("https://www.osaconsultingtech.com");
	
}
public static WebDriver openBrowser(String browser) { 
	WebDriver dr=null;
	if(browser.toLowerCase().equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
	    dr=new ChromeDriver();
	}else if(browser.toLowerCase().equals("firefox")) {
		System.setProperty("", "");
		dr=new FirefoxDriver();
	}
	return dr;
  }
}
