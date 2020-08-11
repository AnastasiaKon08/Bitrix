package Bitrix.utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtil {
    private static FileInputStream file;
    private static Workbook workbook;
    private static Sheet sheet;
    private static Row row;
    private static Cell cell;



    public static void ExcelSetup(String path, String sheetName){

        try {
            file = new FileInputStream(path);
            workbook = WorkbookFactory.create(file);
            sheet = workbook.getSheet(sheetName);
            row = sheet.getRow(0);
            cell = row.getCell(0);

        } catch (IOException e){
            System.out.println("Error while getting setting up connection with excel file ");
            e.printStackTrace();
        }
    }

    public static void printWholeTable() {

        int rowNumber = sheet.getPhysicalNumberOfRows();
        int columnNumber = row.getPhysicalNumberOfCells();

        for (int rowIndex = 0; rowIndex < rowNumber; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columnNumber; columnIndex++) {
                System.out.print(sheet.getRow(rowIndex).getCell(columnIndex) + "\t");
            }
            System.out.println();
        }
    }
}
