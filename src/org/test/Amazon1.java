package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day7\\Driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.amazon.in/");
		a.manage().window().maximize();
		
		WebElement b = a.findElement(By.id("twotabsearchtextbox"));
		b.sendKeys("Motorola");
		
		WebElement c = a.findElement(By.xpath("//input[@tabindex='10']"));
		c.click();
		
		Thread.sleep(5000);
		WebElement d = a.findElement(By.xpath("//span[text()='Motorola G7 Power (Black, 4GB RAM, 64GB Storage)']"));
		
		d.click();
		
		//TakesScreenshot tk=(TakesScreenshot)a;
		
		//File e=tk.getScreenshotAs(OutputType.FILE);
		
		//File n=new File("E:\\7.jpeg");
		//FileUtils.copyFile(e, n);
		//System.out.println(n);
	}
}
