package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DatePickerPage extends PageBase {
    public DatePickerPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Select Date\")")
    WebElement datePickerSelector;

    public void chooseDatePickerSelector() {
        datePickerSelector.click();
    }

}
