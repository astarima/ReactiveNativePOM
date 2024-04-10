package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropDownPage extends PageBase {
    public DropDownPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Spinner\")")
    WebElement ITLanguageList;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Rust\")")
    WebElement chooseITLanguage;
    @AndroidFindBy(id = "android:id/text1")
    WebElement ITLanguage;

    public void expandITLanguageList() {
        Actions actions = new Actions(driver);
        actions.click(ITLanguageList);
        actions.perform();
    }

    public void clickChooseITLanguage() {
        chooseITLanguage.click();
    }

    public String getITLanguage() {
        return ITLanguage.getText();
    }
}
