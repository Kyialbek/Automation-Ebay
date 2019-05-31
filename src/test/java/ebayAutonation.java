

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ebayAutonation {
	//static WebDriver driver;
	
	  static WebDriver driver;
	   @Before
	   public void setup() {
	       WebDriverManager.chromedriver().setup();
	       driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	   }
	   //@Test
	   public void TestMyPage() throws InterruptedException {
	       driver.get("https://www.ebay.com/");
	       Thread.sleep(1000);
	       WebElement searchBox = driver.findElement(By.id("gh-ac"));
	       searchBox.sendKeys("Cucumber CookBook" + Keys.ENTER);
	       Thread.sleep(1000);
	       List<WebElement> elementList=driver.findElements(By.xpath("//h3[@class='s-item__title']"));
	       System.out.println(elementList.size());
	      // Assert.assertEquals(“Try again you found “+elementList.size()+” but expected 25",25,elementList.size());
	       if (elementList.size()>10){
	           System.out.println("verified");
	       }else {
	           System.out.println("less then 10");
	       }
	       WebElement BOOK = driver.findElement(By.xpath("//h3[.='Short Stack: Cucumbers by Dawn Perry (2017, Paperback)']"));
	       BOOK.click();
	       String expected ="Short Stack: Cucumbers by Dawn Perry (2017, Paperback) 9780997532180 | eBay";
	       String current =driver.getTitle();
	       Assert.assertEquals("not verified",expected,current);
	   }
	   @Test
	   public void TestMypage() throws InterruptedException {
	       driver.get("https://www.ebay.com/");
	       Thread.sleep(1000);
	       WebElement searchBox = driver.findElement(By.id("gh-ac"));
	       searchBox.sendKeys("Cucumber CookBook" + Keys.ENTER);
	       Thread.sleep(1000);
	       List<WebElement> elementList=driver.findElements(By.xpath("//h3[@class='s-item__title']"));
	       System.out.println(elementList.size());
	       // Assert.assertEquals(“Try again you found “+elementList.size()+” but expected 25",25,elementList.size());
	       if (elementList.size()>10){
	           System.out.println("verified");
	       }else {
	           System.out.println("less then 10");
	       }
	   }
	   @After
	   public void tearDown() throws InterruptedException {
	       Thread.sleep(5000);
	        driver.quit();
	   }}
