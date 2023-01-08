package pageFactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void checkAlertBtn() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        AlertsPage alertsPage = PageFactory.initElements(driver, AlertsPage.class);

        homePage.clickAlertsLink();

        Assert.assertEquals(alertsPage.getAlertText(),"I am a JS Alert");
        Assert.assertEquals(alertsPage.getConfirmationAlertText(), "You successfully clicked an alert");


    }







}