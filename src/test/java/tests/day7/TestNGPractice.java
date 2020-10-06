package tests.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.BrowserFactory;

public class TestNGPractice {

//    @Test
//    public void test(){
//        Assert.assertEquals("appl","apple", "Word is not correct");
//
//    }
    @Test
    public void verifyTitle(){
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is wrong");
        driver.quit();

    }

    //lets verify test automation practice heading is displayed
    @Test(description = "Verify that heading is displayed")
    public void verifyHeadingIsDisplayed(){
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        WebElement heading=driver.findElement(By.xpath("//span[text()='Test Automation Practice' ]"));

        Assert.assertTrue(!heading.isDisplayed(),"Element not visible");
        driver.quit();
            }
}
