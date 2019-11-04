package com.amazon.test.run;

import com.amazon.test.config.Config;

public class Execute {

	public static void main(String[] args) {

		Config conf = new Config();
		
		conf.setUp();
		conf.close();
		
	}

}
