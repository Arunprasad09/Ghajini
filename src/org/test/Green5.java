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

public class Green5 {
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day7\\Driver\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("http://www.greenstechnologies.in/selenium-training.php");
	a.manage().window().maximize();
    
	JavascriptExecutor js = (JavascriptExecutor)a;
	WebElement b = a.findElement(By.xpath("//h1[contains(text(), 'RECENT JOB OPENINGS')]"));
	js.executeScript("arguments[0].scrollIntoView(true)", b);
	
	TakesScreenshot tk=((TakesScreenshot)a);
	File c = tk.getScreenshotAs(OutputType.FILE);
	
	File d=new File("E:\\5.jpeg");
    FileUtils.copyFile(c, d);
    System.out.println(c);
		
}

}