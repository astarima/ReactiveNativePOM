package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.ModalPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModalTest extends Base {
    HomePage homePage;
    ModalPage modalPage;

    @Test
    public void openModalBlock() {
        homePage = new HomePage(driver);
        modalPage = new ModalPage(driver);
        homePage.clickModalBlock();
        modalPage.clickOpenModalBtn();
        assertEquals("Modal Title", modalPage.getTitleText());
        assertEquals("Lorem ipsum dolor", modalPage.getTitleDescription(2).substring(0, 17));
        modalPage.clickTitleDescription(1);
        assertTrue(modalPage.isOpenModalBtnDisplayed());
    }
}
