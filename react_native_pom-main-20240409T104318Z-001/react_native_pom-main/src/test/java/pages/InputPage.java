package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InputPage extends PageBase {


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Text Input\")")
    WebElement textInputWithLabelTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    List<WebElement> infoText;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().textContains(\"Numeric Password\"))")
    WebElement loginFields;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Name\")")
    WebElement textName;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Email\")")
    WebElement textEmail;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Phone Number\")")
    WebElement textPhone;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Numeric Password\")")
    WebElement textPassword;

    public InputPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    public String checkTextInputWithLabelTitle() {
        return textInputWithLabelTitle.getText();
    }

    public void writeInfoText(int number, String value) {
        infoText.get(number).sendKeys(value);
    }

    public String checkInfoText(int number) {
        return infoText.get(number).getText();

    }

    public void clearInfoText(int number) {
        infoText.get(number).clear();
    }

    public void scrollToLoginFields() {
        waitForVisibility(loginFields);
    }

    public void putTextName(String name) {
        textName.sendKeys(name);
    }

    public void putTextEmail(String email) {
        textEmail.sendKeys(email);
    }

    public void putTextPhone(String phone) {
        textPhone.sendKeys(phone);
    }

    public void putTextPassword(String password) {
        textPassword.sendKeys(password);
    }


}

