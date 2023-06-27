package com.DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLink {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=common/home");
		driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Test case failds");
		}
		driver.close();
	}

}
