package excelPrograms_Read;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmployeeDataRead2 
{

	public static void main(String[] args) throws IOException 
	{
		String filePath = "C:\\Excel_ApachePOI_Sheets\\employee_TestData.xlsx";

		FileInputStream fis = new FileInputStream(new File(filePath));
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
			
		for(Row row : sheet)
		{
			for(Cell cell : row)
			{
				switch(cell.getCellType())
				{
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" | ");
			}
			System.out.println();
			
		}
		
		
		
		
		

	}
}
