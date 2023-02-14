package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	
	public static String getdatafromexcel(String sheet,int row,int col) throws EncryptedDocumentException, IOException {
	
	String path = "C:\\Users\\omkar wagh\\OneDrive\\Desktop\\wagh.xlsx";	
	FileInputStream file = new FileInputStream(path);
	String Data = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
	return Data;
	}
	 
	public static List<Object>  getdatafromexcelint1(String sheet,int row,int col) throws EncryptedDocumentException, IOException {
		
		String path = "C:\\Users\\omkar wagh\\OneDrive\\Desktop\\wagh.xlsx";	
		
		FileInputStream file = new FileInputStream(path);
		
	    ArrayList <Object> array = new ArrayList<Object>(); //arraylist object creation
		
	     Sheet sheet2 = WorkbookFactory.create(file).getSheet(sheet);
         Row row1 = sheet2.getRow(row);
         Cell cell = row1.getCell(col);
		 
         if(cell.getCellType()==CellType.STRING)    //if String
         {
		 array.add(cell.getStringCellValue());
		 Object data = array.get(0);
		 System.out.println(data+",");		
		 }else
		 if(cell.getCellType()==CellType.NUMERIC)  //if Numeric
		 {
			 
		   double num=cell.getNumericCellValue();
		   int dota = (int)num;
		   array.add(dota);
		   Object data = array.get(0);
		   System.out.println(data+",");
//		 array.add(cell.getNumericCellValue());
//		 Object data = array.get(0);
//         System.out.println(data);
			 }
		return array;		
		}
	// screenshot 
	
	public static void getscreenshot(WebDriver driver,int Testid) throws IOException {
		TakesScreenshot ss = ((TakesScreenshot)driver);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\TakeScreenShot\\Omkar"+Testid+".jpg");
		FileHandler.copy(src, dest);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
