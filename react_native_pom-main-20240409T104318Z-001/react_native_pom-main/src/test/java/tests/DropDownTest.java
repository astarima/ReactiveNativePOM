package tests;

import org.junit.jupiter.api.Test;
import pages.DropDownPage;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DropDownTest extends Base {

    HomePage homePage;
    DropDownPage dropDownPage;

    @Test
    public void openAndSelectDropDownITLanguage() {
        homePage = new HomePage(driver);
        dropDownPage = new DropDownPage(driver);
        homePage.clickDropDownBlock();
        dropDownPage.expandITLanguageList();
        dropDownPage.clickChooseITLanguage();
        assertEquals("Rust", dropDownPage.getITLanguage());
    }
}
