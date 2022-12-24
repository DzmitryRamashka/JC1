package home_work9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class MainTest {

    String baseUrl = "https://the-internet.herokuapp.com";

    @Test
    void Test() {
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);

        List<WebElement> webLinks = driver.findElements(By.tagName("a"));

        webLinks.get(10).click();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"example\"]/h3")).getText(),"Drag and Drop");

        driver.close();


    }

    @Test
    void checkAlerts()
    {
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);

        WebElement alertLink = driver.findElement(By.xpath("//div[@id='content']/ul/li[29]/a"));

        alertLink.click();

        WebElement alertBtn = driver.findElement(By.xpath("//div[@id='content']/div/ul/li[1]/button"));
        WebElement confirmBtn = driver.findElement(By.xpath("//div[@id='content']/div/ul/li[2]/button"));

        alertBtn.click();

        Alert alert = driver.switchTo().alert();

        String alertText = alert.getText();

        Assert.assertEquals(alertText, "I am a JS Alert");

        alert.accept();

        Assert.assertEquals(driver.findElement(By.xpath("//p[@id='result']")).getText(), "You successfully clicked an alert");

        confirmBtn.click();

        String confirmText = alert.getText();

        Assert.assertEquals(confirmText, "I am a JS Confirm");

        alert.dismiss();

        Assert.assertEquals(driver.findElement(By.xpath("//p[@id='result']")).getText(), "You clicked: Cancel");

        confirmBtn.click();

        Assert.assertEquals(confirmText, "I am a JS Confirm");

        alert.accept();

        Assert.assertEquals(driver.findElement(By.xpath("//p[@id='result']")).getText(), "You clicked: Ok");

        driver.close();
    }

}