package helpers;

import org.openqa.selenium.By;

import java.io.InputStream;
import java.util.Properties;

public class Locators {

    private static Properties locators;
    static {
        locators = new Properties();
        InputStream is = Locators.class.getResourceAsStream("/locators.properties");
        try {
            locators.load(is);
            System.out.println("File is OK");
        } catch (Exception e) {
            System.out.println("Error reading from properties file");
        }
    }

    public static By getLocator(String locator) throws Exception {
        String value = locators.getProperty(locator);
        By by;

        String[] result = value.split("=",2);
        LocatorType locatorType = LocatorType.valueOf(result[0]);
        String selector = result[1];
        switch (locatorType) {
            case xpath:
                by = By.xpath(selector);
                break;
            case id:
                by = By.id(selector);
                break;
            case linkText:
                by = By.linkText(selector);
                break;
            default: throw new Exception("No such locator type");
        }
        return by;
    }
}
