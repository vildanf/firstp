package tests.day9_review;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.BrowserFactory;

public class TestNgReview {
   private WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.out.println("Before method");
        driver= BrowserFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("After method");
        driver.quit();
    }


    @Test(description = "Verift title of google.com")
    public void test1() {
        System.out.println("Test 1");
        driver.get("http://google.com");
        String expectedTitle="Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle," title is not correct");
    }
@Test(description = "Verify title of apple.com",priority = 1)
    public void verifyApplesPAgeTitle(){
    System.out.println("Test 2");
    driver.get("https://www.apple.com/");
    String expectedTitle="Apple";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle," title is not correct");
    System.out.println("Test Passed");

    }

    @DataProvider(name="testData")
    public static Object[][] testData(){
        return new Object[][]{{"https://www.apple.com/","Apple"},{"http://google.com","Google"}};
    }

    @Test(dataProvider = "testData")
    public void testWithDataProvider(String url, String title){
        driver.get(url);
        Assert.assertEquals(driver.getTitle(),title);

    }
}