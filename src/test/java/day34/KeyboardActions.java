package day34;
/*
 * Imports necessary Selenium WebDriver and Actions classes.
Initializes a ChromeDriver instance.
Navigates to the "https://text-compare.com/" website.
Maximizes the browser window.
Finds the input field with the id "inputText1" and sends the text "Testing" to it using the sendKeys method.
Now, let's go through the keyboard actions performed using the Actions class:

act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();: 
This sequence of actions simulates pressing and holding the Ctrl key (keyDown), pressing the "A" key (sendKeys), 
releasing the Ctrl key (keyUp), and performing the actions.
 This is equivalent to selecting all text in the input field (Ctrl+A).

act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();: Similar to the previous action, 
this sequence simulates pressing Ctrl+C to copy the selected text (Ctrl+C).

act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();: This action simulates pressing the Tab key (keyDown) 
and then releasing it (keyUp). It moves the keyboard focus to the next element on the page, 
typically used for navigating between form fields or elements.

act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();:
 This sequence simulates pressing Ctrl+V to paste the copied text (Ctrl+V).
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputText1")).sendKeys("Testing");
		
		Actions act=new Actions(driver);
		
		//ctrl+a
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//ctrl+c
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//ctrl+v
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
	}

}
