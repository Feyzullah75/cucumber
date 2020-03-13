package StepDefinitions.ExcelPractice;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import java.io.*;

public class ExcelTest {

    public static void main(String[] args) throws Exception {

        //System.out.println(System.getProperty("user.dir"));--> it will give current project directory
        String filePath="/Users/payzyllaabdyvaidov/IdeaProjects/cucumber/src/test/resources/com.cucumber.features.ExcelData/Workbook1.xlsx";

        // inside file class we need to give the file path
        File file=new File(filePath);
        //FileInputStream will open the file which we provided
        FileInputStream inputStream=new FileInputStream(file);

        //XSSFWorkbook requires location of your excel file
        Workbook excelWorkbook=new XSSFWorkbook(inputStream);

        //
        Sheet excelSheet=excelWorkbook.getSheet("Sheet1");
        Row row=excelSheet.getRow(3);
        Cell cell=row.getCell(1);

        System.out.println(cell);

        // first we create the row
        row=excelSheet.createRow(5);
        //after thet we create the cell
        cell=row.createCell(0);
        //cell type
        cell.setCellType(CellType.STRING);
        //cell value
        cell.setCellValue("Test16");

        //if you want to store the values in your excel file we need to use FileOutputStream Class
        //we need to hive the file path
        FileOutputStream outputStream=new FileOutputStream(filePath);
        excelWorkbook.write(outputStream);

        String expected="Test16";
        row=excelSheet.getRow(5);
        cell=row.getCell(0);
        String actual=cell.toString();

        Assert.assertTrue(expected.equals(actual));

        row=excelSheet.getRow(2);
        cell=row.getCell(1);
        cell.setCellValue("Techtorial");

        FileOutputStream outputStream1=new FileOutputStream(filePath);
        excelWorkbook.write(outputStream1);

        System.out.println(cell);

    }


}
