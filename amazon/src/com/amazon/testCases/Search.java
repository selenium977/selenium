package com.amazon.testCases;

import com.amazon.elements.header.HeaderElements;
import com.amazon.test.config.Config;

public class Search {

	public static Config conf = new Config();
	public static HeaderElements search = new HeaderElements();
	
	public static void main(String[] args) {
		
		
		conf.getDriver();
		conf.openUrl();
		conf.implicitWait(5);
		System.out.println("antes del click");
		search.searchProduct("pokemon");
		System.out.println("después del click");
	}

	
	
	
}
