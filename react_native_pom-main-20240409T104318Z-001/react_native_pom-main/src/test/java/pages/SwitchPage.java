package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwitchPage extends PageBase {
    public SwitchPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Switch\")")
    WebElement switchBtnOnOff;
    @AndroidFindBy(uiAutomator = "new UiSelector().checkable(true)")
    WebElement switchBtnIsOn;
    @AndroidFindBy(uiAutomator = "new UiSelector().checkable(false)")
    WebElement switchBtnIsOff;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"The switch is off.\")")
    WebElement textSwitchOff;

    public void clickSwitchBtnOnOff() {
        switchBtnOnOff.click();
    }

    public String checkSwitchBtnIsOn() {
        return switchBtnIsOn.getAttribute("checked");
    }

    public String checkSwitchBtnIsOff() {
        return switchBtnIsOff.getAttribute("checked");
    }

    public String checkTextSwitchOff() {
        return textSwitchOff.getText();
    }


}

