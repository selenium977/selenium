package com.amazon.test.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {

	private static String baseURL = "https://amazon.com.mx";
	private static WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public WebDriver setUp() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
		
		
	}
	
	public void getDriver() {
		setUp();
	}
	
	public void close() {
		driver.close();
	}
	
	public void openUrl() {
		driver.get(baseURL);
	}
	
	public static boolean unClick(WebElement element) 
	{
		boolean isClicked = false;
		
		driver.findElement((By) element).click();
		isClicked = true;
		
		return isClicked;
		
		
	}
	
	public static boolean clickTry(WebElement element)
	{
		boolean isSelected = false;
		
		int tryNumber = 5;
		try 
		{
			while(!isSelected == true && !(tryNumber == 0))
			{
				isSelected = unClick(element);
				tryNumber--;					
				System.out.println(tryNumber);
			}
		
		
		
		
		return isSelected;
		}
		
		catch(Exception e){}
		return isSelected;
		
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
	
	
	
	public static void sendKeys(WebElement identifier, String keys) {
		Actions actions=new Actions(driver);
		actions.sendKeys(keys)
		.build()
		.perform();
	}
	
}
