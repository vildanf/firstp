package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.BrowserFactory;

public class EnterText2 {


    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("abcd@mail.yahoo.com", Keys.ENTER);
        //WebElement button = driver.findElement(By.id("form_submit"));
        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        String expectedMessage = "Your e-mail's been sent!";
        String actualMessage = confirmationMessage.getText();

        if (expectedMessage.equals(actualMessage)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test failed");
        }
driver.close();

    }
}