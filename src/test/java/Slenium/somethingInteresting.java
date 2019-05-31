package Slenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class somethingInteresting {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

	}
	@Test
	public void testMyPage() throws InterruptedException {
		driver.get("https://www.expedia.com/");
	        Thread.sleep(3000);
	        WebElement flIN =driver.findElement(By.id("package-origin-hp-package"));
	        flIN.sendKeys("Chicago");
	        Thread.sleep(7000);
	        
	        WebElement flOUT =driver.findElement(By.id("package-destination-hp-package"));
	        flOUT.sendKeys("Bishkek");
	        
	        WebElement dateIn = driver.findElement(By.id("package-departing-hp-package"));
	        dateIn.sendKeys("05/30/2019");
	        
	        WebElement dateOut = driver.findElement(By.id("package-returning-hp-package"));
	        dateOut.sendKeys("06/30/2019");
	        
	        WebElement searchB = driver.findElement(By.id("search-button-hp-package"));
	        searchB.click();
	        driver.get("https://www.youtube.com/watch?v=aG1nWuYFkTM");
	       // Thread.sleep(10000);
	        
		
		
	}

}
