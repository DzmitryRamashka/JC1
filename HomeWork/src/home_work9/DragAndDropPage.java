package home_work9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DragAndDropPage {
    private By dragAndDropHeaderLocator = By.xpath("//div[@class=\"example\"]/h3");
    private WebDriver driver;
    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getHeader() {
        return driver.findElement(dragAndDropHeaderLocator).getText();
    }
}
