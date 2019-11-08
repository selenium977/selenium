package com.amazon.test.run;


import com.amazon.elements.header.HeaderElements;
import com.amazon.test.config.Config;

public class Execute {
	
	public static Config conf = new Config();
	public static HeaderElements element = new HeaderElements(); 

	public static void main(String[] args) {

		
		conf.getDriver();
		conf.openUrl();
		conf.implicitWait(5);
		conf.clickTry(element.Menu);
		System.out.println("El Tellez se la come doblada");
		conf.close();
		
	}

}
