package tests.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.BrowserFactory;
import util.BrowserUtils;

import java.util.List;

public class Dropdowns {
    private WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Dropdown")).click();
    }
@Test(description = "Select option 2 from dropdown")
    public void test1(){
        // to work with select dropdows we need to use Select class in selenium
        // step 1:find dropdown and create a welelement

    WebElement dropdown=driver.findElement(By.id("dropdown"));
    // step2 create a select object
    //Select class requires web element object as a parameter
    Select select=new Select(dropdown);
    // to select any option by visible text
    // also you can select by value, or index
    //<option value="1">Option 1</option> value is 1, visible text is Option 1
    select.selectByVisibleText("Option 2");
    BrowserUtils.wait(2);
// how to verfy that option 2 is selected
    //select.getFirstSelection-to get selected option
    Assert.assertEquals(select.getFirstSelectedOption().getText(),"Option 2");

    }

    @Test(description = "Print list of states")
    public void test2(){
WebElement state=driver.findElement(By.id("state"));
Select select= new Select(state);
List<WebElement> states =select.getOptions();
for(WebElement option: states){
    System.out.println(option.getText());
}

    }
    @Test(description = "Select your state and verify it is selected")
    public void test3(){
        WebElement state= driver.findElement(By.id("state"));
        Select select =new Select(state);
        select.selectByValue("MD");
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Maryland");
    }
        @AfterMethod
        public void teardown() {
            driver.quit();
        }
    }

