package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxPage extends PageBase {
    public CheckBoxPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\")")
    List<WebElement> checkBoxBtn;

    public void selectCheckBoxBtn(int number) {
        checkBoxBtn.get(number).click();
    }

    public String checkStatusCheckBox(int number) {
        return checkBoxBtn.get(number).getAttribute("checked");

    }
}
