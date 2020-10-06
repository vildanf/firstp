package tests.day7;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TEstNgDEmo {
 @BeforeTest
 public  void beforeTEst(){
     System.out.println("Before test");
 }

@BeforeClass
public void beforeClass(){
    System.out.println("Before class");
}
@BeforeMethod
public void setuP(){
    System.out.println("BEfore method");

}

    @Test(priority = 3)
    public void test1(){
        String word1="java";
        String word2="java";
        System.out.println( "TEst1");
        Assert.assertEquals(word1,word2);
        throw new SkipException("Skipped");
    }
    @Test(priority = 2)
    public void test2(){
        String word1="javascript";
        String word2="java";
        System.out.println( "TEst2");
        Assert.assertEquals(word1,word2);

    }
    @Test(priority = 1)
    public void test3(){
        Assert.assertTrue(5>10);
    }
}
