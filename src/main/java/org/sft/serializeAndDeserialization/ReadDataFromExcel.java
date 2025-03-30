package org.sft.serializeAndDeserialization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
    }
}
