package tests;

import org.junit.jupiter.api.Test;
import pages.DrawerPage;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrawerTest extends Base {

    DrawerPage drawerPage;
    HomePage homePage;

    @Test
    public void openAndSlideOnOffDrawerByCoordinates() throws InterruptedException {
        homePage = new HomePage(driver);
        drawerPage = new DrawerPage(driver);
        homePage.scrollToDrawerBlock();
        Thread.sleep(1000);
        drawerPage.slideOnDrawer();
        Thread.sleep(1000);
        drawerPage.slideOffDrawer();
        assertEquals("Screen A", drawerPage.checkScreenA());


    }

    @Test
    public void openAndSlideOnOffDrawerByScroll() throws InterruptedException {
        homePage = new HomePage(driver);
        drawerPage = new DrawerPage(driver);
        homePage.scrollToDrawerBlock();
        Thread.sleep(1000);
        drawerPage.scrollOnOffDrawer();
        drawerPage.clickScreenC();
        assertEquals("Screen C", drawerPage.checkScreenC());

    }
}
