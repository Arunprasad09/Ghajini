package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day7\\Driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("http://www.greenstechnologys.com/");
		a.manage().window().maximize();
		
		TakesScreenshot a1=((TakesScreenshot)a);
		File s=a1.getScreenshotAs(OutputType.FILE);
		
		File n=new File("E:\\1.png");
		FileUtils.copyFile(s, n);
		System.out.println(s);
		
	}
}
