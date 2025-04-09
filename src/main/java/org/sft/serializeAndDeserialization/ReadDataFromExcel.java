package org.sft.serializeAndDeserialization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ReadDataFromExcel {

    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.dir")+"/testData/userData.xlsx");

        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("users");

//        System.out.println(sheet.getRow(1).getCell(1));

        int rowNumber=0, columnNumber=0;
        for(Row row: sheet){
            System.out.println(row.getCell(0));
            Cell cell = row.getCell(0);
            if(cell.getStringCellValue().equals("performance")){
                rowNumber = row.getRowNum();
                System.out.println(rowNumber);
                break;
            }
        }

        for(Cell cell: sheet.getRow(0)){
            if(cell.getStringCellValue().equals("UserName")){
                columnNumber = cell.getColumnIndex();
                System.out.println(columnNumber);
                break;
            }
        }

        System.out.println(sheet.getRow(rowNumber).getCell(columnNumber));
        readAllDataFromExcel();
    }

    public static void readAllDataFromExcel() throws IOException {
        File file = new File(System.getProperty("user.dir")+"/testData/userData.xlsx");

        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("users");

        int numberOfRows = sheet.getPhysicalNumberOfRows();
        int numberOfColumns = sheet.getRow(0).getLastCellNum();

        String[][] dataSet = new String[numberOfRows][numberOfColumns];
        DataFormatter dataFormatter = new DataFormatter();

        for (int i=0; i<numberOfRows-1; i++){
            for (int j=0; j<numberOfColumns; j++){
                Cell cell = sheet.getRow(i+1).getCell(i);
                dataSet[i][j] = dataFormatter.formatCellValue(cell);
            }
        }

        for (String[] data:dataSet){
            System.out.println(Arrays.toString(data));
        }
    }
}
