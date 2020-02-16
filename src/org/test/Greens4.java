package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens4 {
    public static void main(String[] args) throws IOException, InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day7\\Driver\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("http://www.greenstechnologys.com/");
	a.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)a;
	Thread.sleep(3000);
	   WebElement scrolldown = a.findElement(By.xpath("//h2[contains(text(),'Greens Technologys Overall Reviews')]"));
	   js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
	   
	   TakesScreenshot a1=((TakesScreenshot)a);
		File s=a1.getScreenshotAs(OutputType.FILE);
		
		File n=new File("E:\\4.png");
		FileUtils.copyFile(s, n);
		System.out.println(s);
	   
    }
	
}
