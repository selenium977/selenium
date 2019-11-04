package com.amazon.test.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {

	private static String baseURL = "https://google.com.mx";//comentario
	private static WebDriver driver;
	
	
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
	}
	
	public void close() {
		driver.close();
	}
	
	
}
