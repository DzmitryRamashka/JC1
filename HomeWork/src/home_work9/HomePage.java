package home_work9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private By dragAndDropLocator = By.linkText("Drag and Drop");
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickDragAndDropLink() {
        driver.findElement(dragAndDropLocator).click();
    }
}
