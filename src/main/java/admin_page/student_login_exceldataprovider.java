package admin_page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class student_login_exceldataprovider 

{
	@DataProvider(name="LoginData", parallel=true)
	public Object[][] TestData() throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\selenium files\\Dataprovider_Book1.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int rowIndex=sh.getLastRowNum();
		int cellIndex=sh.getRow(0).getLastCellNum()-1;
		
		Object [][] obj = new Object [rowIndex+1][cellIndex+1];
		for(int i=0; i<=rowIndex; i++)
		{
			for(int j=0; j<=cellIndex; j++)
			{
				Cell cellInfo = sh.getRow(i).getCell(j);
				CellType clType = cellInfo.getCellType();
				
				if(clType==CellType.STRING)
				{
					obj [i][j]=cellInfo.getStringCellValue();
				}
				else if(clType==CellType.NUMERIC)
				{
					obj [i][j]=cellInfo.getNumericCellValue();
				}
				
			}
			
		}
		return obj; 
	}
	
}


