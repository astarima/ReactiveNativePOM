package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.TextPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextTest extends Base {
    HomePage homePage;
    TextPage textPage;

    @Test
    public void openTextBlock() {
        homePage = new HomePage(driver);
        textPage = new TextPage(driver);
        homePage.clickTextBlock();
        assertEquals("More/Less Text", textPage.getDescriptionText());

    }
}
