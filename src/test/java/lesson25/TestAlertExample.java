package lesson25;

import init.WebDriverInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestAlertExample extends WebDriverInit {

    @Test
    public void testAlert() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("alert('Are you sure?')");
        Thread.sleep(1500);

        driver.switchTo().alert().accept();
        Thread.sleep(1500);
        //prompt("Please enter your name", "Harry Potter");
        //confirm("Press a button!\nEither OK or Cancel.")
    }
}
