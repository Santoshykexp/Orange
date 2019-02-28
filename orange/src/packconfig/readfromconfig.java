package packconfig;

import java.io.*;
import java.util.Properties;

public class readfromconfig {
	public void read() throws IOException {
		String path = "C:/Users/ionassessment/git/Orange/orange/data/config.properties";
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		String t = prop.getProperty("time");
		System.out.println(t);
		
		
	}
	public static void main(String[] args) throws IOException {
		readfromconfig conf=new readfromconfig();
		conf.read();
		
		
		
	}

}
