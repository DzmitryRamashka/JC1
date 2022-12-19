package home_work9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MainTest {

    @Test
    void Test() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> webLinks = driver.findElements(By.tagName("a"));

        webLinks.get(10).click();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"example\"]/h3")).getText(),"Drag and Drop");

        driver.close();


    }

}