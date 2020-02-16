package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsSqa2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day7\\Driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.toolsqa.com/");
		a.manage().window().maximize();
		
		WebElement c = a.findElement(By.xpath("//a[text()='ACCEPT']"));
		c.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)a;
		WebElement b = a.findElement(By.xpath("//a[@href='http://toolsqa.com/selenium-training/']"));
		js.executeScript("arguments[0].scrollIntoView(true)",b);
		
		WebElement s= a.findElement(By.xpath("(//span[text()='Selenium Training'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(false)",s);
	}
}
