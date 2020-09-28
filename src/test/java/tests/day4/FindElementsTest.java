package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.BrowserFactory;
import util.BrowserUtils;

public class FindElementsTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        String ExpectedTitle= driver.getTitle();
        WebElement button=driver.findElement(By.id("form_submit"));
        button.click();
        String actualTitle =driver.getTitle();
        BrowserUtils.wait(2);
        if (ExpectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Test passed");

        }else{
            System.out.println("Test failed");
            System.out.println("Actual Title"+actualTitle);
            System.out.println("Expected Title"+ExpectedTitle);

        }
               driver.close();




    }
}
