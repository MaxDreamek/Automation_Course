import org.testng.annotations.Test;
import pageobject.init.WebDriverInit;

public class TestForConflict extends WebDriverInit {
    @Test
    public void changes(){
        System.out.println("123");
        driver.get("https://rozetka.com.ua/");
    }
}
