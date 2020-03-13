package Runner;

import Utils.ExcelUtils;

public class ExcelRunner {

    public static void main(String[] args) {

        ExcelUtils.openExcelFile("Employee","Page1");
        String cellValue=ExcelUtils.getCellValue(4,5);

        System.out.println(cellValue);

        ExcelUtils.setCellValue("USA", 4,5);

        cellValue=ExcelUtils.getCellValue(4,5);

        System.out.println(cellValue);

        ExcelUtils.closeWorkbook();

        ExcelUtils.openExcelFile("Workbook1", "Sheet1");

        ExcelUtils.getAllExcelValue();

    }
}
