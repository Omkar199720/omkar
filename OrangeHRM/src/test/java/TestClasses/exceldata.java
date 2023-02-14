package TestClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldata {

	public static Double getdatafromexcelint(String sheet,int row,int col) throws EncryptedDocumentException, IOException {
		
		String path = "C:\\Users\\omkar wagh\\OneDrive\\Desktop\\wagh.xlsx";	
		FileInputStream file = new FileInputStream(path);
		Double Data = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(col).getNumericCellValue();	
	    String Data1= String.valueOf(Data);
		return Data;
		}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		Double data1= exceldata.getdatafromexcelint("Sheet3", 1, 4);
		System.out.println(data1);
	}

}
