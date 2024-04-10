package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class TopTabsPage extends PageBase {
    public TopTabsPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"TAB C\")")
    WebElement tabC;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tab C\")")
    WebElement chooseTabC;

    public void clickTabC() {
        tabC.click();
    }

    public String getChooseTabC() {
        return chooseTabC.getText();
    }


}
