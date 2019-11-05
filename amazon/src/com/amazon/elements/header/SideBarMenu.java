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
		//Musica en Streaming
	private static final By PrimeMusic			=By.xpath("//*[@id=\"hmenu-content\"]/ul[3]/li[3]/a");
	private static final By UnlimitedMusic		=By.xpath("//*[@id=\"hmenu-content\"]/ul[3]/li[4]/a");
	private static final By ReproductorWeb		=By.xpath("//*[@id=\"hmenu-content\"]/ul[3]/li[5]/a");
	private static final By MusicApp			=By.xpath("//*[@id=\"hmenu-content\"]/ul[3]/li[6]/a");
		//Comprar Musica
	private static final By CDsVinilos			=By.xpath("//*[@id=\"hmenu-content\"]/ul[3]/li[9]/a");
	
	//AmazonFireTV
	private static final By TVStickBasic		=By.xpath("//*[@id=\"hmenu-content\"]/ul[4]/li[3]/a");
	private static final By APrimeVideo			=By.xpath("//*[@id=\"hmenu-content\"]/ul[4]/li[4]/a");
	
	//EreadersEbook Kindle
		//Ereaders
	private static final By Kindle				=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[3]/a");
	private static final By PaperWhite			=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[4]/a");
	private static final By Oasis 				=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[5]/a");
	private static final By Accesorios 			=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[6]/a");
		//Tienda Kindle 
	private static final By EbooKindle			=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[9]/a");
	private static final By Ulimited			=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[10]/a");
	private static final By Flash 				=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[11]/a");
		//Apps y Recursos 
	private static final By LecturaFree			=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[14]/a");
	private static final By CloudReader			=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[15]/a");
	private static final By DispoContenido		=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[16]/a");
	private static final By Todotienda			=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[17]/a");

	//AlimentosBebidas
	private static final By Alimentos			=By.xpath("//*[@id=\"hmenu-content\"]/ul[6]/li[3]/a");
	private static final By VinosLicores		=By.xpath("//*[@id=\"hmenu-content\"]/ul[6]/li[4]/a");
	
	//Libros
	private static final By Ingles				=By.xpath("//*[@id=\"hmenu-content\"]/ul[7]/li[3]/a");
	private static final By InfantilJuvenil		=By.xpath("//*[@id=\"hmenu-content\"]/ul[7]/li[4]/a");
	private static final By Literaturaficcion	=By.xpath("//*[@id=\"hmenu-content\"]/ul[7]/li[5]/a");
	private static final By LibrosTexto			=By.xpath("//*[@id=\"hmenu-content\"]/ul[7]/li[6]/a");
	private static final By ProfesionalTec		=By.xpath("//*[@id=\"hmenu-content\"]/ul[7]/li[7]/a");
	private static final By Fantasia			=By.xpath("//*[@id=\"hmenu-content\"]/ul[7]/li[8]/a");
	private static final By Romance				=By.xpath("//*[@id=\"hmenu-content\"]/ul[7]/li[9]/a");
	private static final By EKinlde				=By.xpath("//*[@id=\"hmenu-content\"]/ul[7]/li[10]/a");
	private static final By TodoLibros			=By.xpath("//*[@id=\"hmenu-content\"]/ul[7]/li[11]/a");
	
	//PelisSeriesTVMusic
		//Peliculas y Series
	private static final By Peliculas			=By.xpath("//*[@id=\"hmenu-content\"]/ul[8]/li[3]/a");
	private static final By SeriesTV			=By.xpath("//*[@id=\"hmenu-content\"]/ul[8]/li[4]/a");
	private static final By TodoPelSeri			=By.xpath("//*[@id=\"hmenu-content\"]/ul[8]/li[5]/a");
		//Musica
	private static final By CDVinilos			=By.xpath("//*[@id=\"hmenu-content\"]/ul[8]/li[8]/a");
	private static final By PMusic				=By.xpath("//*[@id=\"hmenu-content\"]/ul[8]/li[9]/a");
	private static final By MusicUnlimited		=By.xpath("//*[@id=\"hmenu-content\"]/ul[8]/li[10]/a");

	//Electronicos
	private static final By TVVideo				=By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[3]/a");
	private static final By AudioSonido			=By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[4]/a");
	private static final By Celulares			=By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[5]/a");
	private static final By CamaraFotos			=By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[6]/a");
	private static final By OficinaPapeleria	=By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[7]/a");
	private static final By InstrumentMusical	=By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[8]/a");
	private static final By NavegacionGPS		=By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[9]/a");
	private static final By AccesoriosEln		=By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[10]/a");
	private static final By TodoLEln			=By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[11]/a");
	
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
