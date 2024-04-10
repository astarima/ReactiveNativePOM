package tests;

import org.junit.jupiter.api.Test;
import pages.BottomTabsPage;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BottomTabsTest extends Base {
    HomePage homePage;
    BottomTabsPage bottomTabsPage;

    @Test
    public void openAndSelectBottomTabs() {
        homePage = new HomePage(driver);
        bottomTabsPage = new BottomTabsPage(driver);
        homePage.clickBottomTabsBlock();
        bottomTabsPage.scrollToOpen();
        bottomTabsPage.clickTabB();
        assertEquals("Tab B", bottomTabsPage.getTabB());
    }
}
