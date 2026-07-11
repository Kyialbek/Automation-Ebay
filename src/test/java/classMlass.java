import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classMlass {
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
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("airpod"+Keys.ENTER);
		// Legacy locator experiment removed: it contained non-UTF-8 quote characters.
		
		
	}

}
