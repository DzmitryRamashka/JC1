package home_work10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainTest {
    String baseUrl = "https://litecart.stqa.ru/en/";
    @Test
    void regionalSettings() {

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

        driver.close();
    }
    @Test
    void rubberDucksMenu() {

        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);

        WebElement rubberDucks = driver.findElement(By.xpath("//nav[@id='site-menu']/ul/li[2]/a"));

        Actions builder = new Actions(driver);

        builder.moveToElement(rubberDucks).perform();

        WebElement menuItem1 = driver.findElement(By.xpath("//li[@class='category-2']/a"));

        builder.moveToElement(menuItem1).perform();

        menuItem1.click();

        Assert.assertEquals(driver.getTitle(),"Subcategory | My Store");

        driver.close();
    }
}