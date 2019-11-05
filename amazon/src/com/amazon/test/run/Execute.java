package com.amazon.test.run;

import com.amazon.elements.footer.FooterElements;
import com.amazon.test.config.Config;

public class Execute {

	public static void main(String[] args) {

		Config conf = new Config();
		FooterElements element = new FooterElements();
		conf.setUp();
		conf.implicitWait(6);
		//conf.scrollToElement(element.CONDITIONS);
		conf.implicitWait(4);
		conf.click(element.BACKTOP);
		
		//conf.close();
		
	}

}
