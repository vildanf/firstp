package tests.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.BrowserFactory;

import java.util.List;

public class WarmUp {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.cybertekschool.com/");
        List<WebElement> links= driver. findElements(By.xpath("//a"));
        System.out.println(links.size());
        //a[.='Home']

        for (WebElement webElement:links) {
            if(!webElement.getText().isEmpty()){
            System.out.println(webElement.getText());
        }
        }

        driver.close();
    }
}
