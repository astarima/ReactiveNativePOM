package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.TopTabsPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopTabsTest extends Base {
    HomePage homePage;
    TopTabsPage topTabsPage;

    @Test
    public void openTopTabsAndChooseTabC() {
        homePage = new HomePage(driver);
        topTabsPage = new TopTabsPage(driver);
        homePage.scrollToTopTabs();
        homePage.clickTopTabsBlock();
        topTabsPage.clickTabC();
        assertEquals("Tab C", topTabsPage.getChooseTabC());
    }
}
