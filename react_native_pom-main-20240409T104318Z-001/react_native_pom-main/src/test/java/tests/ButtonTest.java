package tests;

import org.junit.jupiter.api.Test;
import pages.ButtonPage;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ButtonTest extends Base {
    ButtonPage buttonPage;
    HomePage homePage;
    @Test
    public void openButtonBlock() {
        homePage = new HomePage(driver);
        buttonPage = new ButtonPage(driver);
        homePage.clickButtonBlock();
        buttonPage.clickBlueButton();
        assertEquals("Simple Button Pressed", buttonPage.checkPressedBlueButtonNotification());
        buttonPage.clickClosePopUp();
        buttonPage.clickRedButton();
        assertTrue(buttonPage.isRedButtonNotificationDisplayed());
        assertTrue(buttonPage.isRegisterButtonNotificationDisplayed());
        buttonPage.clickClosePopUp();
        assertTrue(buttonPage.isVisibleColoredButtonDisplayed());
    }
    @Test
    public void findAndClickLogoutButtonByScroll() {
        homePage = new HomePage(driver);
        buttonPage = new ButtonPage(driver);
        homePage.clickButtonBlock();
        buttonPage.scrollToLogoutButton();
        buttonPage.clickClosePopUp();
        assertEquals("false", buttonPage.logoutBtn());
    }
    @Test
    public void findAndClickLogoutButtonByCoordinates() throws InterruptedException {
        homePage = new HomePage(driver);
        buttonPage = new ButtonPage(driver);
        homePage.clickButtonBlock();
        Thread.sleep(1000);
        buttonPage.clickLogoutButtonByCoordinates();
        buttonPage.clickClosePopUp();
        assertEquals("false", buttonPage.logoutBtn());
    }

}
