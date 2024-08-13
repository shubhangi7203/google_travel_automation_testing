package com.qa.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	 public static FileInputStream fileLoc;
	    public static XSSFWorkbook xBook;
	    public static XSSFSheet xSheet;
	    public static XSSFRow row;
	    public static XSSFCell cell;
	    
	    public static int getRowCount(String xFile, String XSheetName) throws IOException {
	        fileLoc = new FileInputStream(xFile);
	        xBook = new XSSFWorkbook(fileLoc);
	        xSheet = xBook.getSheet(XSheetName);
	        int rowCount = xSheet.getLastRowNum();
	        return rowCount;
	    }
	    
	    public static int getCellCount(String xFile, String XSheetName, int rowNum) throws IOException {
	        fileLoc = new FileInputStream(xFile);
	        xBook = new XSSFWorkbook(fileLoc);
	        xSheet = xBook.getSheet(XSheetName);
	        row = xSheet.getRow(rowNum);
	        int cellCount = row.getLastCellNum();
	        return cellCount;
	    }
	    
	    public static String getData(String xFile, String XSheetName, int rowNum, int cellNum) throws IOException {
	        fileLoc = new FileInputStream(xFile);
	        xBook = new XSSFWorkbook(fileLoc);
	        xSheet = xBook.getSheet(XSheetName);
	        row = xSheet.getRow(rowNum);
	        cell = row.getCell(cellNum);
	    
	        DataFormatter format = new DataFormatter();
	        
	        String cellData =format.formatCellValue(cell);
	        
	        xBook.close();
	        fileLoc.close();
	        
	        return cellData;
	        
	    }
	    
	}