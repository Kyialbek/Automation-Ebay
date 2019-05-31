package amazonBook;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ebayCookBook {
	static WebDriver driver;
	@Before
	
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@ Test
	public void test() {
	driver.get("https://www.ebay.com/");
	 WebElement search =  driver.findElement(By.id("gh-ac"));
	search.sendKeys("selenium cook book");
	WebElement searchButton = driver.findElement(By.id("gh-btn"));
	searchButton.click();
	List<WebElement> title = driver.findElements(By.xpath("//h3[@class='s-item__title']"));
	List<WebElement> price = driver.findElements(By.xpath("//span[@class='s-item__price']"));
	double realPriceSum=0;
	for(int i =0; i<10; i++) {
		//System.out.println(title.get(i).getText()+ " "+price.get(i).getText());
		Map<String, String> titlePrice = new TreeMap<String, String>();
		titlePrice.put(title.get(i).getText(), price.get(i).getText());
		//System.out.println(titlePrice);
		//System.out.println(titlePrice.keySet());
		System.out.println(titlePrice.values());
		for(String j: titlePrice.values()) {
			j=j.substring(1);
			realPriceSum += Double.valueOf(j);
			
		}
	}
	System.out.println(realPriceSum);
	
	
	
	
		
	}
	
	@After
	public void shutDown() throws InterruptedException {
		Thread.sleep(7000);
		driver.quit();
		
	}
	
	

}
