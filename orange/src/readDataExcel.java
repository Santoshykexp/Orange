import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readDataExcel {
	
	public void read() throws IOException {
		String path = "C:/Users/ionassessment/git/Orange/orange/data/inputdata.xlsx";
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("sheet1");
		String username = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		
		
	}
	
	public static void main(String[] args) throws IOException {
		readDataExcel rd=new readDataExcel();
		rd.read();
	}

}
