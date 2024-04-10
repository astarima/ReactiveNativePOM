package tests;

import org.junit.jupiter.api.Test;
import pages.CheckBoxPage;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckBoxTest extends Base {

    HomePage homePage;
    CheckBoxPage checkBoxPage;

    @Test
    public void openCheckBoxAndSelectAll() throws InterruptedException {
        homePage = new HomePage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        homePage.clickCheckBoxBlock();
        checkBoxPage.selectCheckBoxBtn(0);
        assertEquals("true", checkBoxPage.checkStatusCheckBox(0));
        checkBoxPage.selectCheckBoxBtn(1);
        assertEquals("true", checkBoxPage.checkStatusCheckBox(1));
        checkBoxPage.selectCheckBoxBtn(2);
        Thread.sleep(1000);
        assertEquals("true", checkBoxPage.checkStatusCheckBox(2));
    }
}
