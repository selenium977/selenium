package com.amazon.test.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {

	private static String baseURL = "https://amazon.com.mx";
	private static WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		
	}
	
	public void close() {
		driver.close();
	}
	
	public void click(By identifier) {
		
		driver.findElement(identifier).click();
		
	}
	
	public void scrollToElement(By identifier) {
		
		
		WebElement element = driver.findElement(identifier);
		
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
	
	public void implicitWait(int time) {
		
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	public static void sleeper(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void sendKeys(By identifier, String keys) {
		driver.findElement(identifier).sendKeys(keys);
	}
	
	
}
