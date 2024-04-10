package pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DrawerPage extends PageBase {

    public DrawerPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Screen A\")")
    WebElement screenA;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Screen C\")")
    WebElement screenC;


    public void slideOnDrawer() {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", 50, "top", 1200, "width", 900, "height", 1400,
                "direction", "right",
                "percent", 0.75,
                "speed", 1000
        ));
    }

    public void slideOffDrawer() {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", 700, "top", 1900, "width", 600, "height", 1900,
                "direction", "left",
                "percent", 0.75,
                "speed", 1000
        ));
    }

    public String checkScreenA() {
        return screenA.getText();
    }

    public void scrollOnOffDrawer() {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", 50, "top", 1200, "width", 900, "height", 1400,
                "direction", "right",
                "percent", 0.75,
                "speed", 1000
        ));

    }

    public void clickScreenC() {
        screenC.click();
    }

    public String checkScreenC() {
        return screenC.getText();
    }
}

