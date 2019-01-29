package com.VB.MavenRestFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class SampleTestOne {
	WebDriver d;
	
	@BeforeMethod
	public void beforeMethod(){
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Training\\Test App\\resources\\common\\chromedriver.exe");
		d = new ChromeDriver();	
	}
	
	@AfterMethod
	public void afterMethod(){
		d.quit();
	}
	
	
	@Test
	public void testOne(){
		d.get("https://www.google.com");
		System.out.println("testOne");
		
		
		
	}	
	
	@Test	
	public void testTwo(){
		d.get("https://www.google.com");
		System.out.println("testTwo");
		
		
	}	
	@Test	
	public void testThree(){
		d.get("https://www.google.com");
		System.out.println("testThree");
		
	}
	
	
	
	

	
}
