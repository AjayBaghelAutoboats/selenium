package com.DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookToolTip {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		String actualToolTip = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");

		String expectedToolTip = "Sign up for Facebook";

		if (actualToolTip.equals(expectedToolTip)) {
			System.out.println("test passed");
		} else {
			System.out.println("test faild");
		}
		driver.quit();
	}

}
