package com.DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountHyperLink {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.calculator.net/");
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		System.out.println("Total links on webpage "+linkElements.size());
		for(WebElement elements:linkElements) {
			System.out.println(elements.getText());
		}
	//	driver.close();
	}

}
