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


public class SideBarMenu {
	
	private static final By Menu				=By.xpath("//a[@id='nav-hamburger-menu']");
	
	//***COMPRAR POR CATEGORIA*** 
	private static final By AmazonPrimeVideo  	=By.xpath("//a[@data-menu-id = '2']");
	private static final By EchoYAlexa    		=By.xpath("//a[@data-menu-id = '3']");
	private static final By AmazonMusic 		=By.xpath("//a[@data-menu-id = '4']");
	private static final By AmazonFireTV   		=By.xpath("//a[@data-menu-id = '5']");
	private static final By EreadersEbookKindle =By.xpath("//a[@data-menu-id = '6']");
	private static final By AlimentosBebidas 	=By.xpath("//a[@data-menu-id = '7']");
	private static final By Libros				=By.xpath("//a[@data-menu-id = '8']");
	private static final By PelisSeriesTVMusic 	=By.xpath("//a[@data-menu-id = '9']");
	private static final By Electronicos 		=By.xpath("//a[@data-menu-id = '10']");
	private static final By ComputoTablets		=By.xpath("//a[@data-menu-id = '11']");
	private static final By Software			=By.xpath("//a[@data-menu-id = '12']");
	private static final By Videojuegos 		=By.xpath("//a[@data-menu-id = '13']");
	private static final By HogarCocina			=By.xpath("//a[@data-menu-id = '14']");
	private static final By HerramientasHogar	=By.xpath("//a[@data-menu-id = '15']");
	private static final By AutomotrizMotos		=By.xpath("//a[@data-menu-id = '16']");
	private static final By JuegosJuguetes		=By.xpath("//a[@data-menu-id = '17']");
	private static final By MascotasAccesorios	=By.xpath("//a[@data-menu-id = '18']");
	private static final By Bebe				=By.xpath("//a[@data-menu-id = '19']");
	private static final By RopaYAccesorios		=By.xpath("//a[@data-menu-id = '20']");
	private static final By Handmade			=By.xpath("//a[@data-menu-id = '21']");
	private static final By DeportesAireLibre	=By.xpath("//a[@data-menu-id = '22']");
	private static final By SaludCuidadoPerso	=By.xpath("//a[@data-menu-id = '23']");
	private static final By IndustEmpreCiencia	=By.xpath("//a[@data-menu-id = '24']");
	private static final By TodasCategorias		=By.xpath("//*[@id=\"hmenu-content\"]/ul[24]/li[25]/a");
	
	//AmazonPrimeVideo 
	private static final By TodoslosVideos		=By.xpath("//*[@id='hmenu-content']/ul[1]/li[3]/a");
	private static final By PrimeChannels		=By.xpath("//*[@id='hmenu-content']/ul[1]/li[4]/a");
	private static final By VerCualquierLug		=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[5]/a");
		//Amazon Original 
	private static final By DeViajeDerbez		=By.xpath("//*[@id='hmenu-content']/ul[1]/li[8]/a");
	private static final By TomClancysRyan		=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[9]/a");
	private static final By EljuegoLlaves		=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[10]/a");
	private static final By ModernLove			=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[11]/a");
	private static final By LOL					=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[12]/a");

	//EchoYAlexa
	private static final By Echo 				=By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[3]/a");
	private static final By Echoplus			=By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[4]/a");
	private static final By EchoDot				=By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[5]/a");
	private static final By EchoSpot			=By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[6]/a");
		//Casa inteligente de alexa
	private static final By SmartPlug			=By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[9]/a");
	private static final By CasaSmart			=By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[10]/a");
		//Contenido y recursos
	private static final By AppAlexa			=By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[13]/a");
	private static final By TodasSkills			=By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[14]/a");
	private static final By Musica				=By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[15]/a");
	
	//AmazonMusics
	
	//AmazonFireTV
	//EreadersEbook Kindle
	//AlimentosBebidas
	//Libros
	//PelisSeriesTVMusic
	//Electronicos
	//ComputoTablets
	//Software
	//Videojuegos
	//HogarCocina
	//HerramientasHogar
	//AutomotrizMotos
	//JuegosJuguetes
	//RopaZapatosAccesorios
	//Handmade
	//DeportesaireLibre
	//SaludCuidadoPersonal 
	//IndustriaCienciaEmpresas
	//TodasCategorias
	
	//***AYUDA Y CONFIGURACIÓN*** 
	private static final By MiCuenta			=By.xpath("//*[@id=\"hmenu-content\"]/ul[24]/li[28]/a");
	private static final By Ayuda				=By.xpath("//*[@id=\"hmenu-content\"]/ul[24]/li[29]/a");
	private static final By Identificarse		=By.xpath("//*[@id=\"hmenu-content\"]/ul[24]/li[30]/a");
	
}
