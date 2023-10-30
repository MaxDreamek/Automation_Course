package lesson19.group;

import org.testng.annotations.Test;

public class First {
    @Test(groups = "our-group")
    public void testFromFirstClass(){
        System.out.println("First test from first class. Test is running in thread  " + Thread.currentThread().getId());
    }

    @Test
    public void secondTestFromFirstClass(){
        System.out.println("First test from first class. Test is running in thread  " + Thread.currentThread().getId());
    }
}
