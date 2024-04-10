package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends ButtonPage {

    public HomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Text\")")
    WebElement textBlock;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Input\")")
    WebElement inputBlock;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Button\")")
    WebElement buttonBlock;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().textContains(\"Drawer\"))")
    WebElement drawerBlock;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Date Picker\")")
    WebElement datePickerBlock;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Switch\")")
    WebElement switchBlock;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Checkbox\")")
    WebElement checkBoxBlock;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Radio Button\")")
    WebElement radioButtonBlock;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Modal\")")
    WebElement modalBlock;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Dropdown\")")
    WebElement dropDownBlock;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Top Tabs\")")
    WebElement topTabsBlock;

    public void clickTextBlock() {
        waitForVisibility(textBlock);
        textBlock.click();
    }

    public void clickInputBlock() {
        waitForVisibility(inputBlock);
        inputBlock.click();
    }

    public void clickButtonBlock() {
        waitForVisibility(buttonBlock);
        buttonBlock.click();
    }

    public void scrollToDrawerBlock() {
        waitForVisibility(drawerBlock);
        drawerBlock.click();
    }

    public void clickDatePickerBlock() {
        waitForVisibility(datePickerBlock);
        datePickerBlock.click();
    }

    public void clickSwitchBlock() {
        waitForVisibility(switchBlock);
        switchBlock.click();
    }

    public void clickCheckBoxBlock() {
        waitForVisibility(checkBoxBlock);
        checkBoxBlock.click();
    }

    public void clickRadioButtonBlock() {
        waitForVisibility(radioButtonBlock);
        radioButtonBlock.click();
    }

    public void clickModalBlock() {
        waitForVisibility(modalBlock);
        modalBlock.click();
    }

    public void clickDropDownBlock() {
        waitForVisibility(dropDownBlock);
        dropDownBlock.click();
    }

    public void scrollToTopTabs() {
        String uiSelector = "new UiSelector().textMatches(\"" + "Top Tabs" + "\")";
        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + uiSelector + ");";
        driver.findElement(AppiumBy.androidUIAutomator(command));
    }

    public void clickTopTabsBlock() {
        topTabsBlock.click();
    }

    public void clickBottomTabsBlock() {
        String uiSelector = "new UiSelector().textMatches(\"" + "Bottom Tabs" + "\")";
        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + uiSelector + ");";
        driver.findElement(AppiumBy.androidUIAutomator(command)).click();
    }
}
