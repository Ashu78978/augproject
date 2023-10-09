package day35;
/*
 * 
 * 
Your Java program demonstrates how to handle SSL (Secure Sockets Layer) certificates 
in Selenium WebDriver using ChromeOptions. 
Specifically, it's configured to accept insecure certificates,
 allowing you to access websites with expired or invalid SSL certificates. Here's what the code does:

Imports necessary Selenium WebDriver and ChromeOptions classes.

Creates a ChromeOptions object named options.

Sets the setAcceptInsecureCerts(true) option in options. This tells the WebDriver to 
accept insecure SSL certificates, including those that are expired or invalid.

Initializes a ChromeDriver instance with the configured options.

Navigates to the "https://expired.badssl.com/" website, which is known to have an expired SSL certificate.

Retrieves and prints the title of the web page using driver.getTitle().

With this configuration, your WebDriver instance will allow you to access
 websites with SSL certificate issues without raising SSL certificate-related exceptions.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLHandling {

	public static void main(String[] args) {
		
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);// accept SSL Certificate
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println("title of the page:"+driver.getTitle()); //Privacy error
																//expired.badssl.com
				

	}

}
