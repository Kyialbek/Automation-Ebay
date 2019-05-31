import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class amazonAutomation {
	static WebDriver driver;
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@Test
	public void SearchForItems() {
		driver.get("https://www.amazon.com/s?k=guitar&ref=nb_sb_noss_1");
		
		//driver.findElement(By.className("https://www.amazon.com/s?k=guitar&ref=nb_sb_noss_1"));
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("Guitar"+Keys.ENTER);
		List <WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		Assert.assertEquals("Try again you find"+list.size()+ "expected is"+66, list.size());
		driver.close();
	}

	
}
	


