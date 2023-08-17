package excelPrograms_Read;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmployeeSampleData 
{
	public static void main(String[] args) throws Exception 
	{
		File xlfile = new File("C:\\Excel_ApachePOI_Sheets\\Employee Sample Data.xlsx");
		FileInputStream fis = new FileInputStream(xlfile);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (Row row : sheet)
		{
			for (Cell cell : row)
			{
				switch (cell.getCellType())
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
