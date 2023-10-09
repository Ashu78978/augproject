package day37;
/*
 * 
 * 
The Java class FDCalculatorDDT appears to be a script for performing data-driven testing (DDT) on a Fixed Deposit (FD) calculator web application using Selenium WebDriver and Apache POI for Excel data. Here's a breakdown of what the code does:

WebDriver Initialization:

Initializes a Chrome WebDriver instance.
Sets implicit wait for the driver to wait for elements for up to 10 seconds.
Navigates to the FD calculator webpage and maximizes the browser window.
Excel File Path:

Defines the file path for the Excel data file (caldata.xlsx) using System.getProperty("user.dir") to get the project directory.
Data-Driven Testing Loop:

Loops through rows in the Excel sheet "Sheet1" from row 1 to the last row.
Reads data from the Excel sheet for each test case (e.g., principal amount, rate of interest, tenure, etc.).
Web Page Interaction:

Enters the test data into the respective input fields on the web page using Selenium WebDriver.
JavaScript Executor:

Executes JavaScript to click the "Calculate" button on the web page.
Validation:

Retrieves the actual maturity value from the web page.
Compares the actual maturity value with the expected maturity value from the Excel sheet.
If the values match, it marks the test as "Passed" in Excel and fills the cell with a green color; otherwise, it marks it as "Failed" and fills the cell with a red color.
Clearing Input:

Executes JavaScript to click the "Clear" button on the web page to reset input fields for the next test case.
Thread Sleep:

Sleeps for 3 seconds before exiting the script to allow time for any last actions.
This code performs data-driven testing by reading test data from an Excel sheet, entering the data into a web application, and verifying the results. It uses JavaScript to interact with the web page and Apache POI to read and write data from/to Excel.

Make sure that the Excel sheet "Sheet1" contains the necessary test data and that the web application's XPath expressions for input fields and buttons match the ones used in the script.
 */
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculatorDDT {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String filePath=System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
		
		int rows=XLUtils.getRowCount(filePath, "Sheet1");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		for(int i=1;i<=rows;i++)
		{
			//read row from excel
			String princ=XLUtils.getCellData(filePath,"Sheet1",i,0);
			String rateofinterest=XLUtils.getCellData(filePath,"Sheet1",i,1);
			String per1=XLUtils.getCellData(filePath,"Sheet1",i,2);
			String per2=XLUtils.getCellData(filePath,"Sheet1",i,3);
			String fre=XLUtils.getCellData(filePath,"Sheet1",i,4);
			String exp_mvalue=XLUtils.getCellData(filePath,"Sheet1",i,5);
			
			//pass the data to the app
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			Select perdrp=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fredrp.selectByVisibleText(fre);
			
			js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")));////calculate button
			
						
			
			//validation
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
			{
				System.out.println("Test passed");
				XLUtils.setCellData(filePath, "Sheet1",i,7,"Passed");
				XLUtils.fillGreenColor(filePath, "Sheet1",i,7);
			}
			else
			{
				System.out.println("Test failed");
				XLUtils.setCellData(filePath, "Sheet1",i,7,"Failed");
				XLUtils.fillRedColor(filePath, "Sheet1",i,7);
			}
			
			js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@class='cal_div']//a[2]"))); //clear button
		}
		
		Thread.sleep(3000);

	}

}
