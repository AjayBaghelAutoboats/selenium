package com.DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_xpath_Locator {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//open url and navigate to system website
		driver.navigate().to("http:\\www.saucedemo.com");
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input.submit-button")).click();
        //switch to product page 
          String currentWindowHandler= driver.getWindowHandle();
          driver.switchTo().window(currentWindowHandler);
          
          
          driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
          driver.findElement(By.cssSelector("button[name$=light]")).click();
        
		}

}
