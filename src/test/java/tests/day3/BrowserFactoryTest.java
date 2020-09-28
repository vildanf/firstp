package tests.day3;

import org.openqa.selenium.WebDriver;
import util.BrowserFactory;

public class BrowserFactoryTest {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        System.out.println(driver.getPageSource());
        driver.quit();

    }

}
