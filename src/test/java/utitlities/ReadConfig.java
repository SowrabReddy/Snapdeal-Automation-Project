package utitlities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties property;

	public ReadConfig() {
		File src = new File("./resources/InputData.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			property = new Properties();
			property.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getApplicationUrl() {
		String Url = property.getProperty("url");
		return Url;
	}

	public String MobileNumber() {
		String mobilenumber = property.getProperty("MobileNumber");
		return mobilenumber;
	}

	public String Password() {
		String password = property.getProperty("Password");
		return password;
	}
	public String getChromeDriverPath() {
		String chromePath=property.getProperty("chromeDriverpath");
		return chromePath;
	}
	public String getFireFoxDriverPath() {
		String fireFoxPath=property.getProperty("firefoxDriverpath");
		return fireFoxPath;
	}
	public String getKeyValue() {
		String key=property.getProperty("Key");
		return key;
	}
	
	public String getSearchData() {
		String searchData=property.getProperty("SearchData");
		return searchData;
	}
}
