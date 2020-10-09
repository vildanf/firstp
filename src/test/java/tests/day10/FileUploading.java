package tests.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.BrowserFactory;
import util.BrowserUtils;

public class FileUploading {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
    }

    @Test(description = "Verify that file was uploade")
    public void test1() {
        driver.findElement(By.linkText("File Upload")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:/Users/vilda/OneDrive/Desktop/leap year.jpg");

        driver.findElement(By.id("file-submit")).click();
        BrowserUtils.wait(4);
        String expectedFileName="leap year.jpg";
        String actual= driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actual,expectedFileName,"not work");


    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
