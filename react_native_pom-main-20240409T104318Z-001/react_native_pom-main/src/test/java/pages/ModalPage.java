package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ModalPage extends PageBase {
    public ModalPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Open Modal\")")
    WebElement openModalBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Modal Title\")")
    WebElement titleText;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\")")
    List<WebElement> titleDescription;

    public void clickOpenModalBtn() {
        openModalBtn.click();
    }

    public String getTitleText() {
        return titleText.getText();
    }

    public String getTitleDescription(int number) {
        return titleDescription.get(number).getText();
    }

    public void clickTitleDescription(int number) {
        titleDescription.get(number).click();
    }

    public boolean isOpenModalBtnDisplayed() {
        return openModalBtn.isDisplayed();
    }
}
