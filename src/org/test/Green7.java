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

public class Green7 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day7\\Driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("http://www.greenstechnologies.in/selenium-training.php");
		a.manage().window().maximize();
	    
		JavascriptExecutor js = (JavascriptExecutor)a;
		
		WebElement b = a.findElement(By.xpath("//a[text()='HTC Global Services']"));
		b.click();
		
		
		js.executeScript("arguments[0].scrollIntoView(true)",b);
		
		WebElement c = a.findElement(By.xpath("//embed[@src='http://greenstech.in/interview-questions/HTC%20global%20services.pdf#toolbar=0']"));
		js.executeScript("arguments[0].scrollIntoView(true)",c);
		TakesScreenshot a1=((TakesScreenshot)a);
		File s=a1.getScreenshotAs(OutputType.FILE);
		
		File n=new File("E:\\2.png");
		FileUtils.copyFile(s, n);
		System.out.println(s);
		
	
}
}