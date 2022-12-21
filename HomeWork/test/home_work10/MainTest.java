package home_work10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainTest {

    @Test
    void regionalSettings() {

        String baseUrl = "https://litecart.stqa.ru/en/";

        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='country']")).getText(),"United States");
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='currency']/span")).getText(),"USD");

        WebElement regionalSettings = driver.findElement(By.xpath("//a[@href='https://litecart.stqa.ru/en/regional_settings']"));

        regionalSettings.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        WebElement currency = driver.findElement(By.xpath("//select[@name='currency_code']"));
        WebElement country = driver.findElement(By.xpath("//select[@name='country_code']"));

        currency.sendKeys("Euros");
        country.sendKeys("Germany");

        WebElement saveBtn = driver.findElement(By.xpath("//button[@name='save']"));

        saveBtn.click();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='country']")).getText(),"Germany");
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='currency']/span")).getText(),"EUR");
    }
}