package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.SwitchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchTest extends Base {

    HomePage homePage;
    SwitchPage switchPage;

    @Test
    public void openAndOnOffSwitchBlock() {
        homePage = new HomePage(driver);
        switchPage = new SwitchPage(driver);
        homePage.clickSwitchBlock();
        switchPage.clickSwitchBtnOnOff();
        assertEquals("true", switchPage.checkSwitchBtnIsOn());
        switchPage.clickSwitchBtnOnOff();
        assertEquals("false", switchPage.checkSwitchBtnIsOff());
        assertEquals("The switch is off.", switchPage.checkTextSwitchOff());

    }
}

