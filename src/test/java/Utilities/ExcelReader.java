package Utilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelReader {
    //run as testNG for Utilitie classes we can not create main method
    //since we can't have method in this class we must use try catch, thow Exception is only for main method
    static XSSFSheet Sheet1;//creating here so we can used anywhere we want to use
    static {
        try {
            FileInputStream file = new FileInputStream("src/test/YahooCredentials.xlsx");
            XSSFWorkbook YahooCredentials = new XSSFWorkbook(file);
            Sheet1 = YahooCredentials.getSheet("Sheet1");
        }catch (Exception e){}
    }
    public static String getData(int rownum, int cellnum){
        return Sheet1.getRow(rownum).getCell(cellnum).getStringCellValue();
    }
}
