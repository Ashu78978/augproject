package day36;
/*
 * 
Your Java program is designed to read data from an Excel file (data.xlsx)
 using the Apache POI library, specifically for working with Excel files. 
 Here's a breakdown of what the code does:

Imports necessary classes from the Apache POI library for Excel
 (XSSFWorkbook, XSSFSheet, XSSFRow, and XSSFCell) and Java IO (FileInputStream).

Opens an input stream to read the Excel file 
"data.xlsx" located in the "testdata" directory within your project directory using FileInputStream.

Initializes a XSSFWorkbook object named workbook to represent the Excel workbook.
//extract workbook from file
Gets the specific sheet named "Sheet1" (you can also use workbook.getSheetAt(0) to get the first sheet)
 using workbook.getSheet("Sheet1").

Reads data from a specific row and cell. In this case:

It gets the second row (index 1) using sheet.getRow(1).
It gets the fourth cell (index 3) within that row using row.getCell(3).
Prints the value of the cell using cell.toString().




















In your Java program, you are reading data from an Excel file using Apache POI 
and retrieving the total number of rows and cells in the Excel sheet. Here's a breakdown of what the code does:

Imports necessary classes from the Apache POI library for Excel (XSSFWorkbook, XSSFSheet) and Java IO (FileInputStream).

Opens an input stream to read the Excel file "data.xlsx" located in the "testdata" directory within your project directory using FileInputStream.

Initializes a XSSFWorkbook object named workbook to represent the Excel workbook.

Gets the specific sheet named "Sheet1" (you can also use workbook.getSheetAt(0)
 to get the first sheet) using workbook.getSheet("Sheet1").

Calculates the total number of rows in the sheet using sheet.getLastRowNum(). 
The getLastRowNum() method returns the index of the last row with data (0-based index), 
so you add 1 to it to get the total number of rows.

Calculates the total number of cells in the second row (index 1) using sheet.getRow(1).getLastCellNum().
 The getLastCellNum() method returns the number of cells in the row.

Prints the total number of rows and cells in the Excel sheet.

The output will display the number of rows and cells in the Excel sheet.
 In this example, it will print "number of rows in excel: 5" and "number of cells in excel:
  4" based on the data in the "Sheet1" of the "data.xlsx" file.
  
  
  
  
  
  
  
  
  
  
  
  
The code you've provided is a nested loop that iterates through each row and cell 
in the Excel sheet and prints the data in a tabular format. Here's how the code works:

The outer for loop iterates through each row in the Excel sheet. 
It starts from row 0 (the first row) and goes up to the total number of rows (totalRows), inclusive.

Inside the outer loop, XSSFRow currentRow = sheet.getRow(r); retrieves the current row being processed.

The inner for loop iterates through each cell in the current row. 
It starts from cell 0 (the first cell) and goes up to one less than the total number of cells in the row (totalCells).

XSSFCell cell = currentRow.getCell(c); retrieves the current cell being processed.

System.out.print(cell.toString() + " "); prints the content of the current cell 
followed by several spaces to separate it from the next cell.

After printing all the cells in the current row, System.out.println(); 
is used to move to the next line, effectively printing the rows in a tabular format.

As a result, this code will print the entire content of the "Sheet1" 
in the "data.xlsx" Excel file, row by row and cell by cell, 
with cells separated by spaces and rows separated by line breaks. 
The tabular format makes it easy to view and analyze the Excel data in the console output.
 */
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file-->Workbook--->Sheets--->Rows--->Cells

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
			
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook  workbook=new XSSFWorkbook(file);  
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");//workbook.getSheetAt(0) from workbook we extract sheet
		
		//reading specific row & Cell data
//		XSSFRow row=sheet.getRow(5);
//		XSSFCell cell=row.getCell(3);
//		System.out.println(cell.toString());
//		
		
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(1).getLastCellNum();
//		
	System.out.println("number of rows in excel:"+ totalRows); //5
		System.out.println("number of cells in excel:"+ totalCells); //4
		
		
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"       ");
			}
			System.out.println();
		 
		}
		
		
		

			
			
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		workbook.close();
		file.close();
				
		
	}

}
