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
		System.out.println("Before clicking the element");
		conf.daClick(element.getPromotions());
		System.out.println("After clicking the element");
		
	}

}
