package day36;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Scanner;


//Excel File-->Workbook-->Sheets--->Rows--->Cells

public class WritingMultipleRowsAndCellsinExcel {

	public static void main(String[] args) throws IOException {
				
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
				
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		
		//Creating multiple rows & Cells without loop
		/*XSSFRow row1=sheet.createRow(0);
		
			row1.createCell(0).setCellValue("welcome");
			row1.createCell(1).setCellValue(1234);
			row1.createCell(2).setCellValue(120.56);
			
		XSSFRow row2=sheet.createRow(1);
			
			row2.createCell(0).setCellValue("abc");
			row2.createCell(1).setCellValue("xyz");
			row2.createCell(2).setCellValue(123);
		 */
		
		//Creating multiple rows & Cells using loop
		Scanner sc=new Scanner(System.in);
		
		for(int r=0;r<=3;r++)
		{
			XSSFRow curentRow=sheet.createRow(r);
			for(int c=0;c<2;c++)
			{
				System.out.println("Enter value:");
				String value=sc.next();
								
				curentRow.createCell(c).setCellValue(value);
			}
		}
		
		
		
		
		
		
		
		workbook.write(file);
		workbook.close();
		file.close();
			
		System.out.println("Done!!!!");
	}

}





