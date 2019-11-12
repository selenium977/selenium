package com.amazon.elements.footer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterElements {
	
	
	@FindBy(xpath = "//span[@class='navFooterBackToTopText']")
	private WebElement BACKTOP; 			
	//CONOCENOS
	@FindBy(xpath = "//a[contains(@href, 'https://www.amazon.jobs')]")
	private WebElement AMAZONJOBS;
	@FindBy(xpath = "//a[contains(@href,'/gp/feature.html?ie=UTF8&docId=1001359011&ref_=footer_gw_m_b_corporate')]")
	private WebElement INFO;
	@FindBy(xpath = "//a[contains(@href,'http://www.amazon.com.mx:80/gp/redirect.html?_encoding=UTF8&location=http%3A%2F%2Fphx.corporate-ir.net%2Fphoenix.zhtml%3Fc%3D176060%26p%3Dirol-mediaKindle%26ref_%3Dfooter_press&source=standards&token=20199D390B4B99326228BACA356577F5C6D0F278')]")
	private WebElement PRESSDEPTH;
	//GANA DINERO CON NOSOTROS
	@FindBy(xpath = "//a[contains(@href,'/gp/redirect.html?_encoding=UTF8&location=https%3A%2F%2Fservices.amazon.com.mx%2Fservicios%2Fvender-en-amazon.html%3Fld%3DAZMXSOA-footer%26ref_%3Dfooter_sell&source=standards&token=A618BDDFC5B625AB8C672ECF85EE2C3687DBB648')]")
	private WebElement AMAZONSELL;
	@FindBy(xpath = "//a[contains(@href,'/gp/redirect.html?_encoding=UTF8&location=https%3A%2F%2Fservices.amazon.com.mx%2Fhandmade.htm%3Fld%3DAZMXHND-footer%26ref_%3Dfooter_sell&source=standards&token=8F4EBA7C011105F66C7F490436831B0EF2D3EAEA')]")
	private WebElement AMAZNSELLHAND;
	@FindBy(xpath = "//a[contains(@href,'https://kdp.amazon.com')]")
	private WebElement KINDLE;
	@FindBy(xpath = "//a[contains(@href,'/gp/redirect.html?_encoding=UTF18&location=https%3A%2F%2Fafiliados.amazon.com.mx%2F%3Fref_%3Dfooter_affliate&source=standards&token=3600FADFAE88A2F5846E33608370F246B5BC2F4A')]")
	private WebElement AFFILIATESPRO;
	@FindBy(xpath = "//a[contains(@href,'https://advertising.amazon.com.mx/?ref=footer_advtsing_mx')]")
	private WebElement PRODUCTSANNOUNCE;
	//PODEMOS AYUDARTE
	@FindBy(xpath = "//a[contains(@href,'/gp/css/returns/homepage.html?ie=UTF8&ref_=footer_hy_f_4')]")
	private WebElement RETURNREPLACE;
	@FindBy(xpath = "//a[contains(@href,'/gp/digital/fiona/manage?ie=UTF8&ref_=footer_myk')]")
	private WebElement CONTENTANDDEVICES;
	@FindBy(xpath = "//a[contains(@href,'/gp/help/customer/display.html?ie=UTF8&nodeId=508510&ref_=footer_gw_m_b_he')]")
	private WebElement HELP;
	@FindBy(xpath = "//a[contains(@href,'/gp/BIT/ref=footer_bit_v2_mx_0100?bitCampaignCode=MX0100')]")
	private WebElement AMAZONASSISTANT;
	//METODOS DE PAGO
	@FindBy(xpath = "//a[contains(@href,'/tc?_encoding=UTF8&ref_=footer_pay_tc')]")
	private WebElement CARDS;
	@FindBy(xpath = "//a[contains(@href,'/tr?_encoding=UTF8&ref_=footer_pay_gc')]")
	private WebElement GIFTCARDS;
	@FindBy(xpath = "//a[contains(@href,'/msi?_encoding=UTF8&ref_=footer_pay_ins')]")
	private WebElement MSI;
	@FindBy(xpath = "//a[contains(@href,'/b?ie=UTF8&node=17277672011&ref_=footer_amazoncash')]")
	private WebElement AMAZONCASH;
	@FindBy(xpath = "//a[contains(@href,'/recargablen?_encoding=UTF8&ref_=footer_amazonrecargable')]")
	private WebElement AMAZONRECHARGER;
	//COUNTRIES
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.com.au/ref=footer_au')]")
	private WebElement AUSTRALIA;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.de/ref=footer_de')]")
	private WebElement DEUTSCHLAND;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.com.br/ref=footer_br')]")
	private WebElement BRASIL;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.ca/ref=footer_ca')]")
	private WebElement CANADA;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.cn/ref=footer_cn')]")
	private WebElement CHINA;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.es/ref=footer_es')]")
	private WebElement SPAIN;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.com/ref=footer_us')]")
	private WebElement USA;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.fr/ref=footer_fr')]")
	private WebElement FRANCE;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.in/ref=footer_in')]")
	private WebElement INDIA;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.it/ref=footer_it')]")
	private WebElement ITALY;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.co.jp/ref=footer_jp')]")
	private WebElement JAPAN;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.nl/ref=footer_nl')]")
	private WebElement NETHERLANDS;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.co.uk/ref=footer_uk')]")
	private WebElement UK;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.sg/ref=footer_sg')]")
	private WebElement SINGAPUR;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.com.tr/ref=footer_tr')]")
	private WebElement TURKEY;
	//VARIOS
	@FindBy(xpath = "//a[contains(@href,'https://aws.amazon.com/es/what-is-cloud-computing/?sc_channel=EL&sc_campaign=MX_amazonfooter')]")
	private WebElement AWS;
	@FindBy(xpath = "//a[contains(@href, '/gp/help/customer/display.html?ie=UTF8&nodeId=508088&ref_=footer_cou')]")
	private WebElement USECONDITIONS;
	@FindBy(xpath = "//a[contains(@href, '/gp/help/customer/display.html?ie=UTF8&nodeId=468496&ref_=footer_privacy')]")
	private WebElement PRIVACY;
}
