package day37;
/*
 * 
The Java class ExcelUtils you provided appears to be a utility class for working with Excel files using Apache POI (a Java library for working with Microsoft Office documents). Here's a breakdown of the main functions and methods in this utility class:

Class Variables and Objects:

FileInputStream fi: Input stream to read the Excel file.
FileOutputStream fo: Output stream to write to the Excel file.
XSSFWorkbook wb: Workbook object representing the Excel workbook.
XSSFSheet ws: Sheet object representing an Excel sheet.
XSSFRow row: Row object representing an Excel row.
XSSFCell cell: Cell object representing an Excel cell.
CellStyle style: Cell style for formatting Excel cells.
getRowCount Method:

Accepts an Excel file path (xlfile) and sheet name (xlsheet).
Opens the Excel file, gets the specified sheet, and returns the total number of rows in the sheet.
Closes the file input stream and workbook.
getCellCount Method:

Accepts an Excel file path (xlfile), sheet name (xlsheet), and row number (rownum).
Opens the Excel file, gets the specified sheet and row, and returns the total number of cells in the row.
Closes the file input stream and workbook.
getCellData Method:

Accepts an Excel file path (xlfile), sheet name (xlsheet), row number (rownum), and column number (colnum).
Opens the Excel file, gets the specified sheet, row, and cell, and returns the data in the cell as a string.
Closes the file input stream and workbook.
setCellData Method:

Accepts an Excel file path (xlfile), sheet name (xlsheet), row number (rownum), column number (colnum), and data to be set in the cell.
Opens the Excel file, gets the specified sheet, row, and cell, sets the cell's value to the provided data, and writes the changes to the Excel file.
Closes the file input stream, workbook, and file output stream.
fillGreenColor and fillRedColor Methods:

These methods accept an Excel file path (xlfile), sheet name (xlsheet), row number (rownum), and column number (colnum).
They open the Excel file, get the specified sheet, row, and cell, and apply a cell style to change the cell's background color to green or red, respectively.
The changes are written to the Excel file, and the streams and workbook are closed
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;  
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException 
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;		
	}
	

	public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	
	
	public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
	
		String data;
		try 
		{
			//data=cell.toString();
			
			DataFormatter formatter = new DataFormatter();
            data = formatter.formatCellValue(cell);
            return data;
		}
		catch (Exception e) 
		{
			data="";
		}
		
		wb.close();
		fi.close();
		return data;
	}
	
	

	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);		
		wb.close();
		fi.close();
		fo.close();
				
	}
	
	public static void fillGreenColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
				
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	
	public static void fillRedColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
		
		cell.setCellStyle(style);		
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
}
