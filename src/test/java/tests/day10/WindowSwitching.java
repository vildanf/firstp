package tests.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.BrowserFactory;
import util.BrowserUtils;

import java.util.Set;

public class WindowSwitching {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");

    }
    @Test
    public void test1(){
    driver.findElement(By.linkText("New tab")).click();
        BrowserUtils.wait(4);
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Practice","title is wrong");
    }



    @Test(description = "Verify tha user is able to see new window ")
        public void test2(){
        driver.findElement(By.linkText("New tab")).click();
        //record id of the original window
        String oldWindow=driver.getWindowHandle();
        BrowserUtils.wait(5);
        Set<String> windowHandles=driver.getWindowHandles();
        for(String windowHandle: windowHandles){
            if(!windowHandle.equals(oldWindow)){
                driver.switchTo().window(windowHandle);
            }
        }
        //lets verify that of new window is fresh tab
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Fresh tab","Title is wrong");
        // comeback original page
        //we can build a function that will jump in between windows
        // based on the page title
        String pageTitle="Practice";
        for(String windowHande:windowHandles){
            driver.switchTo().window(windowHande);
            if(driver.getTitle().equals(pageTitle)){
                break;
            }
        }
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }


}
