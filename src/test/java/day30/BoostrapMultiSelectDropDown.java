package day30;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapMultiSelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//clicking on the dropdown
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		
		//total number of options
		System.out.println("total number of options:"+options.size()); //14
		
		//printing all the options
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}*/
		
		/*for(WebElement opt:options)
		{
			System.out.println(opt.getText());
			
		}*/
		
		//select options from dropdown
		
		/*for(int i=0;i<options.size();i++)
		{
			String optiontext=options.get(i).getText();
			if(optiontext.equals("Java") || optiontext.equals("Python"))
			{
				options.get(i).click();
			}
			
		}*/
		
		for(WebElement opt:options)
		{
			String optiontext=opt.getText();
			if(optiontext.equals("Java") || optiontext.equals("Python"))
			{
				opt.click();
			}
			
		}
		
	}

}





