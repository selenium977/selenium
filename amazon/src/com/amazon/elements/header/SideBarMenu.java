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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SideBarMenu {
	
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	private WebElement Menu;
	
	 List <WebElement> Element = drivers.findElements(By.cssSelector(""));
	
	//***COMPRAR POR CATEGORIA*** 
	@FindBy(xpath="//a[@data-menu-id = '2']")
	private WebElement AmazonPrimeVideo;
	@FindBy(xpath="//a[@data-menu-id = '3']")
	private WebElement EchoYAlexa;
	@FindBy(xpath="//a[@data-menu-id = '4']")
	private WebElement AmazonMusic;
	@FindBy(xpath="//a[@data-menu-id = '5']")
	private WebElement AmazonFireTV;
	@FindBy(xpath="//a[@data-menu-id = '6']")
	private WebElement EreadersEbookKindle;
	@FindBy(xpath="//a[@data-menu-id = '7']")
	private WebElement AlimentosBebidas;
	@FindBy(xpath="//a[@data-menu-id = '8']")
	private WebElement Libros;
	@FindBy(xpath="//a[@data-menu-id = '9']")
	private WebElement PelisSeriesTVMusic;
	@FindBy(xpath="//a[@data-menu-id = '10']")
	private WebElement Electronicos;
	@FindBy(xpath="//a[@data-menu-id = '11']")
	private WebElement ComputoTablets;
	@FindBy(xpath="//a[@data-menu-id = '12']")
	private WebElement Software;
	@FindBy(xpath="//a[@data-menu-id = '13']")
	private WebElement Videojuegos;
	@FindBy(xpath="//a[@data-menu-id = '14']")
	private WebElement HogarCocina;
	@FindBy(xpath="//a[@data-menu-id = '15']")
	private WebElement HerramientasHogar;
	@FindBy(xpath="//a[@data-menu-id = '16']")
	private WebElement AutomotrizMotos;
	@FindBy(xpath="//a[@data-menu-id = '17']")
	private WebElement JuegosJuguetes;
	@FindBy(xpath="//a[@data-menu-id = '18']")
	private WebElement MascotasAccesorios;
	@FindBy(xpath="//a[@data-menu-id = '19']")
	private WebElement Bebe;
	@FindBy(xpath="//a[@data-menu-id = '20']")
	private WebElement RopaYAccesorios;
	@FindBy(xpath="//a[@data-menu-id = '21']")
	private WebElement Handmade;
	@FindBy(xpath="//a[@data-menu-id = '22']")
	private WebElement DeportesAireLibre;
	@FindBy(xpath="//a[@data-menu-id = '23']")
	private WebElement SaludCuidadoPerso;
	@FindBy(xpath="//a[@data-menu-id = '24']")
	private WebElement IndustEmpreCiencia;
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[24]/li[25]/a")
	private WebElement TodasCategorias;
	
	//AmazonPrimeVideo 
	@FindBy(xpath="(\"//a[@class='hmenu-item']\")[0]")
	private WebElement TodoslosVideos;
	@FindBy(xpath="(\"//a[@class='hmenu-item']\")[1]")
	private WebElement PrimeChannels;
	@FindBy(xpath="(\"//a[@class='hmenu-item']\")[2]")
	private WebElement VerCualquierLug;
		//Amazon Original 
	@FindBy(xpath="(\"//a[@class='hmenu-item']\")[3]")
	private WebElement DeViajeDerbez;
	@FindBy(xpath="(\"//a[@class='hmenu-item']\")[4]")
	private WebElement TomClancysRyan;
	@FindBy(xpath="(\"//a[@class='hmenu-item']\")[5]")
	private WebElement EljuegoLlaves;
	@FindBy(xpath="(\"//a[@class='hmenu-item']\")[6]")
	private WebElement ModernLove;
	@FindBy(xpath="(\"//a[@class='hmenu-item']\")[7]")
	private WebElement LOL;

	/*EchoYAlexa
	private WebElement Echo 				@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[3]/a");
	private WebElement Echoplus			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[4]/a");
	private WebElement EchoDot				@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[5]/a");
	private WebElement EchoSpot			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[6]/a");
		//Casa inteligente de alexa
	private WebElement SmartPlug			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[9]/a");
	private WebElement CasaSmart			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[10]/a");
		//Contenido y recursos
	private WebElement AppAlexa			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[13]/a");
	private WebElement TodasSkills			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[14]/a");
	private WebElement Musica				@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[15]/a");
	
	//AmazonMusics
		//Musica en Streaming
	private WebElement PrimeMusic			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[3]/a");
	private WebElement UnlimitedMusic		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[4]/a");
	private WebElement ReproductorWeb		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[5]/a");
	private WebElement MusicApp			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[6]/a");
		//Comprar Musica
	private WebElement CDsVinilos			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[9]/a");
	
	//AmazonFireTV
	private WebElement TVStickBasic		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[3]/a");
	private WebElement APrimeVideo			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[4]/a");
	
	//EreadersEbook Kindle
		//Ereaders
	private WebElement Kindle				@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[3]/a");
	private WebElement PaperWhite			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[4]/a");
	private WebElement Oasis 				@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[5]/a");
	private WebElement Accesorios 			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[6]/a");
		//Tienda Kindle 
	private WebElement EbooKindle			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[9]/a");
	private WebElement Ulimited			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[10]/a");
	private WebElement Flash 				@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[11]/a");
		//Apps y Recursos 
	private WebElement LecturaFree			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[14]/a");
	private WebElement CloudReader			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[15]/a");
	private WebElement DispoContenido		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[16]/a");
	private WebElement Todotienda			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[17]/a");

	//AlimentosBebidas
	private WebElement Alimentos			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[6]/li[3]/a");
	private WebElement VinosLicores		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[6]/li[4]/a");
	
	//Libros
	private WebElement Ingles				@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[3]/a");
	private WebElement InfantilJuvenil		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[4]/a");
	private WebElement Literaturaficcion	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[5]/a");
	private WebElement LibrosTexto			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[6]/a");
	private WebElement ProfesionalTec		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[7]/a");
	private WebElement Fantasia			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[8]/a");
	private WebElement Romance				@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[9]/a");
	private WebElement EKinlde				@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[10]/a");
	private WebElement TodoLibros			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[11]/a");
	
	//PelisSeriesTVMusic
		//Peliculas y Series
	private WebElement Peliculas			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[3]/a");
	private WebElement SeriesTV			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[4]/a");
	private WebElement TodoPelSeri			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[5]/a");
		//Musica
	private WebElement CDVinilos			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[8]/a");
	private WebElement PMusic				@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[9]/a");
	private WebElement MusicUnlimited		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[10]/a");

	//Electronicos
	private WebElement TVVideo				@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[3]/a");
	private WebElement AudioSonido			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[4]/a");
	private WebElement Celulares			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[5]/a");
	private WebElement CamaraFotos			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[6]/a");
	private WebElement OficinaPapeleria	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[7]/a");
	private WebElement InstrumentMusical	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[8]/a");
	private WebElement NavegacionGPS		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[9]/a");
	private WebElement AccesoriosEln		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[10]/a");
	private WebElement TodoLEln			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[11]/a");
	
	//ComputoTablets
	private WebElement Laptops				@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[3]/a");
	private WebElement Tablets 			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[4]/a");
	private WebElement Computadoras		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[5]/a");
	private WebElement Monitores			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[6]/a");
	private WebElement Componentes			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[7]/a");
	/*private WebElement Almacenamiento 		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[8]/a");
	private WebElement DispositivoRedes	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[9]/a");
	private WebElement SW					@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[10]/a");
	private WebElement Accesories			@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[11]/a");
	private WebElement TodoCompTablets		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[11]/a");*/
	
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
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[24]/li[28]/a")
	private WebElement MiCuenta;
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[24]/li[29]/a")
	private WebElement Ayuda;
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[24]/li[30]/a")
	private WebElement Identificarse;
	
	public SideBarMenu ()
	{
		
	}
	
	
}
