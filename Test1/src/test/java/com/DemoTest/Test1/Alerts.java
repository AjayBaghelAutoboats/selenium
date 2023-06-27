package com.DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://uitestpractice/Students/Switchto");
		// maxmize for the window 
		driver.manage().window().maximize();
		
		//find alert button and perform click button.
		//driver.findElement(By.xpath("//intput[@id='alert']")).click();
		//driver.switchTo().alert();
		
		
	}

}
