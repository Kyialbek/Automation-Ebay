import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classToPractice {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://vk.com/feed");
		driver.navigate().to("https://www.spicejet.com/");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.close();
		
		
		Faker faker = new Faker();

		String name = faker.name().fullName(); // Miss Samanta Schmidt
		System.out.println(name);
		String firstName = faker.name().firstName(); // Emory
		System.out.println(firstName);
		String lastName = faker.name().lastName(); // Barton
		System.out.println(lastName);

		String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
		System.out.println(streetAddress);
		String phoneNumber = faker.phoneNumber().cellPhone();
		System.out.println(phoneNumber);
		
		
	}

}
