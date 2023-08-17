package excelPrograms_Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Products {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Excel_ApachePOI_Sheets\\TestCase_14Aug.xlsx");
		FileInputStream fis = new FileInputStream(file);
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
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				default:
					break;
				}
				System.out.print("  |  " );
			}
			System.out.println();

		}

	}
}
