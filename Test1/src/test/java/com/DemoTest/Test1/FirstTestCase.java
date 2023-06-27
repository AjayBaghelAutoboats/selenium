package com.DemoTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http:\\www.google.com");
	System.out.println("Title : "+driver.getTitle());
	System.out.println("URL : "+driver.getCurrentUrl());
}

}
