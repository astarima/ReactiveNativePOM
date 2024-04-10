package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class TextPage extends PageBase {
    public TextPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"More/Less Text\")")
    WebElement descriptionText;

    public String getDescriptionText() {
        return descriptionText.getText();
    }
}
