package com.DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://myudyogaadhar.org/");
		
		WebElement element = driver.findElement(By.id("office_state"));
		
		Select dropDown =new Select(element);
		//dropDown.selectByVisibleText("UTTAR PRADESH");
		//dropDown.selectByValue(null);
		dropDown.selectByIndex(2);
		if(dropDown.isMultiple()) {
			System.out.println("drop down is multiple : ");
		}else {
			System.out.println("dropdown is not mulltiple : ");
		}
		List<WebElement> alleldropDown = dropDown.getOptions();
		System.out.println("All drop down element size "+alleldropDown.size());
		for(WebElement el:alleldropDown) {
			System.out.println(el.getText());
		}
	}

}
