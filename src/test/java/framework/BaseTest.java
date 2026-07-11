package framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @Before
    public void setUpBaseTest() {
        driver = DriverFactory.createDriver();
        wait = new WebDriverWait(driver, Config.timeout());
        driver.manage().deleteAllCookies();
    }

    @After
    public void tearDownBaseTest() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected void open(String path) {
        if (path == null || path.isEmpty() || path.startsWith("http") || path.startsWith("file:")) {
            driver.get(path == null || path.isEmpty() ? Config.baseUrl() : path);
            return;
        }

        driver.get(Config.baseUrl() + path);
    }
}
