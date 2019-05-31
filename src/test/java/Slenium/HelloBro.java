package Slenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HelloBro {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://my.mail.ru/?from=splash");
	driver.findElement(By.className("l-loginform_row_label_input"));
	
	( (WebElement) driver).sendKeys("kiki_infinity");
	driver.findElement(By.className("l-loginform_row_label_select"));
	driver.findElement(By.className("l-loginform_row_label_input"));
	((WebElement)driver).sendKeys("jk0558990990");
	((WebElement) driver).click();
	}
}
