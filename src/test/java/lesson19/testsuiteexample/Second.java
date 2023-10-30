package lesson19.testsuiteexample;

import org.testng.annotations.Test;

public class Second {

    @Test
    public void testFromSecondClass(){
        System.out.println("First test from second class. Test is running in thread  " + Thread.currentThread().getId());
    }
}
