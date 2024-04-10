package tests;

import org.junit.jupiter.api.Test;
import pages.DatePickerPage;
import pages.HomePage;

public class DatePickerTest extends Base {
    HomePage homePage;
    DatePickerPage dataPage;

    @Test
    public void openAndChooseDataPicker() {
        homePage = new HomePage(driver);
        dataPage = new DatePickerPage(driver);
        homePage.clickDatePickerBlock();
        dataPage.chooseDatePickerSelector();

    }
}
