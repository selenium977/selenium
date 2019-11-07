package com.amazon.elements.header;

import java.awt.Dimension;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.test.config.Config;

public class SideBarMenu {
	
	@FindBy(xpath="//a[@id='nav-hamburger-menu']") 
	private WebElement Menu;
	
	//Categorias
	@FindBy(xpath="//a[@data-menu-id") 
	private List<WebElement> categoria;
	
	//Subcategorias
	//**Dentro de estos xpath se encuentra tambien "Todas las categorias", Ayuda y Mi Cuenta. 
	@FindBy(xpath="//*[@id=\\\"hmenu-content\\\"]") 
	private List<WebElement> subCategorias;
	
	
	public SideBarMenu ()
	{
	}
	
	
}
