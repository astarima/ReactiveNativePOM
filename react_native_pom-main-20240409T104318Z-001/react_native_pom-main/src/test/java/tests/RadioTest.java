package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.RadioPage;

public class RadioTest extends Base {

    HomePage homePage;
    RadioPage radioPage;

    @Test
    public void openAndSelectRadioBlock() {
        homePage = new HomePage(driver);
        radioPage = new RadioPage(driver);
        homePage.clickRadioButtonBlock();
        radioPage.chooseGenderBtn();
    }
}
