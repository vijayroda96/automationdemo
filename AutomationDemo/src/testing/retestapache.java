package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class retestapache {
	public static void main(String[] args) throws FileNotFoundException   {
	File file=new File("E:\\data.xlsx");
	
	String filePath="E:\\data.xlsx";
	String fileName="data.xlsx";
	
	FileInputStream inputStream= new FileInputStream(file);
	
	try {
		Workbook wb = new XSSFWorkbook(inputStream);
		String fileExtensionName = filePath.substring(fileName.indexOf("."));
		
		if(fileExtensionName.equals(".xlsx"))
		{
			wb = new XSSFWorkbook(inputStream);
		}
		else if(fileExtensionName.equals(".xls"))
		{
			wb = new HSSFWorkbook(inputStream);
		}
		Sheet sheet1= (Sheet) wb.getSheetAt(0);
		
		int rowCount = ( sheet1).getLastRowNum();
		
		for(int i=0;i<=rowCount;i++)
		{
			Row row=(sheet1).getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				System.out.print(row.getCell(j).getStringCellValue()+"||");
			}
			System.out.println();
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}

