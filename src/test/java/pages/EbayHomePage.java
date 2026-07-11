package pages;

import framework.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayHomePage {
    private final ElementActions actions;

    private final By searchInput = By.id("gh-ac");

    public EbayHomePage(WebDriver driver, WebDriverWait wait) {
        this.actions = new ElementActions(driver, wait);
    }

    public void search(String text) {
        actions.type(searchInput, text + Keys.ENTER);
    }
}
