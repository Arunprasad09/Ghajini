package org.test;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart9 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day7\\Driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.flipkart.com/");
		a.manage().window().maximize();
		
	    WebElement btn = a.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	    btn.click();
	    
		WebElement b = a.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		b.sendKeys("Iphone");
		
		WebElement c = a.findElement(By.xpath("//button[@type='submit']"));
		c.click();
		Thread.sleep(3000);
       WebElement d = a.findElement(By.xpath("//div[text()='Apple iPhone 8 (Space Grey, 64 GB)']"));
       d.click();
       Thread.sleep(7000);
       TakesScreenshot tk=(TakesScreenshot)a;
		File f=tk.getScreenshotAs(OutputType.FILE);
		File f1=new File("E:\\6.jpeg");
		FileUtils.copyFile(f, f1);
		System.out.println(f1);
	}
}
