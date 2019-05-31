package amazonGuitar;

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
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guitar {
	static WebDriver driver;
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void test() {
		 driver.get("https://www.ebay.com/");
		 WebElement search =driver.findElement(By.id("gh-ac"));
		 //WebElement enter = driver.g
		 search.sendKeys("guitar"+Keys.ENTER);
		 List <WebElement> guitarName = driver.findElements(By.xpath("//h3[@class='s-item__title']"));
		 List<WebElement> guitarPrice = driver.findElements(By.xpath("//span[@class='s-item__price']"));
		 
		 double realPrice =0;
		 for(int i =0; i<10; i++) {
			// System.out.println(guitarName.get(i).getText()+" "+guitarPrice.get(i).getText());
			 Map<String, String> sumPrice = new TreeMap<String, String>();
			 sumPrice.put(guitarName.get(i).getText(), guitarPrice.get(i).getText());
			 for(String j: sumPrice.values()) {
				 
				 
//				 System.out.println(sumPrice.values());
//				 System.out.println(guitarName.get(i).getText()+" price "+guitarPrice.get(i).getText());
					 j = j.substring(1);
					 realPrice += Double.valueOf(j);
					 
				 }  
			 }
		 System.out.println(realPrice);
		
		 }
		
		 
	
	
	@After
	public void close() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}
	

}
