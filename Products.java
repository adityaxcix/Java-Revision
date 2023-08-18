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
        File file = new File("C:\\Excel_ApachePOI_Sheets\\SaleData.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                String cellValue = "";
                switch (cell.getCellType()) {
                    case NUMERIC:
                        cellValue = String.valueOf(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        cellValue = String.valueOf(cell.getBooleanCellValue());
                        break;
                    case STRING:
                        cellValue = cell.getStringCellValue();
                        break;
                    default:
                        break;
                }
                // Adjust the desired column width and spacing here
                System.out.print(padRight(cellValue, 20) + " | ");
            }
            System.out.println();
        }

        fis.close();
        wb.close();
    }

    // Function to pad the string to the right with spaces to achieve alignment
    public static String padRight(String input, int length) {
    	
        StringBuilder sb = new StringBuilder(input);
        while (sb.length() < length) 
        {
            sb.append(" ");
        }
        return sb.toString();
    }
}
