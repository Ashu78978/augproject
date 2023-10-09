package day30;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class HandleSelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drpcountry=new Select(drpCountryEle);
		
		//select an option from dropdown
		//drpcountry.selectByVisibleText("USA");
		//drpcountry.selectByValue("3");  // this is used only if 'value' attribute is available.
		//drpcountry.selectByIndex(2); // index starts from zero
		
		//Find total number of options present in dropdown
		List<WebElement> options=drpcountry.getOptions();
		System.out.println("total number of options:"+options.size());
		
		//printing options in console 
		/*for(int i=1;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}*/
		
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		
	}

}

