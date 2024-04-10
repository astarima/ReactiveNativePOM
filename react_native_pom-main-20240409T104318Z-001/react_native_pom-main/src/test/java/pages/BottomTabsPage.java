package pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BottomTabsPage extends PageBase {
    public BottomTabsPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tab B\")")
    WebElement tabB;

    public void scrollToOpen() {
        String uiSelector = "new UiSelector().textMatches(\"" + "Open" + "\")";
        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + uiSelector + ");";
        driver.findElement(AppiumBy.androidUIAutomator(command)).click();
    }

    public void scrollBottomTabs() {
        ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 160, "top", 900, "width", 200, "height", 900,
                "direction", "down",
                "percent", 2.0,
                "speed", 1000
        ));
    }
    public void clickTabB() {
        tabB.click();
    }

    public String getTabB() {
        return tabB.getText();
    }
}
