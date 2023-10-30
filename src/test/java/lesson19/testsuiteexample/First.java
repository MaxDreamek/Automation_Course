package lesson19.testsuiteexample;

import org.testng.annotations.Test;

public class First {
    @Test
    public void testFromFirstClass(){
        System.out.println("First test from first class. Test is running in thread  " + Thread.currentThread().getId());
    }

    @Test
    public void secondTestFromFirstClass(){
        System.out.println("First test from first class. Test is running in thread  " + Thread.currentThread().getId());
    }
}
