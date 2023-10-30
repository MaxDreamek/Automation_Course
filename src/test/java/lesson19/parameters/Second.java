package lesson19.parameters;



import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Second {


    @Parameters({"user", "password"})
    @Test
    public void testFromSecondClass(String user, String password){
        System.out.println("First test from second class. Test is running in thread  " + Thread.currentThread().getId());
        System.out.println(user);
        System.out.println(password);
    }
}
