package com.DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountRadioButton {
	public static void main(String[] args) {

		// Lauch chrome browser

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// open url on //https://udyamregistration.gov.in/Udyam_Login.aspx
		//driver.navigate().to("https://udyamregistration.gov.in/Udyam_Login.aspx");
		driver.get("https://www.calculator.net/");
		// find radio buttons elements on webpage
		List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
		
		// count total number of radio button
		System.out.println("Total no of radio button on webpage : "+radioButtonList.size());
	//	driver.close();
	}

}
