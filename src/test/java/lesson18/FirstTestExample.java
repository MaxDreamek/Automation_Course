package lesson18;

import jdk.jfr.Description;
import org.testng.annotations.*;

public class FirstTestExample {

    @BeforeTest
    public void beforeTest(){
        System.out.println("This method will execute before first test once");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This method will execute before class once");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This method will execute before each test method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("This method will execute after each test method");
    }
    @Test(description = "this our second test", priority = 1, timeOut = 100, invocationCount = 5)
    public void testMethod(){
        System.out.println("Hello world");
    }

    @Test(description ="this our second test", enabled = false)
    public void testMethod2(){
        System.out.println("Hello world Method 2");
    }
    @Test(alwaysRun = true, dependsOnMethods = "testMethod", priority = 2)
    public void testMethod3(){
        System.out.println("Hello world");
    }


    @Test(expectedExceptions = {ArithmeticException.class})
    public void testDivision(){
        System.out.println(2 / 0);
    }
}
