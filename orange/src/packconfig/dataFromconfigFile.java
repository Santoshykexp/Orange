package packconfig;

import java.io.*;
import java.util.Properties;

public class dataFromconfigFile {
	
	public void readData() throws IOException {
		String path = "C:/Users/ionassessment/git/Orange/orange/data/config.properties";
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		String appURL = prop.getProperty("url");
		System.out.println(appURL);
		
	}
	
	public static void main(String[] args) throws IOException {
		dataFromconfigFile conf=new dataFromconfigFile();
		conf.readData();
	}

}
