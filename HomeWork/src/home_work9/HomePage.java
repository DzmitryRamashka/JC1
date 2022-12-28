package home_work9;

import org.openqa.selenium.By;

public class HomePage {
    private By dragAndDropLocator = By.linkText("Drag and Drop");

    public void clickDragAndDropLink() {
        WebDriverSingleton.getInstance().findElement(dragAndDropLocator).click();
    }
}
