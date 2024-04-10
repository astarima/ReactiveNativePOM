package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.InputPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputTest extends Base {
    InputPage inputPage;
    HomePage homePage;

    @Test
    public void openInputBlock() {
        homePage = new HomePage(driver);
        inputPage = new InputPage(driver);
        homePage.clickInputBlock();
        assertEquals(inputPage.checkTextInputWithLabelTitle(), "Text Input");

    }

    @Test
    public void writeTextToInputFields() {
        homePage = new HomePage(driver);
        inputPage = new InputPage(driver);
        homePage.clickInputBlock();
        assertEquals(inputPage.checkTextInputWithLabelTitle(), "Text Input");
        inputPage.writeInfoText(0, "Asta");
        inputPage.writeInfoText(1, "asta@gmail.com");
        inputPage.writeInfoText(2, "asta@gmail.com");
        assertEquals("Asta", inputPage.checkInfoText(0));
        assertEquals("asta@gmail.com", inputPage.checkInfoText(1));
        assertEquals("asta@gmail.com", inputPage.checkInfoText(2));


    }

    @Test
    public void updateInputFieldsText() {
        homePage = new HomePage(driver);
        inputPage = new InputPage(driver);
        homePage.clickInputBlock();
        assertEquals(inputPage.checkTextInputWithLabelTitle(), "Text Input");
        inputPage.writeInfoText(0, "Asta");
        inputPage.writeInfoText(1, "asta@gmail.com");
        inputPage.writeInfoText(2, "asta@gmail.com");
        inputPage.clearInfoText(0);
        inputPage.clearInfoText(1);
        inputPage.clearInfoText(2);
        inputPage.writeInfoText(0, "Jonas");
        inputPage.writeInfoText(1, "jonas@gmail.com");
        inputPage.writeInfoText(2, "jonas@gmail.com");
        assertEquals("Jonas", inputPage.checkInfoText(0));
        assertEquals("jonas@gmail.com", inputPage.checkInfoText(1));
        assertEquals("jonas@gmail.com", inputPage.checkInfoText(2));
    }

    @Test
    public void writeTextToLoginFields() {
        homePage = new HomePage(driver);
        inputPage = new InputPage(driver);
        homePage.clickInputBlock();
        inputPage.scrollToLoginFields();
        inputPage.putTextName("Asta");
        inputPage.putTextEmail("asta@gmail.com");
        inputPage.putTextPhone("8683094699");
        inputPage.putTextPassword("15151515*");


    }
}