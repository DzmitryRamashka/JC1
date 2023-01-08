package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage {
    @FindBy(xpath="//div[@id='content']/ul/li[29]/a")
    private WebElement alertLink;

    public void clickAlertsLink() {
        alertLink.click();
    }

}
