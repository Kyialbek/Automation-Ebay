import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class timaHomeTask {
	static WebDriver driver;

	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void TestMyPage() throws InterruptedException {
		driver.get("https://www.amazon.com");
		Thread.sleep(1000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		signIn.click();
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("ustabekovb@gmail.com");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("ustabekov94");
		Thread.sleep(1000);
		WebElement signInButton = driver.findElement(By.id("signInSubmit"));
		signInButton.click();
		Thread.sleep(1000);
		//Assert.assertEquals(expected, actual);
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iPhone"+Keys.ENTER);
		Thread.sleep(1000);
		List <String> price = new ArrayList<String>();
		
		WebElement iPhone1 = driver.findElement(By.xpath("//div[@data-asin='B07K97BQDF']//span[@class='a-price-whole']"));
		WebElement fraction1 = driver.findElement(By.xpath("//div[@data-asin='B07K97BQDF']//span[@class='a-price-fraction']"));
		price.add(iPhone1.getText());
		Thread.sleep(1000);
		WebElement iPhone2 = driver.findElement(By.xpath("//div[@data-asin='B07K8L56DR']//span[@class='a-price-whole']"));
		//WebElement fraction2 = driver.findElement(By.xpath("//div[@data-asin='B07K8L56DR']//span[@class='a-price-fraction']"));
		price.add(iPhone2.getText());
		Thread.sleep(1000);
		WebElement iPhone3 = driver.findElement(By.xpath("//div[@data-asin='B014Z8HDWU']//span[@class='a-price-whole']"));
		price.add(iPhone3.getText());
		Thread.sleep(1000);
		WebElement iPhone4 = driver.findElement(By.xpath("//div[@data-asin='B01NCYY6OK']//span[@class='a-price-whole']"));
		price.add(iPhone4.getText());
		Thread.sleep(1000);
		WebElement iPhone5 = driver.findElement(By.xpath("//div[@data-asin='B01CR1FQMG']//span[@class='a-price-whole']"));
		price.add(iPhone5.getText());
		System.out.println(price);
	
	}
	

}
