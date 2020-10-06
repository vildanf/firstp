package tests.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.BrowserFactory;

public class RadioButtons {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Radio Buttons")).click();
    }
    @Test(description = "Ve rify that blue button is selected")
    public void test1(){

        WebElement blueButton = driver.findElement(By.id("blue"));
        // if button is selected it will return true
        Assert.assertTrue(blueButton.isSelected());
    }

    @Test(description = "Verify that red button is not selected")
        public void test2(){
        WebElement redButton = driver.findElement(By.id("red"));
        Assert.assertFalse(redButton.isSelected());

    }

    @Test(description = "Verify that red button is not selected")
    public void test3(){
        WebElement yellowButton = driver.findElement(By.id("yellow"));
        Assert.assertFalse(yellowButton.isSelected());

    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }


}
