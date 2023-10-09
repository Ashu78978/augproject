package day28;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//select specific checkbox
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//total nuber check boxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Number of check boxes:"+checkboxes.size()); //7
		
		//select all the check boxes
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		/*for(WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}*/
		
		//select last 2 checkboxes
		//total number of elements-how many checkboxes to be select= starting index
		//7 - 2 =5 
		/*for(int i=5;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//select first 2 checkboxes
		/*for(int i=0;i<2;i++)
		{
			checkboxes.get(i).click();
		}*/
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			if(i<2)
			{
			checkboxes.get(i).click();
			}
		}*/
		
		//unselect check boxes..
		for(int i=0;i<3;i++)  // 3- selected  4- unselected
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		for(WebElement chkbox:checkboxes)
		{
			if(chkbox.isSelected())
			{
			chkbox.click();
			}
		}
		
	}

}
