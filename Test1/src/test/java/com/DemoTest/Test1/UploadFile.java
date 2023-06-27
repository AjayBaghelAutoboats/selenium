package com.DemoTest.Test1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/upload-download");  
		
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\admin\\Desktop\\Ali.txt");
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		// copy file to clipboard 
		StringSelection ss = new StringSelection("C:\\Users\\admin\\Desktop\\Ali.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		
		// perforn control v action to paste file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}
