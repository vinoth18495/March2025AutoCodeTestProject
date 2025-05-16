package Selenium;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReport {

    public static String getdata(String sheetname, int rowIndex, int columnIndex) throws IOException {

        File file = new File("src/main/resources/testdata/ExportData.xlsx");
        FileInputStream fin=new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fin);
        XSSFSheet sheet = workbook.getSheet(sheetname);
       String data = sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
       workbook.close();
       return data;
    }


}
