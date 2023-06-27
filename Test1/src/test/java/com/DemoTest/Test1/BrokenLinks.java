package com.DemoTest.Test1;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.deadlinkcity.com/");
		List<WebElement> allelements = driver.findElements(By.tagName("a"));
		System.out.println("all links size is " + allelements.size());
		int rescode = 200; //
		int brokenlinkcnt = 0;
		for (WebElement el : allelements) {

			String links = el.getAttribute("href");
		
			try {
				URL url = new URL(links);

				HttpURLConnection htc = (HttpURLConnection) url.openConnection();
				htc.setRequestMethod("HEAD");
				htc.connect();
				rescode = htc.getResponseCode();
				if (rescode >= 400) {
					System.out.println(url + "broken links");
					brokenlinkcnt++;
				}
			} catch ( MalformedURLException e) {
				// TODO: handle exception
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		//	System.out.println("Total broken links is "+brokenlinkcnt);
		}
		System.out.println("Total broken links is "+brokenlinkcnt);
	}

}
