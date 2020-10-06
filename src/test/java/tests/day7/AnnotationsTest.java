package tests.day7;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsTest {

    @BeforeClass
    // run only once before before method and before all tests
    public void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void setUp(){
      // some code that will e running before every test
      // we can use ethod with @beforemethod annotation
        System.out.println("Before method");

    }
    //runs only ones aftermethod and after all tests
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

    @AfterMethod
    // runs automatically after every test
    public void teardown(){
        System.out.println("After method");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
        Assert.assertTrue(5==5);
    }

    @Test
    public void test2(){
        System.out.println("Test 2");

    }

    @Test
    public void test3(){
        System.out.println("Test 3");

    }





}
