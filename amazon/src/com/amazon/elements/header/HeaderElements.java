package com.amazon.elements.header;

import java.awt.Dimension;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderElements {

	public static final By LogoAmazon				=By.xpath("//a[@aria-label='Amazon.com.mx']");
	public static final By Menu						=By.xpath("//a[@id='nav-hamburger-menu']");
	public static final By AllDepartments			=By.xpath("//select[@aria-describedby='searchDropdownDescription']");
	public static final By SearchBar				=By.xpath("//input[@id='twotabsearchtextbox']");
	public static final By SearchButton				=By.xpath("//input[@value='Ir']");
	public static final By SignInYourAccount		=By.xpath("//a[@data-nav-ref='nav_ya_signin']");
	public static final By AmazonPrime				=By.xpath("//a[@id='nav-link-prime']");
	public static final By GoToCart					=By.xpath("//a[@id='nav-cart']");
	public static final By ChooseAddress			=By.xpath("//a[@tabindex='35']");
	public static final By Promotions				=By.xpath("//a[@tabindex='47']");
	public static final By Outlet					=By.xpath("//a[@tabindex='48']");
	public static final By AmazonBasics				=By.xpath("//a[@tabindex='49']");
	public static final By BestSellers				=By.xpath("//a[@tabindex='50']");
	public static final By BestGifts				=By.xpath("//a[@tabindex='51']");
	public static final By News                 	=By.xpath("//a[@tabindex='52']");
	public static final By TopDynamicSlogan			=By.xpath("//div[@id='nav-swmslot']");
	
	public static final By IdentifyYourself			=By.xpath("(//span[text()='Identificarse'])[0]");
	public static final By StartHere				=By.xpath("(//a[@class='nav-a'])[0]");
	
	public static final By Lists					=By.xpath("//div[text()='Listas']");
	public static final By CreateWishList			=By.xpath("//span[text()='Crear una Wish List']");
	public static final By CreateBabyGiftTable		=By.xpath("//span[text()='Crear una Mesa de Regalos de Bebé']");
	public static final By CreateWeddingGiftTable	=By.xpath("//span[text()='Crear una Mesa de Regalos de Boda']");
	
	public static final By MyAccountTop				=By.xpath("//div[text()='Mi cuenta']");
	public static final By MyAccount				=By.xpath("//span[text()='Mi cuenta']");
	public static final By MyOrders					=By.xpath("//span[text()='Mis pedidos']");
	public static final By MyRecommendations		=By.xpath("//span[text()='Mis recomendaciones']");
	public static final By MyPrimeMembership		=By.xpath("//span[text()='Mi membresía Prime']");
	public static final By MyPlanAndSave			=By.xpath("//span[text()='Mi Planea y Ahorra']");
	public static final By MembershipsAndSubs		=By.xpath("//span[text()='Membresías y suscripciones']");
	public static final By MyPets					=By.xpath("//span[text()='Mis mascotas']");
	public static final By KindleContent			=By.xpath("//span[text()='Mi contenido Kindle']");
	public static final By AmazonMusic				=By.xpath("//span[text()='Mi Amazon Music']");
	public static final By PrimeVideo				=By.xpath("//span[text()='Mi Prime Video']");	

	
	public static final By UnlimitedDelivery		=By.xpath("//a[text()='Envíos ilimitados']");
	public static final By NoMinimunPurchase		=By.xpath("//a[text()='Envíos sin mínimo de compra ']");
	public static final By PrimeVideoBottom			=By.xpath("//a[text()='Prime Video']");
	
	public static final By TryAmazonPrime			=By.xpath("(//input[@type='submit'])[1]");
	public static final By AmazonPrimelogo			=By.xpath("//div[@class='nav-npm-prime-logo']");
}
