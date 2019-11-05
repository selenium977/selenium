package com.amazon.testCases;

import com.amazon.elements.header.HeaderElements;
import com.amazon.test.config.Config;

public class CaseSearchProduct {

	public static void main(String[] args) {

		Config conf = new Config();
		HeaderElements element = new HeaderElements();
		conf.setUp();
		conf.implicitWait(6);
		
		conf.click(element.SearchBar);
		conf.implicitWait(4);
		conf.click(element.BACKTOP);
		
		//conf.close();
		
	}
}
