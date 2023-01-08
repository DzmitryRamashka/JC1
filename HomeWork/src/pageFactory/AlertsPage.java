package pageFactory;

import helpers.WebDriverSingleton;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class AlertsPage {
    @FindBy(xpath = "//div[@id='content']/div/ul/li[1]/button")
    private WebElement alertBtn;

    @FindBy(xpath = "//p[@id='result']")
    private WebElement confirmationAlertText;

    public String getAlertText() {
        String alertText;
        alertBtn.click();
        Alert alert = WebDriverSingleton.getInstance().switchTo().alert();
        alertText = alert.getText();
        alert.accept();
        return alertText;
    }

    public String getConfirmationAlertText() {
        return confirmationAlertText.getText();
    }


}
