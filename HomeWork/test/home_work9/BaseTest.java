package home_work9;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    private String baseUrl = "https://the-internet.herokuapp.com";
    protected WebDriver driver;
    public BaseTest() {
        this.driver = WebDriverSingleton.getInstance();
    }
    @BeforeTest
    public void setUp() {
        driver.get(baseUrl);
    }
    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
