package com.DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		// driver.get("file://C:/Users/admin/Desktop/sampletable.htmlp");

		// open url

		driver.navigate().to("file://C:/Users/admin/Desktop/sampletable.html");

		// find second cell in web table and prit data of second cell
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);

		// find total row in web table 
		List<WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));

		System.out.println("total no of rows : " + rowList.size());
       
		//find total column in web table
		List<WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));

		System.out.println("total no of column : " + columnList.size());
		
		for(int r=2; r<=rowList.size(); r++) {
			for(int c=1; c<=columnList.size(); c++) {
				
				String data = driver.findElement(By.xpath("//table/tbody/tr["+ r +"]/td["+ c +"]")).getText();
				System.out.println(data);
			}
		}
	}

}
