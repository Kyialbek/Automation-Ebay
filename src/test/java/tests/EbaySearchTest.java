package tests;

import framework.BaseTest;
import framework.TestFixtures;
import org.junit.Assert;
import org.junit.Test;
import pages.EbaySearchResultsPage;

public class EbaySearchTest extends BaseTest {
    @Test
    public void searchResultsPageShowsResults() {
        open(TestFixtures.fileUrl("fixtures/ebay-search-results.html"));

        EbaySearchResultsPage resultsPage = new EbaySearchResultsPage(driver, wait);
        Assert.assertEquals("Expected fixture search results", 3, resultsPage.resultCount());
    }
}
