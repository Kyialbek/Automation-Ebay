package pages;

import framework.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbaySearchResultsPage {
    private final ElementActions actions;

    private final By resultTitles = By.cssSelector(".s-item__title");

    public EbaySearchResultsPage(WebDriver driver, WebDriverWait wait) {
        this.actions = new ElementActions(driver, wait);
    }

    public int resultCount() {
        return actions.all(resultTitles).size();
    }
}
