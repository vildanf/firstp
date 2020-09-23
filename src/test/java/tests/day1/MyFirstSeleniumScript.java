package tests.day1;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class MyFirstSeleniumScript {

    public static void main(String[] args) {
        System.out.println("Test began...");
        WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        String actualResult = driver.getTitle();
        String expectedResult = "Google";

        if (actualResult.equals(expectedResult)) {
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
            }
        driver.close();
        }
        //driver.findElement(By.name("q")).sendKeys("Java");


    }

