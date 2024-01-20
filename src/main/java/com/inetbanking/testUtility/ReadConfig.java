package com.inetbanking.testUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	public Properties prop;

	public ReadConfig() {

		File src = new File(System.getProperty("user.dir") + "\\configuration\\config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Exception is " + e.getMessage());
		}

	}

}
