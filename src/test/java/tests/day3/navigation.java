package tests.day3;

import org.openqa.selenium.WebDriver;
import util.BrowserFactory;
import util.BrowserUtils;

public class navigation {

    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");
        BrowserUtils.wait(3);
        driver.navigate().back();
        driver.manage().window().maximize();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}
