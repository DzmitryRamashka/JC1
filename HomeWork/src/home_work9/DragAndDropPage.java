package home_work9;

import org.openqa.selenium.By;

public class DragAndDropPage {
    private By dragAndDropHeaderLocator = By.xpath("//div[@class=\"example\"]/h3");

    public String getHeader() {
        return WebDriverSingleton.getInstance().findElement(dragAndDropHeaderLocator).getText();
    }
}
