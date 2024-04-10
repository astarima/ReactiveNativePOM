package pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ButtonPage extends PageBase {


    public ButtonPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"BUTTON\")")
    WebElement blueButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Simple Button Pressed\")")
    WebElement blueButtonNotification;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
    WebElement closePopUp;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Register\")")
    WebElement redButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Colored Button -> Large Button\")")
    WebElement redButtonNotification;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Register Button Pressed\")")
    WebElement registerButtonNotification;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Colored Button\")")
    WebElement visibleColoredButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().textContains(\"Logout\"))")
    WebElement logoutElement;
    @AndroidFindBy(uiAutomator = "text(\"Logout\")")
    WebElement logoutBtn;


    public void clickBlueButton() {
        blueButton.click();
    }

    public String checkPressedBlueButtonNotification() {
        return blueButtonNotification.getText();
    }

    public void clickClosePopUp() {
        closePopUp.click();
    }

    public void clickRedButton() {
        redButton.click();
    }

    public boolean isRedButtonNotificationDisplayed() {
        return redButtonNotification.isDisplayed();
    }

    public boolean isRegisterButtonNotificationDisplayed() {
        return registerButtonNotification.isDisplayed();
    }

    public boolean isVisibleColoredButtonDisplayed() {
        return visibleColoredButton.isDisplayed();
    }

    public void scrollToLogoutButton() {
        logoutElement.click();
    }

    public String logoutBtn() {
        return logoutBtn.getAttribute("checked");

    }

    public void clickLogoutButtonByCoordinates() {
        ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 50, "top", 700, "width", 200, "height", 1500,
                "direction", "down",
                "percent", 1,
                "speed", 1000));
        driver.findElement(AppiumBy.androidUIAutomator("text(\"Logout\")")).click();
    }


}

