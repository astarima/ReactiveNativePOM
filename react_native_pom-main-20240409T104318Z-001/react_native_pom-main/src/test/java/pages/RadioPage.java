package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class RadioPage extends PageBase {
    public RadioPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Female\")")
    WebElement femaleBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Male\")")
    WebElement maleBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Other\")")
    WebElement otherBtn;

    public void chooseGenderBtn() {
        WebElement[] listBtn = {femaleBtn, maleBtn, otherBtn};
        for (WebElement element : listBtn) {
            element.click();
        }
    }
}

